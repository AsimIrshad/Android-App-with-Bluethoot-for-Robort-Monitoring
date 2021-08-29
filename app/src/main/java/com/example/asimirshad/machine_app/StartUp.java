package com.example.asimirshad.machine_app;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartUp extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connection_activity);
    }

    public void connection(View view){
            System.out.println("Connetion Class ");
        Intent main_page=new Intent(this,MainActivity.class);
        this.startActivity(main_page);



    }
}
