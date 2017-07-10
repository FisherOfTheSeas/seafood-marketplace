package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DetailViewActivity extends Activity {

    private EditText business_numberField, nameField;
    Business receivedBusinessInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);
        receivedBusinessInfo = (Business) getIntent().getSerializableExtra("Business");

        business_numberField = (EditText) findViewById(R.id.business_number);
        nameField = (EditText) findViewById(R.id.name);


        if(receivedBusinessInfo != null){
            business_numberField.setText(receivedBusinessInfo.b_num);
            nameField.setText(receivedBusinessInfo.name);
        }
    }

    public void updateBusiness(View v){
        //TODO: Update business functionality
    }

    public void eraseContact(View v)
    {
        //TODO: Erase contact functionality
    }
}
