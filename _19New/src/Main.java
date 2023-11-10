/*Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero
di risultati che vuoi avere e stampi tutti i numeri naturali in ordine inverso
(Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in
uscita [6 5 4] stampati).*/


public class Main {
    public static void main(String args[]) {
        int numMax = 2;
        int howManyNum = 5;
        System.out.println("Numero di partenza: " + numMax + ", Quanti numeri precedenti visualizzati: "+ howManyNum);
        reverse(numMax, howManyNum);
    }

    //modificato condizione nel ciclo for, ora stampa a video solamente i numeri naturali.

    public static void reverse(int a, int b) {
        for (int i=a; (i >= 0) && (i>a-b); i--) {
            System.out.println(i);
        }
    }
}