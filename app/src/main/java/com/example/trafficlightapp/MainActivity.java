package com.example.trafficlightapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        Button trafficCommand = findViewById(R.id.btn_Traffic);
        String text = trafficCommand.getText().toString();
        ImageView redLight = findViewById(R.id.img_Red);
        ImageView yellowLight = findViewById(R.id.img_Yellow);
        ImageView greenLight = findViewById(R.id.img_Green);


        if (text.equals("STOP")) {
            trafficCommand.setText("WAIT");
            trafficCommand.setBackgroundColor(getResources().getColor(R.color.yellow));
            redLight.setVisibility(View.INVISIBLE);
            yellowLight.setVisibility(View.VISIBLE);
            greenLight.setVisibility(View.INVISIBLE);
        }
        if (text.equals("WAIT")) {
            trafficCommand.setText("GO");
            trafficCommand.setBackgroundColor(getResources().getColor(R.color.green));
            redLight.setVisibility(View.INVISIBLE);
            yellowLight.setVisibility(View.INVISIBLE);
            greenLight.setVisibility(View.VISIBLE);
        }
        if (text=="GO") {
            trafficCommand.setText("STOP");
            trafficCommand.setBackgroundColor(getResources().getColor(R.color.red));
            redLight.setVisibility(View.VISIBLE);
            yellowLight.setVisibility(View.INVISIBLE);
            greenLight.setVisibility(View.INVISIBLE);
        }
    }

        /*
            TextView hello = (TextView) findViewById(R.id.tv_1);
            ImageView elephant = (ImageView) findViewById(R.id.img_1);

            if (hello.getText()=="Hello") {
                hello.setText("Goodbye");
                elephant.setVisibility(View.INVISIBLE);
            }
            else {
                hello.setText("Hello");
                elephant.setVisibility(View.VISIBLE);
         */


}