package com.gpc.bootmodetest;

import android.content.Context;
import android.content.Intent;

public class ActionUtils {
    //标准模式
    public static void toActivity(Context context, Class<?> class1) {
        Intent intent = new Intent();
        intent.setClass(context, class1);
        context.startActivity(intent);
    }

    //
    public static void toActivity1(Context context, Class<?> class1) {
        Intent intent = new Intent();
        intent.setClass(context, class1);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
    //
    public static void toActivity2(Context context, Class<?> class1) {
        Intent intent = new Intent();
        intent.setClass(context, class1);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
    }
    //
    public static void toActivity3(Context context, Class<?> class1) {
        Intent intent = new Intent();
        intent.setClass(context, class1);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(intent);
    }
    //
    public static void toActivity4(Context context, Class<?> class1) {
        Intent intent = new Intent();
        intent.setClass(context, class1);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
