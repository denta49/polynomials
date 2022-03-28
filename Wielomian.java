public class Wielomian {



    //konstrukcja wielomianu
    int[] poly(int[] wsp1) {

        //deklaruje zmienna w1
        int[] w1;

        //tworze w1 o wartosci dlugosci wsp
        w1 = new int[wsp1.length];

        //tworze nowa tablice w1
        for(int i = 0; i < wsp1.length; i++){

            w1[i] = wsp1[i];
            }
        return w1;
    }


   String wypisz(int[] w1){

        String wypisane = " ";
        int i;
        i = 0;

       if(w1.length == 0){
           return "0*x^0";
       }


       for(i = 1; i <= w1.length; i++){

            wypisane += (Integer.toString(i) +"*"+ "x^" + i + "+" + " " );
        }
    return wypisane;
   }

    int[] pomnóżsię(int i, int[] tab){


        for(int k = 0; k <= tab.length-1; k++){

            tab[k] = tab[k] * i;

        }
        return tab;
   }


    public static void test(){

        // Czy puste tablice są prawidłowo obsługiwane (ini i wyp.)?
        Wielomian w1 = new Wielomian();
        int[] zero = new int[]{};
        int[] w1pusta;
        w1pusta = w1.poly(zero);
        String w1zerowa = w1.wypisz(w1pusta);


        System.out.println("ini: w1 = " + w1zerowa);


        // Czy niepuste tablice są prawidłowo obsługiwane (ini i wyp.)?

        int[] niepusta = new int[]{1,2,3,4,5};
        Wielomian w2 = new Wielomian();
        int[] w1niepusta;
        w1niepusta = w2.poly(niepusta);
        String w2niepust = w2.wypisz(w1niepusta);

        System.out.println("ini: w2 = " + w2niepust);

        // Czy działa mnożenie? Czy działania wypisywanie ujemnych współczynników?

        int[] mnoz;
        mnoz = w1.pomnóżsię(-5, niepusta);
        String w1mnoz = w1.wypisz(mnoz);
        System.out.println("mnz: w2 = "+w1mnoz);


        //PONIŻSZE FUNKCJE NIE DZIAŁAJĄ (jeszcze - nie zdążyłem i doślę jak najszybciej)
        // Czy działa dodawanie wielomianów różnej długości?

        //Wielomian w3 = w2.dodaj(w1);

        //System.out.println("dod: w3=w2+w1= "+w3);



        // Czy konstr. kopiuje tablicę?

        //for(int i=0; i<wsp1.length; i++)

            //wsp1[i] = -wsp1[i];

        //System.out.println("tst: w2 = " + w2);



        // Czy dodawanie wielomianu do samego siebie nie powoduje błędów?

        //System.out.println("dod: w2+w2 = " + w2.dodaj(w2));



        // Czy dodawanie nie zmienia dodawanego wielomianu?

        //System.out.println("tst: w2 = " + w2);

    }
    public static void main(String[] args) {

        Wielomian.test();

    }

}