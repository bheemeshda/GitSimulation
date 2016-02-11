package com.bheem.gitsimulation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SunilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunil);

        System.out.println("Sunil ACtivity loaded");

        System.out.println("In Sunil branch >> After Sunil ACtivity loaded >> Commit 1");

        System.out.println("In Sunil branch >> After Sunil ACtivity loaded >> Commit 2");
    }
}
