package com.lcw.beauty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lcw.beauty.demo1.BeautyActivityFour;
import com.lcw.beauty.demo1.BeautyActivityOne;
import com.lcw.beauty.demo1.BeautyActivityThree;
import com.lcw.beauty.demo1.BeautyActivityTwo;

/**
 * Create by: chenWei.li
 * Date: 2018/11/11
 * Time: 上午11:29
 * Email: lichenwei.me@foxmail.com
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty);

        findViewById(R.id.btn_One).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeautyActivityOne.class));
            }
        });

        findViewById(R.id.btn_Two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeautyActivityTwo.class));
            }
        });

        findViewById(R.id.btn_Three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeautyActivityThree.class));
            }
        });

        findViewById(R.id.btn_Four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeautyActivityFour.class));
            }
        });
    }
}
