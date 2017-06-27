package com.amey.androidmvp.login;

/**
 * Created by USER on 27/06/2017.
 */
public interface ILoginInteractor {
    boolean validateCredentials(OnLoginFinishedListener listener, String username, String password);
}
