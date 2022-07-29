package com.example.socket_alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class SoVoRoAlarm extends AppCompatActivity {
    private Socket mSocket;
    {
        try {
            mSocket = IO.socket("http://chat.socket.io");
        } catch (URISyntaxException e) {}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sovoro_alarm);

        mSocket.on("notification list", notificationList);
        mSocket.connect();
    }
    private Emitter.Listener notificationList = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject notificationContents = (JSONObject) args[0];
                    String notificationContent;
                    String message;
                    try {
                        notificationContents.keys().forEachRemaining(element->{

                        });
                        notificationContent = data.getString("username");
                    } catch (JSONException e) {
                        return;
                    }
                }
            });
        }
    };
}