package com.example.temparaturecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button objBtn = findViewById(R.id.BtnCalc);
        objBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               CalculateAnswer();
            }
        });
    }

    private void CalculateAnswer(){
        EditText objInput = findViewById(R.id.TbInputUsr);
        Calculation objCalcs  = new Calculation();
        RadioButton objcel = findViewById(R.id.RbCel);
        RadioButton objFah = findViewById(R.id.RbFer);
        TextView objAns = findViewById(R.id.LblAns);


        if(objInput.getText().toString().isEmpty())
            Toast.makeText(this,"Please Enter value",Toast.LENGTH_LONG).show();
        else{
            if(objcel.isChecked())
                objAns.setText(String.valueOf(objCalcs.ConvertCelcius2Fahrenheite(Float.valueOf(objInput.getText().toString()))));
            else
                objAns.setText(String.valueOf(objCalcs.ConvertFahrenheite2Celcius(Float.valueOf(objInput.getText().toString()))));
        }

    }
}