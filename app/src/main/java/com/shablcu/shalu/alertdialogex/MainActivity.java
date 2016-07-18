package com.shablcu.shalu.alertdialogex;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public  void open(View view){


        AlertDialog.Builder alertdialogbuilder= new AlertDialog.Builder(this);
        alertdialogbuilder.setMessage("are you sure you want to make decision");
        alertdialogbuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You clicked yes button", Toast.LENGTH_LONG).show();
            }
        });




        alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = alertdialogbuilder.create();
        alertDialog.show();
    }


}
