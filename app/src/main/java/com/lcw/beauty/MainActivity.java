package com.lcw.beauty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

        findViewById(R.id.btn_Demo1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeautyActivityOne.class));
            }
        });

        findViewById(R.id.btn_Demo2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeautyActivityTwo.class));
            }
        });

        findViewById(R.id.btn_Demo3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeautyActivityThree.class));
            }
        });

        findViewById(R.id.btn_Demo4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BeautyActivityFour.class));
            }
        });
    }
}
