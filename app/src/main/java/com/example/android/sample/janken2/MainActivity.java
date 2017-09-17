package com.example.android.sample.janken2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.android.sample.janken2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button button = (Button) findViewById(R.id.new_game);
        Button.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.continue_game);
        Button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent next = new Intent(this, InputNameActivity.class);
        startActivityForResult(next);


    }
}