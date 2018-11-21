package com.lcw.beauty.demo1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.lcw.beauty.R;

/**
 * 更改像素点RGBA效果
 */
public class BeautyActivityThree extends AppCompatActivity {

    private ImageView mImageView;

    private Bitmap mBitmap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_three);
        mImageView = findViewById(R.id.imageView);

        mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.test);
        Bitmap bitmap=BeautyUtil.beautyImage(mBitmap);

        mImageView.setImageBitmap(bitmap);

    }


}
