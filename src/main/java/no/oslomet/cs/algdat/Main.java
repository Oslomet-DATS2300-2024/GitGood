package no.oslomet.cs.algdat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello moon!");
    }

    public static int maks(int[] tabell) {
        int maksInt = tabell[0];
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] > maksInt) {
                maksInt = tabell[i];
            }
        }
        return maksInt;
    }
}