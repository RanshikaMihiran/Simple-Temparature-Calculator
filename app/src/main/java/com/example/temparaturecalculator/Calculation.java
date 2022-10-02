package com.example.temparaturecalculator;

public class Calculation {


    protected float ConvertCelcius2Fahrenheite(float value){
        float ans = (value * 9/5)+32;
        return ans;
    }

    protected float ConvertFahrenheite2Celcius(float value){
        float ans = (value-32)*5/9;
        return ans;
    }
}
