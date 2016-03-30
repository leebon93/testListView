package com.test.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.test.myapplication.simpleImageTextListView.ImageTextListViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(ImageTextListViewActivity.createIntent(this));
        finish();
    }
}
