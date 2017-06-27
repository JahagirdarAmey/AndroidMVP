package com.amey.androidmvp.login;

/**
 * Created by USER on 27/06/2017.
 */
public class LoginInteractor implements ILoginInteractor{
    public boolean validateCredentials(OnLoginFinishedListener onLoginFinishedListener, String username, String password) {
        onLoginFinishedListener.onSuccess();
        return true;
    }
}
