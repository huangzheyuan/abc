package com.example.myapplication10;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface itenerce {
    @POST("fapig/douyin/billboard")
    @FormUrlEncoded
    Call<JsonRootBean> shipin(@Field("type") String type,@Field("size") String size,@Field("key") String key );
}
