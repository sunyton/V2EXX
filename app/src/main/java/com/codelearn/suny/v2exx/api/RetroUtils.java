package com.codelearn.suny.v2exx.api;

import com.codelearn.suny.v2exx.Bean.LastestBean;
import com.codelearn.suny.v2exx.Bean.TPComment;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by suny on 2017/5/19.
 */

public class RetroUtils {

    static Retrofit retrofit = new Retrofit.Builder().baseUrl("http://www.v2ex.com/api/").addConverterFactory(GsonConverterFactory.create()).build();
    static V2exService service = retrofit.create(V2exService.class);

    public static void getlatest(Callback<List<LastestBean>> callback) {

        Call<List<LastestBean>> call = service.getlast();
        call.enqueue(callback);

    }

    public static void getTopic(String topic_id, Callback<List<TPComment>> callback) {
        Call<List<TPComment>> call = service.getComment(topic_id);
        call.enqueue(callback);

    }

    public static void getNode(String node_name, Callback<List<LastestBean>> callback) {
        Call<List<LastestBean>> call = service.getNode(node_name);
        call.enqueue(callback);

    }


}

