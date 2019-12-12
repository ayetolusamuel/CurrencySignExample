package com.codingwithset.currencysignexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codingwithset.currencysign.CurrencySign;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CurrencySign currencySign = new CurrencySign();


    }

}
