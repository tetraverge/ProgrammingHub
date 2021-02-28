package com.hub.programminghub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

class CodeView_List_Adapter extends ArrayAdapter<DataManager> {
    private Context mContext;
    private List<DataManager> codelist = new ArrayList<>() ;

    public CodeView_List_Adapter(Context context, List<DataManager> codelist) {
        super(context, 0, codelist);
        this.mContext = mContext;
        this.codelist = codelist;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.codeview_list_adapter, parent, false);
        DataManager eventsdata = codelist.get(position);

        TextView codeTitle = (TextView) listItem.findViewById(R.id.code_titleTV);
        TextView listcount = (TextView) listItem.findViewById(R.id.countTv);
        listcount.setText(String.valueOf(position) );

        codeTitle.setText(eventsdata.getCodetitle());

        return listItem;
    }
}
