package com.rolandoselvera.examplemvvmjava.utils;

import android.graphics.Color;

import java.util.Random;

public class ColorViewUtil {

    // Devuelve un color de forma aleatoria:
    public static int randomColor() {
        Random randomNumber = new Random();
        return Color.argb(
                255,
                randomNumber.nextInt(256),
                randomNumber.nextInt(256),
                randomNumber.nextInt(256)
        );
    }
}