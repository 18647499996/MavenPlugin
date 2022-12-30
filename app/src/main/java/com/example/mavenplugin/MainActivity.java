package com.example.mavenplugin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jitpack.JitPackUtils;
import com.example.remote_maven.RemoteMavenUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RemoteMavenUtils.getInstance().getMaven("居然可以引用自己");
    }
}