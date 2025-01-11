package com.xjsun.knows.base.util;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RequestHttp {
    private final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build();

    public String post(String url, String jsonBody) throws IOException {
        // 创建JSON请求体
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(jsonBody, JSON);

        // 构建请求
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        // 发送请求
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }
        // 获取响应体
        return response.body().string();

    }
}
