package com.amey.androidmvp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amey.androidmvp.R;

/******************************************************************************************
 Activity ONLY knows how to display views and sending events and data to the presenter &
 Activity doesn't know anything about the model
 ********************************************************************************************
 */

public class LoginActivity extends AppCompatActivity implements ILoginView {

    EditText username;
    EditText password;
    Button login;

    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        loginPresenter = new LoginPresenter(this);
    }

    public void onLoginClick(View view) {
        loginPresenter.attemptLogin(username.getText().toString(), password.getText().toString());
    }


    @Override
    public void onLoginSuccess() {
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onLoginFailed() {

    }
}
