package com.example.administrator.vocabquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vocabquiz(View view) {
        Intent intent = new Intent(this, VocabquizActivity.class);
        intent.putExtra("sendint", 23);
        intent.putExtra("sendstring", "abc");
        startActivity(intent);
    }

    public void addword(View view) {
    }
}
