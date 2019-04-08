package com.garenskihdl.playerforbooks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText getDataFromNewCatNamePT;
    private TextView setTextToCatNameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTextToCatNameTV = findViewById(R.id.CatNameTV);
        getDataFromNewCatNamePT = findViewById(R.id.NewCatNamePT);
    }

    public void SetNewName(View view) {
        int CatNameSize =  getDataFromNewCatNamePT.getText().length();
        setTextToCatNameTV.setText( "Hello, " + (( CatNameSize > 0 ) ?  getDataFromNewCatNamePT.getText() : "Kitty") + "!"  );
    }
}
