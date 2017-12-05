package com.example.adminjs.myrxjavs;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by muhanxi on 17/12/5.
 */

public class IApplication extends Application {

    public static IInterface iInterface;

    @Override
    public void onCreate() {
        super.onCreate();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.tianapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        iInterface = retrofit.create(IInterface.class);


    }
}
