package com.example.adminjs.myrxjavs;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by muhanxi on 17/12/5.
 */

public class LoginModelImpl {


    public void getData(final LoginModelCallBack callBack){


        Map<String,String> map = new HashMap<>();
        map.put("key","71e58b5b2f930eaf1f937407acde08fe");
        map.put("num","10");

        IApplication.iInterface.get(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Bean>() {
                    @Override
                    public void accept(Bean bean) throws Exception {
                        callBack.success(bean);
                    }
                });

    }
}
