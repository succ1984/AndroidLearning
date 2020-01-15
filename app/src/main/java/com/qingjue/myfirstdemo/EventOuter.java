package com.qingjue.myfirstdemo;

import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EventOuter implements View.OnClickListener {

    private TextView textShow;
    //把文本框作为参数传入
    public EventOuter(TextView tv){
        textShow=tv;
    }
    @Override
    public void onClick(View v) {
        //点击后设置文本框显示的文字
        textShow.setText("外部类点击");
    }
}
