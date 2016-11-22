package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class BindService extends Service {
    private int count;
    private boolean quit;
    private Mybind binder = new Mybind();

    public class Mybind extends Binder {
        public int getCount() {
            //获取Service 的运行状态；conut
            return count;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        System.out.println("Services is Bind");
        return binder;
    }
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        System.out.println("Service is created");
        new Thread(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                super.run();
                while(!quit){
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    count++;
                }
            }
            
        }.start();
    }
    @Override
    public boolean onUnbind(Intent intent) {
        // TODO Auto-generated method stub
        System.out.println("Service is unBind");
        return true;
    }
    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        this.quit = true;
        System.out.println("Service is Destroyed");
    }
}
