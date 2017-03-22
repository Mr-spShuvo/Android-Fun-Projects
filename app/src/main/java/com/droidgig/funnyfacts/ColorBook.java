package com.droidgig.funnyfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Mr.Shuvo on 1/4/2017.
 */

public class ColorBook {

    public String[] color = {
                "#E53935",
                "#E91E63",
                "#880E4F",
                "#4A148C",
                "#C51162",
                "#009688",
                "#0091EA",
                "#FF6F00",
                "#795548",
                "#FF5722" };


    public int getColor (){
        // The Button Option
        //String colors = " ";
        Random randomGen = new Random();
        int randomNum = randomGen.nextInt(color.length);
         int colorAsInt = Color.parseColor(color[randomNum]);
        return colorAsInt;
    }
}