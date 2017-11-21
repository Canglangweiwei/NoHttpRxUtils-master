package com.liqi.nohttprxutils.base;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.liqi.nohttputils.interfa.DialogGetListener;
import com.liqi.nohttputils.interfa.OnIsRequestListener;

/**
 * 所有Activity的基类BaseActivity
 * 个人QQ:543945827
 * Created by LiQi on 2016/12/30.
 */
@SuppressWarnings("ALL")
public abstract class BaseActivity<T> extends AppCompatActivity
        implements DialogGetListener, OnIsRequestListener<T> {

    protected ProgressDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onCreate();
    }

    @Override
    public Dialog getDialog() {
        if (isHttpShoDialog())
            return getDialog(requestHint());
        return null;
    }

    /**
     * 获取加载框
     */
    protected ProgressDialog getDialog(String content) {
        if (null == mDialog) {
            mDialog = new ProgressDialog(this);
            mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            mDialog.setCanceledOnTouchOutside(false);
            mDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        }
        mDialog.setMessage(content);
        return mDialog;
    }

    /**
     * 手动关闭进度条加载框
     */
    protected void closeDialog() {
        if (null != mDialog && mDialog.isShowing())
            mDialog.dismiss();
    }

    /**
     * 请求网络提示语获取
     */
    protected String requestHint() {
        return "正在请求中,请稍后...";
    }

    /**
     * 是否显示网络请求加载框
     */
    private boolean isHttpShoDialog() {
        return true;
    }

    /**
     * 替代findViewById方法
     */
    protected <T extends View> T $(int id) {
        return (T) findViewById(id);
    }

    protected abstract void onCreate();

    @Override
    public void onNext(T response) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
