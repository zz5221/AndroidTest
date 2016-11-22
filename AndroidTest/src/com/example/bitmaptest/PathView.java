package com.example.bitmaptest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.DiscretePathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.view.View;

public class PathView extends View {
    int[] colors;
    PathEffect[] effects = new PathEffect[4];
    private Paint paint;
    private Path path;
    float phase;
    public PathView(Context arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        // 创建并初始化Path
        path = new Path();
        path.moveTo(0, 0);
        for (int i = 1; i <= 40; i++) {
            path.lineTo(i * 20, (float) Math.random() * 60);
        }
        colors = new int[] { Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN,
                Color.MAGENTA, Color.RED, Color.YELLOW };
        
    }
    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        effects[0] = null;
        effects[1] = new CornerPathEffect(10);
        effects[2] = new DiscretePathEffect(3.0f,5.0f);
        effects[3] = new DashPathEffect(new float[]{20,10,5,10},phase);
        for (int i = 0; i < effects.length; i++) {
            paint.setPathEffect(effects[0]);
            paint.setColor(colors[i]);
            canvas.drawPath(path, paint);
            canvas.translate(0, 60);
        }
    }

}
