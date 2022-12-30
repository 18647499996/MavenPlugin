package com.example.jitpack;

import android.util.Log;

/**
 * Description：
 *
 * @author Created by: Li_Min
 * Time:12/30/22
 */
public class JitPackUtils {
    private static volatile JitPackUtils instance = null;

    private JitPackUtils(){}

    public static JitPackUtils getInstance(){
     //single chcekout
     if(null == instance){
        synchronized (JitPackUtils.class){
            // double checkout
            if(null == instance){
                instance = new JitPackUtils();
            }
        }
     }
     return instance;
    }

    /**
     * 初始化
     */
    public void initJitPack(String maven){
        Log.d("JitPackUtils：",maven);
    }
}
