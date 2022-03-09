package com.manp.toasty;

import android.content.Context;
import android.widget.Toast;

public class ToasterComplete {
    public static void simpleToast(Context context, String msg, int type) {
        Toast.makeText(context,msg,type).show();
    }
}
