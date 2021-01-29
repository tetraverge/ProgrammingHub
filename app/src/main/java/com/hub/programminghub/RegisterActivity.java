package com.hub.programminghub;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class RegisterActivity extends AppCompatActivity {

    private Button registerbtn,chooseimage;
    private EditText emailinputtxt,passinputtxt,confirmpassinputtxt,username;
    private FirebaseAuth mAuth;
    private ProgressDialog loadingbar;
    private CircleImageView userimageView;
    private StorageReference storageRef;
    private DatabaseReference userRef;
    private static final int PICK_IMAGE_REQUEST=1;
    private Uri mImageUri;
    Uri downloadUri;
    String currentUserId;
    private StorageTask uploadTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        registerbtn =(Button) findViewById(R.id.regibtn);
        emailinputtxt =(EditText) findViewById(R.id.emailinput);
        passinputtxt =(EditText) findViewById(R.id.passinput);
        confirmpassinputtxt =(EditText) findViewById(R.id.confirmpassinput);
        userimageView = (CircleImageView) findViewById(R.id.userImage);
        chooseimage = (Button) findViewById(R.id.choseimageBtn);
        username = (EditText) findViewById(R.id.nameinput);
        loadingbar = new ProgressDialog(this);
        storageRef = FirebaseStorage.getInstance().getReference().child("UserImage"); //firebase storage
        mAuth= FirebaseAuth.getInstance();  // firebase authentication

        userRef = FirebaseDatabase.getInstance().getReference().child("Users"); // fire


        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              createnewAccount();

            }
        });

        chooseimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                filechoserImage();

            }
        });
    }
    private void filechoserImage() {

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data !=null && data.getData() != null)
        {
            mImageUri = data.getData();

                mImageUri = data.getData();
                Picasso.with(this)
                        .load(mImageUri)
                        .fit()
                        .placeholder(R.drawable.user)
                        .into(userimageView);


        }
    }

    private void putimagetostorage()
    {
        final StorageReference filepath = storageRef.child(System.currentTimeMillis() + ".jpg");
        uploadTask =  filepath.putFile(mImageUri);
        uploadTask.continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
            @Override
            public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception {
                if (!task.isSuccessful()) {
                    throw task.getException();
                }

                // Continue with the task to get the download URL
                return filepath.getDownloadUrl();
            }
        }).addOnCompleteListener(new OnCompleteListener<Uri>() {
            @Override
            public void onComplete(@NonNull Task<Uri> task) {
                if (task.isSuccessful()) {
                   downloadUri = task.getResult();
                    saveAccountInfoinDatabase();

                } else {
                    // Handle failures
                    // ...
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentuser = mAuth.getCurrentUser();
        if (currentuser!=null)
        {
            sendusertoMainActivity();
        }
    }

    private void createnewAccount() {
        String useremail = emailinputtxt.getText().toString();
        String userpass = passinputtxt.getText().toString();
        String usercnfirmpass=confirmpassinputtxt.getText().toString();

        if (mImageUri==null)
        {
            Toast.makeText(this,"Please Enter Your Profile Image", Toast.LENGTH_LONG).show();
        }
       else if (TextUtils.isEmpty(useremail))
        {
            Toast.makeText(this,"Please Enter Your Email", Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(userpass))
        {
            Toast.makeText(this,"Please Enter Your Password", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(usercnfirmpass))
        {
            Toast.makeText(this,"Please Enter Your Password Again", Toast.LENGTH_LONG).show();
        }else if (!userpass.equals(usercnfirmpass))
        {
            Toast.makeText(this,"Please retype password", Toast.LENGTH_LONG).show();
        }
        else {
            loadingbar.setTitle("Creating Account");
            loadingbar.setMessage("Please wait your account is creating");
            loadingbar.show();
            loadingbar.setCanceledOnTouchOutside(true);

                mAuth.createUserWithEmailAndPassword(useremail,userpass)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (task.isSuccessful())
                                {

                                    Toast.makeText(RegisterActivity.this,"Congratulation" +
                                                    " Successfully Registered", Toast.LENGTH_LONG).show();
                                  putimagetostorage();
                                }
                                else {
                                    loadingbar.dismiss();
                                    String erroremassage = task.getException().getMessage();
                                    Toast.makeText(RegisterActivity.this,"Error  "+erroremassage,
                                            Toast.LENGTH_LONG).show();
                                }

                            }
                        });
        }

    }

    private void saveAccountInfoinDatabase() {

        String userName = username.getText().toString();


        if (TextUtils.isEmpty(userName))
        {
            Toast.makeText(RegisterActivity.this,"Please Enter Your Name", Toast.LENGTH_LONG).show();
        }

        else {
            loadingbar.setTitle("Profile Setup");
            loadingbar.setMessage("Please Wait Saving Your Profile ...   ");
            loadingbar.show();
            loadingbar.setCanceledOnTouchOutside(true);
            HashMap userMap = new HashMap();
            userMap.put("username",userName);
            userMap.put("profileimageurl",downloadUri.toString());
            currentUserId = mAuth.getCurrentUser().getUid();
            userRef.child(currentUserId).updateChildren(userMap).addOnCompleteListener(new OnCompleteListener() {
                @Override
                public void onComplete(@NonNull Task task) {

                    if (task.isSuccessful())
                    {
                        loadingbar.dismiss();
                        sendusertoMainActivity();
                        Toast.makeText(RegisterActivity.this,"Profile Setup Successful", Toast.LENGTH_LONG).show();
                    }
                    else {
                        loadingbar.dismiss();

                        String exceptioMassage = task.getException().getMessage();
                        Toast.makeText(RegisterActivity.this,"Error "+ exceptioMassage, Toast.LENGTH_LONG).show();

                    }



                }
            });

        }

    }


    private void sendusertoMainActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}
