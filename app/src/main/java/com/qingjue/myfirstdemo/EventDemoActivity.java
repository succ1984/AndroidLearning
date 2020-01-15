package com.qingjue.myfirstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EventDemoActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_demo);
        Button btnClickMe=(Button)findViewById(R.id.btnClickMe);
        TextView tvText=(TextView)findViewById(R.id.tvText);
  /*      btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"点击了按钮", Toast.LENGTH_LONG).show();
            }
        });
        btnClickMe.setOnClickListener(new BtnClickListener());
        btnClickMe.setOnClickListener(new EventOuter(tvText));*/
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "直接使用Activity作为事件监听器方式：点击了按钮", Toast.LENGTH_SHORT).show();
    }

    //自定义一个方法,传入一个view组件作为参数
    public void myClick(View source)
    {
        Toast.makeText(getApplicationContext(), "直接绑定到标签：按钮被点击了", Toast.LENGTH_SHORT).show();
    }
    //定义一个内部类,实现View.OnClickListener接口,并重写onClick()方法
    class BtnClickListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "内部类按钮被点击了", Toast.LENGTH_SHORT).show();
        }
    }
}
