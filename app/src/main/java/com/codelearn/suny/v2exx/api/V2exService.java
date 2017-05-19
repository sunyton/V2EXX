package com.codelearn.suny.v2exx.api;

import com.codelearn.suny.v2exx.Bean.LastestBean;
import com.codelearn.suny.v2exx.Bean.TPComment;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by suny on 2017/5/18.
 */

public interface V2exService {

    @GET("topics/latest.json")
    Call<List<LastestBean>> getlast();

    @GET("topics/show.json")
    Call<List<LastestBean>> getNode(@Query("node_name") String node_name);

    @GET("replies/show.json")
    Call<List<TPComment>> getComment(@Query("topic_id") String topic_id);





}
