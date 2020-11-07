package br.com.isaccanedo;

/*
* @autor Isac Canedo
*/

public class AnaliseCombinatoria {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = i + 1; j <= 5; j++) {

                System.out.println("[" + i + "," + j + "]");

            }
        }
    }
}
