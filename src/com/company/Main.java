package com.company;

public class Main {

    public static void main(String[] args) {
        Figura[] f = new Figura [10];
        f[0] = new Kwadrat(5);
        f[1] = new Prostokat (8,7);
        f[2] = new Prostokat (4,3);
        f[3] = new Prostokat (1,2);
        f[4] = new Prostokat (9,4);
        f[5] = new Prostokat (3,5);
        f[6] = new Kwadrat (8);
        f[7] = new Kwadrat (7);
        f[8] = new Kwadrat (3);
        f[9] = new Prostokat (2,9);


        for (int i = 0; i < 10; i++) {
            System.out.println(f[i]);
        }



    }
}
