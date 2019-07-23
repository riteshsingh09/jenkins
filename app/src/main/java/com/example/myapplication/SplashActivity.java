package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
    }

    public static boolean isValidEmail(String hello){

        return true;
    }

    public static boolean isValidPassword(String hello){

        return true;
    }

    public static boolean isValidUser(String hello){

        return true;
    }

}
