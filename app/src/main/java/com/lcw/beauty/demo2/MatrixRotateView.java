package com.lcw.beauty.demo2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.lcw.beauty.R;

/**
 * 图像的旋转
 * Create by: chenWei.li
 * Date: 2018/11/16
 * Time: 下午11:56
 * Email: lichenwei.me@foxmail.com
 */
public class MatrixRotateView extends View {

    private Bitmap mBitmap;

    public MatrixRotateView(Context context) {
        super(context);
        initView(context);
    }

    public MatrixRotateView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public MatrixRotateView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        mBitmap = BitmapFactory.decodeResource(context.getResources(), R.mipmap.icon);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (mBitmap != null) {
            canvas.drawBitmap(mBitmap, 0, 0, null);

            Matrix matrix = new Matrix();
            matrix.setRotate(20);
            canvas.drawBitmap(mBitmap, matrix, null);
        }
    }
}
