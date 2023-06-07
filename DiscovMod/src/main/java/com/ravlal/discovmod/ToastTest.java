package com.ravlal.discovmod;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Raviteja Emandi on 07,June,2023
 **/
public class ToastTest {

    static String value;

    public static String getSDKVersion() {
        return value = "0.1";
    }
    public static void ToastPrint(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        Log.e("Toast_SDK", message);
    }
}
