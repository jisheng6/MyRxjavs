package com.example.adminjs.myrxjavs;

/**
 * Created by muhanxi on 17/12/5.
 */

public class BasePresenter<V> {


    // V 相当于V的接口
    public V view;


    /**
     *  Presenter 持有View 的接口
     * @param v
     */
    public void attach(V v){
        this.view = v ;
    }


    /**
     * Presenter 释放持有View的接口， 防止内存泄漏
     */
    public void detach(){
        this.view = null;
    }

}
