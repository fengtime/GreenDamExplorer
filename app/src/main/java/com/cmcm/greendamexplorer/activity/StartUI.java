package com.cmcm.greendamexplorer.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.cmcm.greendamexplorer.utils.SharedPreferenceUtil;

public class StartUI extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.start);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent mainIntent = new Intent(StartUI.this, MainActivity.class);
                startActivity(mainIntent);
                overridePendingTransition(R.anim.fade, R.anim.hold);
                finish();
            }
        }, 2000);

    }
}
