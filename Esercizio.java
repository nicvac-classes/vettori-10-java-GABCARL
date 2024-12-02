//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        String voti[n];
        voti=new String [n];
        String crediti[n];
        crediti=new String[n];
        int i=0;
        float media=0, somma=0;
        System.out.println("quanti studenti ci sono");
        n=scanner.nextLine();
        for (i=0; i<n; i++){
            System.out.println("inserire il nome dello studente");
            nomi[i]=scanner.nextLine();
            System.out.println("inserire il voto dello studente");
            voti[i]=scanner.nextfloat();
            System.out.println("inserire i crediti");
            crediti[i]=scanner.nextfloat();


        }
        for (i=0;i<n-1;i++){
            somma=somma+voti[i];
        }
        media=somma/n;
        if  (voti[i]>media || crediti[i]>=6){
            System.out.println("nomi[i]");
        }

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md