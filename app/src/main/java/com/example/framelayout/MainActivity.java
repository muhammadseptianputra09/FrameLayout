package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView gambar1, gambar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gambar1 = findViewById(R.id.gambar2);
        gambar2 = findViewById(R.id.gambar1);
        gambar1.setOnClickListener(this);
        gambar2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.gambar2:
                gambar1.setVisibility(View.GONE);
                gambar2.setVisibility(View.VISIBLE);
                break;

        }
    }
}