package org.example;

public class New {
    static void main(String[] args) {

        //obieqtebis sheqmna
        //string aris klasis saxeli

        int age = 20;
        String firstName = "Mariami";
        String lastName = "Sharikadze";
        String justName = "saxlshiminda";

        System.out.println(firstName + lastName); //sivrcis gareshe ibechdeba
        System.out.println(firstName + " " + lastName); //Spacit dabechdva
        System.out.println(firstName.concat(lastName)); //asec ibechdeba ertad.
        System.out.println(firstName.concat(lastName).concat(justName)); //ramdenims gadabma, tavad ver aketebs spacebs amitom shens tekstshive unda gqondes spacebi


        System.out.println(firstName + age); //saxeli da asaki ertad ibechdeba


        //obieqtis gareshe Booleanebi

        String text1 = "mariami";
        String text2 = "mariami";
        System.out.println(text1 == text2);

        String text3 = "mari";
        String text4 = "gio";
        System.out.println(text3 == text4);
        System.out.println(text3.equals(text1));

        //shevqmant objeqtebi

        String mm1 = new String("mariko");
        String mm2 = new String("mariko");
        System.out.println(mm1 == mm2);  //radgan aq adarebs obieqtebs mm1 da mm2 erti da imave aris tuara.
        System.out.println(mm1.equals(mm2)); //es adarebs obiqtebis shinaars da pasuxi aris true
        //rato unda gamoiyeno equals da ara ==. radgan shignit teqsts adarebs equals.

        //rogori tipia stringi. araa primituli tipi. es aris klasi. shegidzlia obieqtis gareshe mianicho mnishvneloba da aris immutable anu sheucvlelia.




        //mivawebot informaciebi miawebebs ertmanets radgan string da int aris
        String texti = "20";
        int age2 = 20;
        System.out.println(texti + age2);






    }
}
