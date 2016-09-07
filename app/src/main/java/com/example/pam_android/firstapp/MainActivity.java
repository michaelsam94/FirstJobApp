package com.example.pam_android.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.notificationActivityButton)
    Button openNotificationActivity;
    @Bind(R.id.itemListActivityButton)
    Button openItemListActivity;
    @Bind(R.id.cardViewButton)
    Button openCardViewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.notificationActivityButton)
    public void goToNotification(){
        Intent intent = new Intent(this,NotificationActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.itemListActivityButton)
    public void goToItemList(){
        Intent intent = new Intent(this,ItemsList.class);
        startActivity(intent);
    }

    @OnClick(R.id.cardViewButton)
    public void goToCardView(){
        Intent intent = new Intent(this,AlbumsActivity.class);
        startActivity(intent);
    }



}
