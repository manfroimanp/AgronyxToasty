package com.manp.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toaster.simpleToast(this,"AGRONYX");
        ToasterComplete.simpleToast(this,"AGRONYX",0);
    }
}