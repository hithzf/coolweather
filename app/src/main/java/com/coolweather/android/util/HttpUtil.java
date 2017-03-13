package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by hzf on 2017/3/10.
 */

public class HttpUtil {

    /**
     * 发起http请求
     * @param address 请求地址
     * @param callback 回调接口，在调用sendOkHttpRequest时需要实现该接口
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
