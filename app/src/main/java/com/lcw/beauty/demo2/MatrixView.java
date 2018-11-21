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
 * 图像的变换演示
 * Create by: chenWei.li
 * Date: 2018/11/16
 * Time: 下午11:56
 * Email: lichenwei.me@foxmail.com
 */
public class MatrixView extends View {

    private Bitmap mBitmap;

    public MatrixView(Context context) {
        super(context);
        initView(context);
    }

    public MatrixView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public MatrixView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
            matrix.setTranslate(200, 200);
            matrix.preScale(2, 2);
            matrix.preRotate(20);
            canvas.drawBitmap(mBitmap, matrix, null);

        }
    }
}
