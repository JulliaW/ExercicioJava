package Vetor;

public class Vetor {

    public static void main(String[] args) {

        int[] vet = {35, 88, 77, 10, 1, 52, 87, 33, 2, 21, 48, 33};

        //a) Encontre o maior valor e imprima;        
        int maior = vet[0];

        for (int a : vet) {

            if (a > maior) {
                maior = a;
            }

        }
        System.out.println(maior);

        //b) Encontre o menor valor e imprima;
        int menor = vet[0];

        for (int a : vet) {

            if (a < menor) {
                menor = a;
            }
        }
        System.out.println(menor);

        //c) Retorne a média aritmética e imprima;
        int total = 0;
        int media = 0;
        int i = 0;

        for (int a : vet) {
            total = total + a;
            i++;
        }

        media = total / i;

        System.out.println(media);

        //d) Imprima os números pares;
        for (int a : vet) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }

        //e) Imprima os números impares;  
        for (int a : vet) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
        }

    }

}
