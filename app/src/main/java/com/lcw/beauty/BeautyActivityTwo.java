package com.lcw.beauty;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;

/**
 * 改变色调原理演示
 */
public class BeautyActivityTwo extends AppCompatActivity {

    private ImageView mImageView;
    private GridLayout mGridLayout;
    private Button mBtnOk;
    private Button mBtnReset;

    private Bitmap mBitmap;

    private EditText mEditTexts[] = new EditText[20];
    private float[] mColorMatrix = new float[20];

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_two);

        mImageView = findViewById(R.id.imageView);
        mGridLayout = findViewById(R.id.gridLayout);
        mBtnOk = findViewById(R.id.btnOk);
        mBtnReset = findViewById(R.id.btnReset);
        mGridLayout.post(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    EditText editText = new EditText(BeautyActivityTwo.this);
                    editText.setGravity(Gravity.CENTER);
                    if (i % 6 == 0) {
                        editText.setText("1");
                    } else {
                        editText.setText("0");
                    }
                    mEditTexts[i] = editText;
                    mGridLayout.addView(editText, mGridLayout.getWidth() / 5, mGridLayout.getHeight() / 4);
                }
            }
        });

        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.set(getColorMatrix());
                mImageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        });

        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.set(getInitColorMatrix());
                mImageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        });

        mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.test);
        mImageView.setImageBitmap(mBitmap);

    }

    private float[] getColorMatrix() {
        for (int i = 0; i < 20; i++) {
            mColorMatrix[i] = Float.parseFloat(mEditTexts[i].getText().toString());
        }
        return mColorMatrix;
    }

    private float[] getInitColorMatrix() {
        for (int i = 0; i < 20; i++) {
            if (i % 6 == 0) {
                mColorMatrix[i] = 1;
                mEditTexts[i].setText("1");
            } else {
                mColorMatrix[i] = 0;
                mEditTexts[i].setText("0");
            }
        }
        return mColorMatrix;
    }


}
