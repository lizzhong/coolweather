package com.nudt.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.nudt.coolweather.service.AutoUpdateService;

/**
 * Created by li on 2016/3/25.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i=new Intent(context,AutoUpdateService.class);
        context.startService(i);
    }
}
