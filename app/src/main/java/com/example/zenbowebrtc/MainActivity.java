package com.example.zenbowebrtc;

import androidx.appcompat.app.AppCompatActivity;
import pub.devrel.easypermissions.EasyPermissions;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] perms = {
                Manifest.permission.CAMERA,
                Manifest.permission.RECORD_AUDIO
        };

        if (!EasyPermissions.hasPermissions(this, perms)) {
            EasyPermissions.requestPermissions(this,
                    "Need permissions for camera & microphone",
                    0,
                    perms);
        }
    }

    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, WebRtcActivity.class));
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }
}
