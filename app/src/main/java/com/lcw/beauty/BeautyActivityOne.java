package com.lcw.beauty;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.ImageView;
import android.widget.SeekBar;

/**
 * ColorMatrix效果演示
 */
public class BeautyActivityOne extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private ImageView mImageView;
    private AppCompatSeekBar mRotateSeekBar;
    private AppCompatSeekBar mSaturationSeekBar;
    private AppCompatSeekBar mScaleSeekBar;


    private Bitmap mBitmap;
    private float mRotate;
    private float mSaturation;
    private float mScale;

    private static int MIN_PROGRESS = 128;
    private static int MAX_PROGRESS = 255;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_one);

        mImageView = findViewById(R.id.imageView);
        mRotateSeekBar = findViewById(R.id.seekBar_rotate);
        mSaturationSeekBar = findViewById(R.id.seekBar_saturation);
        mScaleSeekBar = findViewById(R.id.seekBar_scale);

        mRotateSeekBar.setOnSeekBarChangeListener(this);
        mSaturationSeekBar.setOnSeekBarChangeListener(this);
        mScaleSeekBar.setOnSeekBarChangeListener(this);

        mRotateSeekBar.setMax(MAX_PROGRESS);
        mSaturationSeekBar.setMax(MAX_PROGRESS);
        mScaleSeekBar.setMax(MAX_PROGRESS);

        mRotateSeekBar.setProgress(MIN_PROGRESS);
        mSaturationSeekBar.setProgress(MIN_PROGRESS);
        mScaleSeekBar.setProgress(MIN_PROGRESS);


        mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.test);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.seekBar_rotate:
                mRotate = (mRotateSeekBar.getProgress() - 128f) * 1.0f / 128f * 180;
                break;
            case R.id.seekBar_saturation:
                mSaturation = mSaturationSeekBar.getProgress() / 128f;
                break;
            case R.id.seekBar_scale:
                mScale = mScaleSeekBar.getProgress() / 128f;
                break;
        }

        if (mBitmap != null) {
            Bitmap bitmap = BeautyUtil.beautyImage(mBitmap, mRotate, mSaturation, mScale);
            mImageView.setImageBitmap(bitmap);
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
