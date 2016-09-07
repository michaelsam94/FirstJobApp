package com.example.pam_android.firstapp;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.ButtonBarLayout;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by PAM-Android on 9/5/2016.
 */
public class NotificationActivity extends BaseActivity {
    @Bind(R.id.notifyButton)
    Button notify;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        ButterKnife.bind(this);

    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @OnClick(R.id.notifyButton)
    public void notifyAction(){
        Notification noti = new Notification.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Hi Micheal")
                .setContentText("hello michael notification").build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        noti.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(0, noti);
    }

}
