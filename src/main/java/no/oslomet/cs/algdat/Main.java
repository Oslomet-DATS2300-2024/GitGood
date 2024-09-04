package no.oslomet.cs.algdat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello moon!");
    }

    public static int maks(int[] tabell) {
        int maks = tabell[0];
        for (int i = 1; i < tabell.maks; i++) {
            if (tabell[i] > maks) {
                maks = tabell[i];
            }
        }
        return maks;
    }
}