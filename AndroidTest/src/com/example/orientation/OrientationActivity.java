package com.example.orientation;

import com.example.service.R;
import com.example.service.R.layout;
import com.example.service.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.Log;
import android.view.Menu;

/**
 * @author hanshizhe
 * 测验当Activity横竖屏切换的时候的不重新走oncreat(),onResume()方法，而走onConfigurationChanged()方法
 * （1）在Manifest中进行配置android:configChanges="orientation|screenSize"
 * （2）重写onConfigurationChanged()方法
 */
public class OrientationActivity extends Activity {
    private final String TAG = "orientation";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);
        Log.i(TAG, "onCreate()");
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.i(TAG, "onResume()");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.orientation, menu);
        return true;
    } 
    
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        // TODO Auto-generated method stub
        super.onConfigurationChanged(newConfig);
        Log.i(TAG,"onConfigurationChanged");
    }

}
