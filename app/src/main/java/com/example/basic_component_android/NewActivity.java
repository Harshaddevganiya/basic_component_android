package com.example.basic_component_android;

import static androidx.core.app.NotificationCompat.getExtras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        textView=findViewById(R.id.textView);
        textView.setText(getIntent().getExtras().getString("name"));

        button=findViewById(R.id.backbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NewActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}