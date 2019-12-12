package com.codingwithset.currencysign;

import android.content.Context;

public class CurrencySign {
    private static String inNaira(Context context, String price) {
        String actualPrice = Utils.formatPrice(context, price);
        return context.getString(R.string.product_price, actualPrice);
    }
}
