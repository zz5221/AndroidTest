package com.example.bitmaptest;

import java.io.InputStream;

import com.example.service.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView image;
    String[] images = null;
    int currentImg = 0;
    AssetManager assets = null;

    @SuppressLint("WrongCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.bitmapactivity_main);
//        image = (ImageView) findViewById(R.id.imageView1);
//        try {
//            assets = getAssets();
//            images = assets.list("");
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//        Button next = (Button) findViewById(R.id.button1);
//        next.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                if (currentImg >= images.length) {
//                    currentImg = 0;
//                }
//                while (!images[currentImg].endsWith(".png")
//                        && !images[currentImg].endsWith(".jpg")
//                        && !images[currentImg].endsWith(".gif")) {
//                    currentImg ++;
//                    if (currentImg >= images.length) {
//                        currentImg = 0;
//                    }
//                }
//                    InputStream assetsFile = null;
//                    try {
//                        assetsFile = assets.open(images[currentImg++]);
//                        
//                    } catch (Exception e) {
//                        // TODO: handle exception
//                    }
//                    BitmapDrawable bitmapDrawable = (BitmapDrawable) image.getDrawable();
//                    if(bitmapDrawable !=null && !bitmapDrawable.getBitmap().isRecycled()){
//                        bitmapDrawable.getBitmap().recycle();
//                    }
//                    image.setImageBitmap(BitmapFactory.decodeStream(assetsFile));
//            }
//        });
        setContentView(new PathView(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
