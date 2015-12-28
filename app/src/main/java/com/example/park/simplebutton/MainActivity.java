package com.example.park.simplebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnOk = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOk.setText("Click~~!!");
                btnOk.setTextColor(Color.parseColor("#333333"));
                btnOk.setBackgroundColor(Color.parseColor("#FFFF33"));
            }
        });
    }
}
