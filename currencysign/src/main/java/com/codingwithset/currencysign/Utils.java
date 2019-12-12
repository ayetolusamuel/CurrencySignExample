package com.codingwithset.currencysign;

import android.content.Context;

import java.text.DecimalFormat;

public class Utils {

    private static String formatPrice(Context context, String price) {
        double format = Double.parseDouble(price);
        DecimalFormat formatter = new DecimalFormat(context.getString(R.string.pattern));
        return formatter.format(format);

    }
    public static String inNaira(Context context, String price) {
        String actualPrice = Utils.formatPrice(context, price);
        return String.format("₦%1$s",actualPrice);
    }
}
