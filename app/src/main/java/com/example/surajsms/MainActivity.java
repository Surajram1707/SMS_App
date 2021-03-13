package com.example.surajsms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button send;
    EditText phn,msg;
    String number,content;
    SmsManager sms;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send=(Button)findViewById(R.id.button);
        phn =(EditText)findViewById(R.id.phone);
        msg = (EditText)findViewById(R.id.msg);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=phn.getText().toString();
                sms =SmsManager.getDefault();
                content=msg.getText().toString();
                sms.sendTextMessage(number,null,content,null,null);
                Toast.makeText(MainActivity.this,"SMS SENT",Toast.LENGTH_LONG).show();
            }
        });
    }
}