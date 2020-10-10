package com.example.help;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private TextView tName;
    private Button bClick;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.eName = (EditText)findViewById(R.id.eName);
        this.bClick = (Button)findViewById(R.id.bClick);
    }

    public void clicked(View view)
    {
        switch(view.getId()){
            case R.id.bClick:
                alert();
                break;
            default: break;
        }
    }

    public void alert(){
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("How do you want to be greeted?");
        dialog.setTitle("Greeting dialog");
        dialog.setPositiveButton("Politely",
        new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,
                                int which) {
                Toast.makeText(getApplicationContext(),"Hello there, " + eName.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
        dialog.setNegativeButton("Roast me",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"You're ugly, " + eName.getText().toString(),Toast.LENGTH_LONG).show();
                    }
                }
                )
        .show();


    }


}