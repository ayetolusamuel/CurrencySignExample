package com.codingwithset.currencysign;

import android.content.Context;

import java.text.DecimalFormat;

public class Utils {
    public static String formatPrice(Context context, String price) {
        double format = Double.parseDouble(price);
        DecimalFormat formatter = new DecimalFormat(context.getString(R.string.pattern));
        return formatter.format(format);

    }
}
