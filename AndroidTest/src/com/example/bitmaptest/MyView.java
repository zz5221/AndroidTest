package com.example.bitmaptest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class MyView extends View {

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        int viewWidth = this.getWidth();
        canvas.drawCircle(viewWidth / 10 + 10, viewWidth / 10 + 10,
                viewWidth / 10, paint);
        canvas.drawRect(10, viewWidth / 5 + 20, viewWidth / 5 + 10,
                viewWidth * 2 / 5 + 20, paint);
        canvas.drawRect(10, viewWidth * 2 / 5 + 30, viewWidth / 5 + 10,
                viewWidth / 2 + 30, paint);
        RectF re1 = new RectF(10, viewWidth / 2 + 40, 10 + viewWidth / 5,
                viewWidth * 3 / 5 + 40);
        canvas.drawRoundRect(re1, 15, 15, paint);
        RectF re11 = new RectF(10, viewWidth * 3 / 5 + 50, 10 + viewWidth / 5,
                viewWidth * 7 / 10 + 50);
        canvas.drawOval(re11, paint);
        Path path1 = new Path();
        path1.moveTo(10, viewWidth * 9 / 10 + 60);
        path1.lineTo(viewWidth / 5 + 10, viewWidth * 9 / 10 + 60);
        path1.lineTo(viewWidth / 10 + 10, viewWidth * 7 / 10 + 60);
        path1.close();
        canvas.drawPath(path1, paint);
        // 设置填充风格
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(viewWidth * 3 / 10 + 20, viewWidth / 10 + 10,
                viewWidth / 10, paint);
        canvas.drawRect(viewWidth / 5 + 20, viewWidth / 5 + 20,
                viewWidth * 2 / 5 + 20, viewWidth * 2 / 5 + 20, paint);
        canvas.drawRect(viewWidth / 5 + 20, viewWidth * 2 / 5 + 30,
                viewWidth * 2 / 5 + 20, viewWidth / 2 + 30, paint);
        RectF re2 = new RectF(viewWidth / 5 + 20, viewWidth / 2 + 40,
                viewWidth * 2 / 5 + 20, viewWidth * 3 / 5 + 40);
        canvas.drawRoundRect(re2, 15, 15, paint);
        RectF re3 = new RectF(viewWidth / 5 + 20, viewWidth * 3 / 5 + 50,
                viewWidth * 2 / 5 + 20, viewWidth * 7 / 10 + 50);
        canvas.drawOval(re3, paint);
        Path path2 = new Path();
        path2.moveTo(viewWidth / 5 + 20, viewWidth * 9 / 10 + 60);
        path2.lineTo(viewWidth * 2 / 5 + 20, viewWidth * 9 / 10 + 60);
        path2.lineTo(viewWidth * 3 / 10 + 20, viewWidth * 7 / 10 + 60);
        path2.close();
        canvas.drawPath(path2, paint);
        // 设置渐变器
        Shader mShader = new LinearGradient(0, 0, 40, 60, new int[] {
                Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW }, null,
                Shader.TileMode.REPEAT);
        paint.setShader(mShader);
        paint.setShadowLayer(25, 20, 20,Color.GRAY);
        canvas.drawCircle(viewWidth/2+30, viewWidth/10+10,viewWidth/10, paint);
        // 绘制字符串
        paint.setTextSize(48);
        paint.setShader(null);
        canvas.drawText("圆形",60+viewWidth*3/5,viewWidth/10+10, paint);
    }
}
