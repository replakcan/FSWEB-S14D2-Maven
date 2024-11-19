package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom("istanblue", new Wall("doğu"), new Wall("kuzey"), new Wall("batı"), new Wall("güney"), new Ceiling(4, PaintColor.RED), new Bed("geleneksel", 3, 4, 2, 1), new Lamp(LampType.NORMAL, true, 5), new Wardrobe(2, 3, 250), new Carpet(16, 9, PaintColor.GREEN));

        /*
        ForChallengers.1- Bedroom is a Room (inheritance),
        ForChallengers.2- Ceiling, and three walls,
        ForChallengers.3-
         */
    }
}