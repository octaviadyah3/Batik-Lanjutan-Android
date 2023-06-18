package com.dyahexample.myloginapp;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class MainActivity extends AppCompatActivity {
    private Button notifyBtn;


    @Override
    protected void onCreate(Bundle SaveinstanceState) {
        super.onCreate(SaveinstanceState);
        setContentView(R.layout.activity_teknik_detail);

        notifyBtn = findViewById(R.id.notify);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("My Notification", "My Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        notifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //notification code goes here
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "My Notification");
                builder.setContentTitle("Notifikasi");
                builder.setContentText("Teknik canting tulis adalah teknik membatik dengan menggunakan alat yang disebut canting. Canting berfungsi untuk menorehkan cairan malam atau lilin pada sebagian pola di kain mori.");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(MainActivity.this);
                managerCompat.notify(1, builder.build());

            }
        });
    };
