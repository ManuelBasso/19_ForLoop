/*Scrivi un programma che contenga un metodo che prende in ingresso un numero e il massimo numero
di risultati che vuoi avere e stampi tutti i numeri naturali in ordine inverso 
(Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in 
uscita [6 5 4] stampati).*/

public class MyClass {
    public static void main(String args[]) {
      int numMax = 1;
      int howManyNum = 5;
      System.out.println("Numero di partenza: " + numMax + ", Quanti numeri precedenti visualizzati: "+ howManyNum);
      reverse(numMax, howManyNum);
    }
    
    public static void reverse(int a, int b) {
        for (int i=a; i > a-b; i--) {
            System.out.println(i);
        }
    }
}