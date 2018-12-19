package com.example.gavwan01.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private TextView tv_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout02);
/*
        tv_hello = (TextView) findViewById(R.id.tv_chat_win);
        tv_hello.setOnClickListener(this);
        tv_hello.setOnLongClickListener(this);
        tv_hello.setGravity(Gravity.LEFT|Gravity.BOTTOM);
        tv_hello.setLines(8);
        tv_hello.setMaxLines(8);
        tv_hello.setMovementMethod(new ScrollingMovementMethod());
        tv_hello.setText("中国你好");
        tv_hello.setTextColor(0x67890548);
        tv_hello.setTextSize(40);
        tv_hello.setBackgroundColor(Color.YELLOW);
       */
    }

    public void onClick(View v) {
        if (v.getId() == R.id.tv_chat_win) {
            String newStr=String.format("%s\n%s%s", tv_hello.getText().toString(), "20120909", "wo re ai zu guo!!!!!");
            tv_hello.setText(newStr);
        }
    }

    public boolean onLongClick(View v) {
        if (v.getId() == R.id.tv_chat_win) {
            tv_hello.setText("");
        }
        return true;

    }

}
