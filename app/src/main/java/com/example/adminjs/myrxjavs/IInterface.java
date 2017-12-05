package com.example.adminjs.myrxjavs;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by muhanxi on 17/12/5.
 */

public interface IInterface {

    @GET("/nba")
    Observable<Bean> get(@QueryMap Map<String, String> map);

    @POST("/nba")
    Observable<Bean> post(@FieldMap Map<String, String> map);

}
