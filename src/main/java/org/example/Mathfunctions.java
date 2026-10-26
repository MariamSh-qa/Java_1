package org.example;
//math klasebis pageee
public class Mathfunctions {
    static void main(String[] args) {

        int x = 20;
        int y = 50;

        int z =  Math.max(x, y);
        System.out.println(z);   //mipova am oridan maximaluri 50


        int c = Math.min(x, y);
        System.out.println(c);  //mipova am oridan minimaluri 20


        double fesvi = Math.sqrt(16);
        System.out.println(fesvi); //kvadratuli fesvis naxva. 4


        double result = Math.random();
        System.out.println(result);

        int result1 = (int) (Math.random() * 1000);
        System.out.println(result1);   //samnishnebian irchevs randoms cast hqvia roca intshi gadamyavs


        System.out.println(Math.max(5, 10));   //pirdapir asec mushaobs

        //an, ornairi shekrebebi

        int x1 = 2;
        int y2 = 4;
        System.out.println(x1 + y2);
        System.out.println(Math.addExact(x1, y2));

        /*int = 3;
        int = 4 */   //eseni aris ori gza komentaris daweris





    }
}
