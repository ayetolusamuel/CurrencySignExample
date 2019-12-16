package com.codingwithset.currencysign;

import android.content.Context;

import java.text.DecimalFormat;

 class CurrencyFormat {

     static String formatPriceInThousand(Context context, String price) {
        double format = Double.parseDouble(price);
        DecimalFormat formatter = new DecimalFormat(context.getString(R.string.pattern));
        return formatter.format(format);

    }
      static String truncateDecimalPrice(Context context,String actualPrice) {
         if (actualPrice.contains(context.getString(R.string.zeo_after_decimal))){
             actualPrice = actualPrice.replace(context.getString(R.string.zeo_after_decimal),context.getString(R.string.empty));
         }
         return actualPrice;
     }

}
