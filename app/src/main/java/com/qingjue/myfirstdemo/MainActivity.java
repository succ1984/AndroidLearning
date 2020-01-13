package com.qingjue.myfirstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }


    public void sendMessage(View view) {
        // Do something in response to button
        Button btnLogin=(Button)findViewById(R.id.btnLogin);
        Intent intent=new Intent(this,activity_meizi.class);
        EditText txtUserName=(EditText)findViewById(R.id.txtUserName);
        String userName=txtUserName.getText().toString();
        intent.putExtra(MainActivity.EXTRA_MESSAGE,userName);
        startActivity(intent);
    }

}
