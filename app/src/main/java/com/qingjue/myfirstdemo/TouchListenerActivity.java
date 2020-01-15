package com.qingjue.myfirstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TouchListenerActivity extends AppCompatActivity {
    private ImageView imgtouch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_listener);

        imgtouch = findViewById(R.id.imgTouch);
        imgtouch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                String actionString=MotionEvent.actionToString(event.getAction());
                float x=event.getX();
                float y=event.getY();
                Toast.makeText(getApplicationContext(),"你通过监听器模式:OnTouchListener摸了伦家~".concat(",ActionString："+actionString+"X："+x+"，Y："+y),Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}
