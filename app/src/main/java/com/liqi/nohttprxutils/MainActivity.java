package com.liqi.nohttprxutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.liqi.nohttprxutils.download.DownloadFileActivity;

/**
 * 首页面，此页面用的是最LOW的方法实现的。请勿吐槽
 * Created by LiQi on 2016/12/30.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    /**
     * 初始化页面
     */
    private void initView() {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:// GET-POST请求演示
                startActivity(new Intent(this, GetPostDemoActivity.class));
                break;
            case R.id.button1:// 图片请求演示
                startActivity(new Intent(this, ImageDownloadDemoActivity.class));
                break;
            case R.id.button2:// 文件上传请求演示
                startActivity(new Intent(this, FileUploadingDemoActivity.class));
                break;
            case R.id.button3:// Https协议演示
                startActivity(new Intent(this, HttpsDemoActivity.class));
                break;
            case R.id.button4:// 文件下载演示
                startActivity(new Intent(this, DownloadFileActivity.class));
                break;
            case R.id.button5:// 多请求队列演示
                startActivity(new Intent(this, RequestQueueDemoActivity.class));
                break;
            case R.id.button6:// 轮询请求演示界面
                startActivity(new Intent(this, PollDemo.class));
                break;
        }
    }
}
