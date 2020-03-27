package com.codingwithset.currencysignexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.codingwithset.currencysign.*;


public class MainActivity extends AppCompatActivity {

    private String country;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn_displayPrice);
        final TextView txtPrice = findViewById(R.id.txt_price);
        final EditText edtPrice = findViewById(R.id.edt_price);
        final Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.country_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(adapter);

        getCountry(txtPrice, spinner);


        button.setOnClickListener(view -> {
            String price = edtPrice.getText().toString();
            if (!price.isEmpty()) {
                String countryFromSpinner = country;
                Log.d(TAG, "onCreate: country "+countryFromSpinner);
                if(countryFromSpinner.equals(null)){
                   return;
                }
                if (countryFromSpinner.equalsIgnoreCase(getString(R.string.nigeria))){
                    txtPrice.setText(Utils.inNaira(this,price));
                    return;
                }
                if (countryFromSpinner.equalsIgnoreCase(getString(R.string.ghana))){
                    txtPrice.setText(Utils.inCedis(this,price));
                    return;

                }
                if (countryFromSpinner.equalsIgnoreCase(getString(R.string.china))){
                    txtPrice.setText(Utils.inYen(this,price));
                    return;

                }
                if (countryFromSpinner.equalsIgnoreCase(getString(R.string.india))){
                    txtPrice.setText(Utils.inRupee(this,price));

                }


            }

        });



//        String locale = getResources().getConfiguration().locale.getCountry();
//        // System.out.println("country "+locale);
//
//        // Utils.inNaira()
//        TelephonyManager tm = (TelephonyManager)this.getSystemService(Context.TELEPHONY_SERVICE);
//        String countryCodeValue = tm.getNetworkCountryIso();
//
//        if (locale.equalsIgnoreCase(countryCodeValue)){
//            System.out.println("Country : "+countryCodeValue);
//        }


    }

    private void getCountry(TextView txtPrice, Spinner spinner) {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelected = parent.getItemAtPosition(position).toString();
                if (itemSelected.equalsIgnoreCase("Select Country")) {
                    txtPrice.setText(" ");
                } else {
                    country = itemSelected;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
