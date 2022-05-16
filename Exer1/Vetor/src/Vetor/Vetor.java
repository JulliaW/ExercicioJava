package Vetor;

public class Vetor {

    public static void main(String[] args) {

        int[] vet = {35, 88, 77, 10, 1, 52, 87, 33, 2, 21, 48, 33};

        //a) Encontre o maior valor e imprima;        
        int maior = 0;

        for (int pos : vet) {

            if (pos > maior) {
                maior = pos;
            }

        }
        System.out.println(maior);

        //b) Encontre o menor valor e imprima;
        int menor = 1000000;

        for (int pos : vet) {

            if (pos < menor) {
                menor = pos;
            }
        }
        System.out.println(menor);

        //c) Retorne a média aritmética e imprima;
        int total = 0;
        int media = 0;
        int i = 0;

        for (int pos : vet) {
            total = total + pos;
            i++;
        }

        media = total / i;

        System.out.println(media);

        //d) Imprima os números pares;
        for (int pos : vet) {
            if (pos % 2 == 0) {
                System.out.println(pos);
            }
        }

        //e) Imprima os números impares;  
        for (int pos : vet) {
            if (pos % 2 != 0) {
                System.out.println(pos);
            }
        }

    }

}
