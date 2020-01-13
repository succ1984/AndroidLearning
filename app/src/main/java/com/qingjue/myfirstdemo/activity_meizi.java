package com.qingjue.myfirstdemo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class activity_meizi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meizi);
        FrameLayout frame = (FrameLayout) findViewById(R.id.layoutmeizi);
        final MeiziView meizi = new MeiziView(activity_meizi.this);
        //为我们的萌妹子添加触摸事件监听器
        meizi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                //设置妹子显示的位置
                meizi.bitmapX = event.getX() - 150;
                meizi.bitmapY = event.getY() - 150;
                //调用重绘方法
                meizi.invalidate();
                return true;
            }
        });
        frame.addView(meizi);
    }

}
