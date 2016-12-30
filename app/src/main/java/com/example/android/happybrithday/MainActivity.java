package com.example.android.happybrithday;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View view){
        Context context = getApplicationContext();
        CharSequence text = "热门电影";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } public void click2(View view){
        Context context = getApplicationContext();
        CharSequence text = "股票雄鹰";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } public void click3(View view){
        Context context = getApplicationContext();
        CharSequence text = "XYZ阅读器";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } public void click4(View view){
        Context context = getApplicationContext();
        CharSequence text = "最新闻";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    } public void click5(View view){
        Context context = getApplicationContext();
        CharSequence text = "毕业设计";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
