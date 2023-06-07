package com.ravlal.discovsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ravlal.discovmod.ToastTest;

public class MainActivity extends AppCompatActivity {

    private TextView sdkVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sdkVersion = findViewById(R.id.sdkVersion);

        ToastTest.ToastPrint(getApplication(), "How are you");
        sdkVersion.setText(ToastTest.getSDKVersion());
    }
}