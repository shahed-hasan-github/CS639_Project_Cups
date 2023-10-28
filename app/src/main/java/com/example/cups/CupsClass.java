package com.example.cups;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CupsClass extends AppCompatActivity {

    Button btnConvert;
    TextView textView;
    EditText editText;

    String number,result;
    double litters, calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btnConvert= findViewById(R.id.button_convert);
       textView= findViewById(R.id.topText_one);
      editText= findViewById(R.id.editText);

        textView.setText(R.string.hi_n_enter_number_of_litters);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                try {
                     number = editText.getText().toString();
                    litters = Double.parseDouble(number);
                    calc = litters * 4.22;
                    result = String.valueOf(calc);
                    textView.setText(result + " Cups");
                }catch (Exception e){

                    Toast.makeText(CupsClass.this, "Enter numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }


}