package com.qingjue.myfirstdemo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;

import com.qingjue.myfirstdemo.Broadcast.BroadReceiverDynamic;
import com.qingjue.myfirstdemo.R;

public class BroadReceiverDemo1 extends AppCompatActivity {

    private BroadcastReceiver myReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_receiver_demo1);

        //核心部分代码：
        myReceiver = new BroadReceiverDynamic();
        IntentFilter itFilter = new IntentFilter();
        itFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(myReceiver, itFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myReceiver);
    }

}
