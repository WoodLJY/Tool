package com.example.tool;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by hanguorui on 2018/12/6.
 */

public class ToastUtil {

    private static Toast toast;

    /**
     * 短时间显示Toast
     *
     * @param mContext
     * @param message
     */
    public static void showShorts(Context mContext, CharSequence message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }


    public static void showShort(Context mContext, String str) {
        toast(mContext, str);
    }


    /**
     * 短时间显示Toast
     *
     * @param mContext
     * @param message
     */
    public static void showShort(Context mContext, int message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 长时间显示Toast
     *
     * @param mContext
     * @param message
     */
    public static void showLong(Context mContext, CharSequence message) {
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }

    /**
     * 长时间显示Toast
     *
     * @param mContext
     * @param message
     */
    public static void showLong(Context mContext, int message) {
        Toast.makeText(mContext, message, Toast.LENGTH_LONG).show();
    }

    /**
     * 自定义显示Toast时间
     *
     * @param mContext
     * @param message
     * @param duration
     */
    public static void show(Context mContext, CharSequence message, int duration) {
        Toast.makeText(mContext, message, duration).show();
    }

    /**
     * 自定义显示Toast时间
     *
     * @param mContext
     * @param message
     * @param duration
     */
    public static void show(Context mContext, int message, int duration) {
        Toast.makeText(mContext, message, duration).show();
    }

    private static void toast(Context mContext, String str) {


        if (str == null)
            str = "";
        if (null != toast)
            toast.cancel();
//        toast = Toast.makeText(mContext, str, Toast.LENGTH_SHORT);
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.CENTER, 0, 0);
//        toast.show();


        if (toast == null) {
            toast = Toast.makeText(mContext, null, Toast.LENGTH_SHORT);
            toast.setText(str);
        } else {
            toast.setText(str);
        }
        toast.setGravity(Gravity.CENTER, 0, 0);
        Handler mainHandler = new Handler(Looper.getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                toast.show();
            }
        });
    }


}