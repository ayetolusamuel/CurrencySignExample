package com.codingwithset.currencysign;

import android.content.Context;
import android.util.Log;

public class Utils {

    public static String inNaira(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.naira_sign), actualPrice);
    }

    public static String inDollar(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.dollar_sign), actualPrice);
    }

    public static String inEuro(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.euro_sign), actualPrice);
    }

    public static String inCedis(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.cedis_sign), actualPrice);
    }

    public static String inYen(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.yen_sign), actualPrice);
    }

    public static String inWon(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.won_sign), actualPrice);
    }

    public static String inDenar(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.denar_sign), actualPrice);
    }

    public static String inRinggit(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.ringgit_sign), actualPrice);
    }

    public static String inLek(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.ringgit_sign), actualPrice);
    }

    public static String inDollarJamaica(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.jamaica_dollar_sign), actualPrice);
    }

    public static String inRupee(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.rupee_sign), actualPrice);
    }

    public static String inRupiah(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.rupiah_sign), actualPrice);
    }

    public static String inGuilder(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.guilder_sign), actualPrice);
    }

    public static String inPound(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.pound_sign), actualPrice);
    }

    public static String inManat(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.manat_sign), actualPrice);
    }

    public static String inBelizeDollar(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.belize_dollar_sign), actualPrice);
    }

    public static String inBoliviano(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.boliviano_sign), actualPrice);
    }

    public static String inConvertibleMarka(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.convertible_marka_sign), actualPrice);
    }

    public static String inPula(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.pula_sign), actualPrice);
    }

    public static String inLev(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.lev_sign), actualPrice);
    }

    public static String inReal(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.real_sign), actualPrice);
    }

    public static String inYuanRenminbi(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.yuan_renminbi_sign), actualPrice);
    }

    public static String inColon(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.colon_sign), actualPrice);

    }

    public static String inKuna(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.kuna_sign), actualPrice);

    }

    public static String inRiel(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.riel_sign), actualPrice);
    }

    public static String inPeso(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.peso_sign), actualPrice);
    }

    public static String inKoruna(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.koruna_sign), actualPrice);
    }

    public static String inKrone(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.krone_sign), actualPrice);
    }

    public static String inPesoDominican(Context context, String price) {
        String actualPrice = CurrencyFormat.formatPriceInThousand(context, price);
        actualPrice = CurrencyFormat.truncateDecimalPrice(context, actualPrice);
        return String.format(context.getString(R.string.peso_dominican_sign), actualPrice);
    }
}
