package com.qingjue.myfirstdemo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.qingjue.myfirstdemo.R;
import com.qingjue.myfirstdemo.Service.TestService1;

public class ServiceTest extends AppCompatActivity {
    private Button start;
    private Button stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_test);
        start = (Button) findViewById(R.id.btnStart);
        stop = (Button) findViewById(R.id.btnStop);
        //创建启动Service的Intent,以及Intent属性
        final Intent intent = new Intent();

        intent.setAction("com.qingjue.myfirstdemo.Service.TestService1");
        intent.setPackage(this.getPackageName());    //兼容Android 5.0

        //Intent intent = new Intent(com.qingjue.myfirstdemo.Service.TestService1.class);

        //为两个按钮设置点击事件,分别是启动与停止service
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(intent);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
            }
        });
    }


}
