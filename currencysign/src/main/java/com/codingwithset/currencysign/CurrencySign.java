package com.codingwithset.currencysign;

import android.content.Context;

public class CurrencySign {

    public static String inNaira(Context context, String price) {
        String actualPrice = Utils.formatPrice(context, price);
        return String.format("₦%1$s",actualPrice);
    }
}
