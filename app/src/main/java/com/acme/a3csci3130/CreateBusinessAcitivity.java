package com.acme.a3csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateBusinessAcitivity extends Activity {

    private Button submitButton;
    private EditText business_numberField, nameField, primary_businessField, addressField, province_territoryField;
    private MyApplicationData appState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_business_acitivity);
        //Get the app wide shared variables
        appState = ((MyApplicationData) getApplicationContext());

        submitButton = (Button) findViewById(R.id.submitButton);
        business_numberField = (EditText) findViewById(R.id.business_number);
        nameField = (EditText) findViewById(R.id.name);
        primary_businessField = (EditText) findViewById(R.id.primary_business);
        addressField = (EditText) findViewById(R.id.address);
        province_territoryField = (EditText) findViewById(R.id.province_territory);
    }

    public void submitInfoButton(View v) {
        //A unique number is required for each business.
        String b_num = appState.firebaseReference.push().getKey();
        String name = nameField.getText().toString();
        String p_bus = primary_businessField.getText().toString();
        String adddress = addressField.getText().toString();
        String province_territory = province_territoryField.getText().toString();
        Business business = new Business(b_num, name, p_bus, adddress, province_territory);

        appState.firebaseReference.child(b_num).setValue(business);

        finish();

    }
}
