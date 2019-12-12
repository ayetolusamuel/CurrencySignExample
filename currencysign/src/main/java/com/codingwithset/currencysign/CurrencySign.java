package com.codingwithset.currencysign;

import android.content.Context;

public class CurrencySign {
     static String inNaira(Context context, String price) {
        String actualPrice = Utils.formatPrice(context, price);
        String format = String.format("₦%1$s",actualPrice);
        return format;
    }
}
