package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eName = (EditText)findViewById(R.id.eName);
    TextView tName = (TextView)findViewById(R.id.tName);
    Button bClick = (Button)findViewById(R.id.bClick);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view)
    {
        switch(view.getId()){
            case R.id.bClick:
                String name = eName.getText().toString();
                tName.setText("Hi, " + name);
                break;
            default: break;
        }
    }


}