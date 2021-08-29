package com.example.asimirshad.machine_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar customSeekBar;
    TextView speed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        speed1=(TextView)findViewById(R.id.speed_text_view);
        customSeekBar = (SeekBar) findViewById(R.id.seekBar);
        customSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                System.out.println("Seek bar change"+i);
                speed1.setText(Integer.toString(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void connect_with_machine(View view){

        Toast.makeText(this,"Communication setting",Toast.LENGTH_LONG).show();
    }
    public void start(View view){

        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
    }
    public void stop(View view){

        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
    }
    public void save(View view){

        Toast.makeText(this,"Save",Toast.LENGTH_LONG).show();
    }
    public void up_arrow(View view){

        Toast.makeText(this,"Up Arrow",Toast.LENGTH_LONG).show();
    }
    public void down_arrow(View view){

        Toast.makeText(this,"Down Arrow",Toast.LENGTH_LONG).show();
    }
    public void right_arrow(View view){

        Toast.makeText(this,"Right Arrow",Toast.LENGTH_LONG).show();
    }
    public void left_arrow(View view){

        Toast.makeText(this,"Left Arrow",Toast.LENGTH_LONG).show();
    }







}
