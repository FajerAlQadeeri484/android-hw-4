package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText q = findViewById(R.id.Quiz);
        final EditText h = findViewById(R.id.Homework);
        final EditText m = findViewById(R.id.Midterms);
        final EditText f = findViewById(R.id.Final);
        Button c = findViewById(R.id.calculate);
        Button r = findViewById(R.id.reset);
        final TextView u = findViewById(R.id.result);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double qM = Double.parseDouble(q.getText().toString());
                double hM = Double.parseDouble(h.getText().toString());
                double mM = Double.parseDouble(m.getText().toString());
                double fM = Double.parseDouble(f.getText().toString());

                double calculation = (qM + hM + mM + fM);

                //Toast.makeText(MainActivity.this, "Calculating...", Toast.LENGTH_LONG).show();
                Toast toast=Toast.makeText(MainActivity.this, "Calculating...", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.START, 90,0);
                toast.show();


                if (calculation>=90) {
                    u.setText(calculation+"= A, Excellent!");
                    u.setTextColor(Color.parseColor("#ccfa1e"));

                }else if (calculation>=80 && calculation<90) {
                    u.setText(calculation+"= B, Great");
                    u.setTextColor(Color.parseColor("#7ad9ff"));

                }else if (calculation>=70 && calculation<80) {
                    u.setText(calculation+"= C, Good");
                    u.setTextColor(Color.parseColor("#ffc60a"));

                }else if (calculation>=60 && calculation<70) {
                    u.setText(calculation+"= D, Bad");
                    u.setTextColor(Color.parseColor("#a8dee5"));

                }else{
                    u.setText(calculation+"= F, Failed!");
                    u.setTextColor(Color.parseColor("#eb002a"));}
            }
            
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q.setText("");
                h.setText("");
                m.setText("");
                f.setText("");
                u.setText("");
            }
        });



    }
}