package com.example.junior.carol;

import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            Thread.sleep(1000);
            this.notification();
        }catch (InterruptedException ex){
            onDestroy();
        }
    }
    public void notification() {
        while (true) {
            try {
                Thread.sleep(55000);
                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this).setSmallIcon(R.mipmap.ic_launcher).setContentTitle("My notification").setContentText("Hello World!");
                int mNotificationId = 0;
                NotificationManager mNotifyMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                mNotifyMgr.notify(mNotificationId, mBuilder.build());
                mNotificationId += 1;
            } catch (InterruptedException ex) {
                onDestroy();
            }
        }
    }

}



