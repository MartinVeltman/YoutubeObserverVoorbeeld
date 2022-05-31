package com.company;

public class Youtube {

    public static void main(String[] args) {

        Channel pewdiepie = new Channel();

        Subscriber sub1= new Subscriber("Erik-jan");
        Subscriber sub2= new Subscriber("Pieter-jan");
        Subscriber sub3= new Subscriber("Piet-jan");
        Subscriber sub4= new Subscriber("Lange-jan");
        Subscriber sub5= new Subscriber("Malle-jan");

        pewdiepie.subscribe(sub1);
        pewdiepie.subscribe(sub2);
        pewdiepie.subscribe(sub3);
        pewdiepie.subscribe(sub4);
        pewdiepie.subscribe(sub5);

        pewdiepie.upload("1000 dollar Giveaway");
    }
}
