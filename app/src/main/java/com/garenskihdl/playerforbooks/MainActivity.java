package com.garenskihdl.playerforbooks;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private TextView appColorTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.MainBackground);
        appColorTv = findViewById(R.id.AppColor);
        //colorBtn.setOnClickListener(this);
    }

    public void SetColorToApp(int color,String text) {
        View root = constraintLayout.getRootView();
        root.setBackgroundColor(color);
        appColorTv.setText(text);
    }

    public void onYellowClick(View view) {
        SetColorToApp(getResources().getColor(R.color.yellow),"Activity is yellow");
    }

    public void onRedClick(View view) {
        SetColorToApp(getResources().getColor(R.color.red),"Activity is red");
    }

    public void onGreenClick(View view) {
        SetColorToApp(getResources().getColor(R.color.green),"Activity is green");
    }
}
