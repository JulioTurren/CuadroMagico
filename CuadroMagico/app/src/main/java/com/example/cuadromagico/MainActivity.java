package com.example.cuadromagico;




import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//import java.text.SimpleDateFormat;
import java.util.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;



public class MainActivity extends AppCompatActivity {

    /*Calendar c = Calendar.getInstance();
    SimpleDateFormat df = new SimpleDateFormat("HH:mm");
    String stTime = df.format(c.getTime());
    public Long StTime = Long.parseLong(stTime.toString());*/

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9, exit;
    Button rei;
    String temp, s1, s2, s3, s4, s5, s6, s7, s8;
    TextView contador;
    int couter=0;

    Integer [] d = new Integer[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = (TextView)findViewById(R.id.movimientos);
        exit = (Button)findViewById(R.id.butExit);


        b1 = (Button)findViewById(R.id.btn_00);
        b2 = (Button)findViewById(R.id.btn_01);
        b3 = (Button)findViewById(R.id.btn_02);
        b4 = (Button)findViewById(R.id.btn_10);
        b5 = ( Button)findViewById(R.id.btn_11);
        b6 = (Button)findViewById(R.id.btn_12);
        b7 = (Button)findViewById(R.id.btn_20);
        b8 = (Button)findViewById(R.id.btn_21);
        b9 = (Button)findViewById(R.id.btn_22);


        for(int i = 0; i < 8; i++) {
            d[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(d));

        s1 = d[0].toString();
        s2 = d[1].toString();
        s3 = d[2].toString();
        s4 = d[3].toString();
        s5 = d[4].toString();
        s6 = d[5].toString();
        s7 = d[6].toString();
        s8 = d[7].toString();

        b1.setText(s1);
        b2.setText(s2);
        b3.setText(s3);
        b4.setText(s4);
        b5.setText(s5);
        b6.setText(s6);
        b7.setText(s7);
        b8.setText(s8);

        contador.setText("0");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b1.getText().toString();
                if (b2.getText() == "" ){
                    b1.setText("");
                    b2.setText(temp);
                }

                else if (b4.getText() == ""){
                    b4.setText(temp);
                    b1.setText("");
                }
                checkGrid();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b2.getText().toString();
                if (b1.getText() == "" ){
                    b1.setText(temp);
                    b2.setText("");
                }

                else if (b5.getText() == ""){
                    b5.setText(temp);
                    b2.setText("");
                }

                else if (b3.getText() == ""){
                    b3.setText(temp);
                    b2.setText("");
                }
                checkGrid();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b3.getText().toString();
                if (b2.getText() == "" ){
                    b2.setText(temp);
                    b3.setText("");
                }

                else if (b6.getText() == ""){
                    b6.setText(temp);
                    b3.setText("");
                }
                checkGrid();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b4.getText().toString();
                if (b1.getText() == "" ){
                    b1.setText(temp);
                    b4.setText("");
                }

                else if (b5.getText() == ""){
                    b5.setText(temp);
                    b4.setText("");
                }

                else if (b7.getText() == ""){
                    b7.setText(temp);
                    b4.setText("");
                }
                checkGrid();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b5.getText().toString();
                if (b2.getText() == "" ){
                    b2.setText(temp);
                    b5.setText("");
                }

                else if (b4.getText() == ""){
                    b4.setText(temp);
                    b5.setText("");
                }

                else if (b6.getText() == ""){
                    b6.setText(temp);
                    b5.setText("");
                }
                else if (b8.getText() == ""){
                    b8.setText(temp);
                    b5.setText("");
                }
                checkGrid();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b6.getText().toString();
                if (b3.getText() == "" ){
                    b3.setText(temp);
                    b6.setText("");
                }

                else if (b5.getText() == ""){
                    b5.setText(temp);
                    b6.setText("");
                }

                else if (b9.getText() == ""){
                    b9.setText(temp);
                    b6.setText("");
                }
                checkGrid();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b7.getText().toString();
                if (b4.getText() == "" ){
                    b4.setText(temp);
                    b7.setText("");
                }

                else if (b8.getText() == ""){
                    b8.setText(temp);
                    b7.setText("");
                }
                checkGrid();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b8.getText().toString();
                if (b7.getText() == "" ){
                    b7.setText(temp);
                    b8.setText("");
                }

                else if (b5.getText() == ""){
                    b5.setText(temp);
                    b8.setText("");
                }

                else if (b9.getText() == ""){
                    b9.setText(temp);
                    b8.setText("");
                }
                checkGrid();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = b9.getText().toString();
                if (b8.getText() == "" ){
                    b8.setText(temp);
                    b9.setText("");
                }

                else if (b6.getText() == ""){
                    b6.setText(temp);
                    b9.setText("");
                }
                checkGrid();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(Arrays.asList(d));

                s1 = d[0].toString();
                s2 = d[1].toString();
                s3 = d[2].toString();
                s4 = d[3].toString();
                s5 = d[4].toString();
                s6 = d[5].toString();
                s7 = d[6].toString();
                s8 = d[7].toString();

                b1.setText(s1);
                b2.setText(s2);
                b3.setText(s3);
                b4.setText(s4);
                b5.setText(s5);
                b6.setText(s6);
                b7.setText(s7);
                b8.setText(s8);


            }
        });
    }




    public void checkGrid () {
        s1 = b1.getText().toString();
        s2 = b2.getText().toString();
        s3 = b3.getText().toString();
        s4 = b4.getText().toString();
        s5 = b5.getText().toString();
        s6 = b6.getText().toString();
        s7 = b7.getText().toString();
        s8 = b8.getText().toString();
        movimietos();
        if (s1.equals("1") && s2.equals("2") && s3.equals("3") && s4.equals("4") && s5.equals("5") && s6.equals("6") && s7.equals("7") && s8.equals("8")){
            Toast.makeText(MainActivity.this, "Terminado", Toast.LENGTH_SHORT).show();
        }

    }

    public void movimietos (){
            couter++;
            contador.setText(Integer.valueOf(couter).toString());
    }

}
