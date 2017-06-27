package com.amey.androidmvp.login;

/**
 * Created by USER on 27/06/2017.
 */


/**
 * - LoginPresenter has a reference to both the View and the Interactor
 * - LoginPresenter retrieves data from the model, and notifies the view to display it.
 * ******************************************************************************************
 */
public class LoginPresenter implements ILoginPresenter, OnLoginFinishedListener{
    ILoginView iLoginView;
    LoginInteractor loginInteractor;

    public LoginPresenter(ILoginView loginView) {
        this.iLoginView = loginView;
        this.loginInteractor = new LoginInteractor();
    }


    @Override
    public void onError() {
        iLoginView.onLoginFailed();
    }

    @Override
    public void onSuccess() {
        iLoginView.onLoginSuccess();
    }

    @Override
    public void attemptLogin(String username, String password) {
        loginInteractor.validateCredentials(this, username, password);
    }
}
