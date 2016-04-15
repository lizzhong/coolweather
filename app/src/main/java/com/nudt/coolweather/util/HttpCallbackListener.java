package com.nudt.coolweather.util;

/**
 * Created by li on 2016/3/23.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
