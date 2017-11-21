package com.liqi.nohttputils.interfa;

/**
 * 是否请求网络成功回调接口
 * Created by LiQi on 2016/12/8.
 */
public interface OnIsRequestListener<T> {

    /**
     * 请求成功
     */
    void onNext(T response);

    /**
     * 请求失败
     */
    void onError(Throwable e);
}
