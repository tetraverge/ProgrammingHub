package com.hub.programminghub;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_Activity extends AppCompatActivity {

   private Button loginbtn,registerbtn;
   private EditText logintput_txt, pass_input_txt;

   private FirebaseAuth mAuth;
    private ProgressDialog loadingbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbtn = (Button) findViewById(R.id.loginbtn);
        registerbtn = (Button) findViewById(R.id.registerbtn);
        logintput_txt =(EditText) findViewById(R.id.login_emailinput);
        pass_input_txt=(EditText) findViewById(R.id.login_passinput);
        mAuth = FirebaseAuth.getInstance();
        loadingbar = new ProgressDialog(this);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginAllowuser();
            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this,RegisterActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
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



    private void loginAllowuser() {


        if (TextUtils.isEmpty(logintput_txt.getText().toString()))
        {
            Toast.makeText(Login_Activity.this,"Please Enter Your Email", Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(pass_input_txt.getText().toString()))
        {
            Toast.makeText(Login_Activity.this,"Please Enter Your Password", Toast.LENGTH_LONG).show();
        }
        else {
            String useemail = logintput_txt.getText().toString();
            String userpass = pass_input_txt.getText().toString();

                loadingbar.setTitle("Login Account");
                loadingbar.setMessage("Please wait login your account");
                loadingbar.show();
                loadingbar.setCanceledOnTouchOutside(true);
                mAuth.signInWithEmailAndPassword(useemail,userpass)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (task.isSuccessful())
                                {
                                    loadingbar.dismiss();
                                    Toast.makeText(Login_Activity.this,"Successful ", Toast.LENGTH_LONG).show();
                                    sendusertoMainActivity();
                                }else {
                                    loadingbar.dismiss();
                                    String exceptioMassage = task.getException().getMessage();
                                    Toast.makeText(Login_Activity.this,"Error "+ exceptioMassage, Toast.LENGTH_LONG).show();
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
