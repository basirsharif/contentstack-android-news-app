package com.raweng.contentstackapplication;

import android.app.Application;

import com.builtio.contentstack.Contentstack;
import com.builtio.contentstack.Stack;

/***
 * Created by built.io.
 */
public class ContentApplication extends Application {

    static Stack stack;


    @Override
    public void onCreate() {
        super.onCreate();

        try {
            stack = Contentstack.stack(ContentApplication.this, "CONTENTSTACK_API_KEY", "CONTENTSTACK_ACCESS_TOKEN", "ENVIROMENT_NAME");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Stack getStackInstance(){
        return stack;
    }
}
