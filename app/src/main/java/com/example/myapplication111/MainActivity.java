package com.example.myapplication111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.leon.lib.settingview.LSettingItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LSettingItem one =(LSettingItem)findViewById(R.id.item_one);

        one.setmOnLSettingItemClick(new LSettingItem.OnLSettingItemClick() {
            @Override
            public void click() {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity2 .class);
                startActivity(intent);
            }
        });
    }
}