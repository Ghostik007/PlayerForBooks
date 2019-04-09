package com.garenskihdl.playerforbooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button CrowsCounterBtn;
    private TextView HelloTextView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CrowsCounterBtn = findViewById( R.id.CounterBtn );
        HelloTextView = findViewById(R.id.helloTextView);

        CrowsCounterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HelloTextView.setText("Quantity of crows is: " + (++count));
            }
        });
    }


}
