package com.mobidev.mpesa;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class BuyAirtimeActivity extends AppCompatActivity {

    private Button btnMyPhone, btnOtherPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_airtime);

        btnMyPhone = (Button) findViewById(R.id.my_phone);
        btnMyPhone.setOnClickListener(btnClickListener);
        btnOtherPhone = (Button) findViewById(R.id.other_phone);
        btnOtherPhone.setOnClickListener(btnClickListener);

    }

    View.OnClickListener btnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.my_phone:
                    startActivity(new Intent(getApplicationContext(), AmountActivity.class));
                    break;
                case R.id.other_phone:
                    startActivity(new Intent(getApplicationContext(), PhoneNoActivity.class));
                    break;
                default:
                    break;
            }
        }
    };


}
