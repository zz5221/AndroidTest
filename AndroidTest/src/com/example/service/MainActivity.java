package com.example.service;

import android.os.Bundle;
import android.os.IBinder;
import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
    BindService.Mybind binder;
    private Button bind, unbind, getServiceStatus;
    private Intent intent = null;
    private ServiceConnection conn = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            // TODO Auto-generated method stub
            System.out.println("--services connected--");
            binder = (BindService.Mybind) service;
        }
        @Override
        public void onServiceDisconnected(ComponentName name) {
            // TODO Auto-generated method stub
            System.out.println("--services disconnected--");
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this,BindService.class);
        initView();
    }

    private void initView() {
        bind = (Button) findViewById(R.id.button1);
        unbind = (Button) findViewById(R.id.button2);
        getServiceStatus = (Button) findViewById(R.id.button3);
        bind.setOnClickListener(this);
        unbind.setOnClickListener(this);
        getServiceStatus.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int id = v.getId();
        switch (id) {
        case R.id.button1:
            bindService(intent, conn,Service.BIND_AUTO_CREATE);
            Toast.makeText(MainActivity.this, "Service bind",Toast.LENGTH_SHORT).show();
            break;
        case R.id.button2:
            Toast.makeText(MainActivity.this, "Service 的 Count值为"+binder.getCount(),Toast.LENGTH_SHORT).show();
            break;
        case R.id.button3:
            unbindService(conn);
            Toast.makeText(MainActivity.this, "Service unbind",Toast.LENGTH_SHORT).show();
            break;
        default:
            break;
        }
    }

}
