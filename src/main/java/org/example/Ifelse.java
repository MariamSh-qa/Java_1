package org.example;

public class Ifelse {
    static void main(String[] args) {

        /*pirvlei amocana sesxze. piroba: ამოცანა: სესხის აღება შესაძლებელია მინიმუმ 20 წლიდან,
შესაბამისად სესხის გაცემამდე უნდა მოხდეს
მომხმარებლის ასაკის შემოწმება */


        int minAge = 20;
        int currentAge = 35;


        if (currentAge >= minAge) {
            System.out.println("Shegidzlia aigo sesxi");
        } else {
            System.out.println("ver aigeb sesxs");
        }

/*meore  gaitesta 7, 20, 25
shegvidzlia else if magivrad mxolod if-ebi eweros da boloze iyos mxolod else. magram roca mxolod if iwereba shedis yvela
if-shi da bolo piroba ifis tu ar sherulda bechdavs tu manamde shesrulda if piroba imas da +bolo
else rac aris magas. mag: 20-ze or pasuxs mogvcems.

amocana: ამოცანა:

თუ მომხარებლის ასაკი არის 6 - 18 ჩათვლით, შეუძლია აიღოს სკოლის
მოსწავლის ბარათი

თუ მომხარებლის ასაკი არის 19 - 24 ჩათვლით, შეუძლია აიღოს
სტუდენტის ბარათი

თუ მომხარებლის ასაკი არის 25 - 64 ჩათვლით, შეუძლია აიღოს ბიზნეს
ბარათი

თუ მომხარებლის ასაკი არის > 64 შეუძლია აიღოს საპენსიო ბარათი

თუ მომხმარებელი არის 6 წლამდე ასაკის, მაშინ ვერ გახსნის ბარათს
         */

        int age = 20;

        if (age >= 6 && age <= 18) {
            System.out.println("skolis barati");
        } else if (age >= 19 && age <= 24) {
            System.out.println("studentis barati");
        } else if (age >= 25 && age <= 64) {
            System.out.println("biznes barati");
        } else if (age >= 65) {
            System.out.println("sapensio barati");
        } else {
            System.out.println("patara xar");
        }


        //mesame amocana
        /*An unda davwerot simaglidand abla an und shemovitanot zgvrebi rom bug ar iyos chvens nawershi*/
        //Remember: With if - else if - else, Java executes only the first matching branch and skips the rest.


        int finalScore = 85;

        if (finalScore >= 90) {
            System.out.println("A");
        } else if (finalScore >= 80) {
            System.out.println("B");
        } else if (finalScore >= 70) {
            System.out.println("C");
        } else {
            System.out.println("no certificate");
        }

/* aq aris shemovitane zgvrebi


        int finalScore = 85;

        if (finalScore >= 70 && finalScore <= 79) {
            System.out.println("C");
        } else if (finalScore >= 80 && finalScore <=89) {
            System.out.println("B");
        } else if (finalScore >= 90 && finalScore <=100) {
            System.out.println("A");
        } else {
            System.out.println("no certificate");
        }

 */


        int minAge1 = 20;
        int currentAge1 = 35;

        if (currentAge1 <=minAge1) {
            System.out.println( "no sesxi" );}
        else {
            System.out.println("yes loan");
        }

        //meorenairi chanaweri ternaruli operatori .ternary operator
        int minAge2 = 20;
        int currentAge2 = 35;
        String result = (currentAge2 <= minAge2) ? "no loan" : "yes loan";
        System.out.println(result);





    }
}
