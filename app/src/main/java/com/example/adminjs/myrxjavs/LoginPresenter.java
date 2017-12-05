package com.example.adminjs.myrxjavs;

/**
 * Created by muhanxi on 17/12/5.
 */

public class LoginPresenter  extends BasePresenter<LoginView> {

    public LoginModelImpl loginModel ;

    public LoginPresenter(){
        this.loginModel = new LoginModelImpl();

    }


    public void login(String username,String password){


        //  判断

//        view.success();

        loginModel.getData(new LoginModelCallBack() {
            @Override
            public void success(Bean bean) {
                view.success(bean);
            }
        });




    }

}
