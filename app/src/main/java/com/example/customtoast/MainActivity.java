package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating the layoutInflater instance
        LayoutInflater li= getLayoutInflater();

        //Getting the View object as defined in the customtoast.xml file
        View layout=li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));//resource, view group root

        //creating toast layout

        Toast toast= new Toast(getApplicationContext() );
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
        toast.setView(layout);

        toast.show();








    }
}
