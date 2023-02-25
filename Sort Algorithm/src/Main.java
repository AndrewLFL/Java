import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] lista = gerarVetor(10);
        selectionSort(lista);
        System.out.println(Arrays.toString(lista));
        int[] lista2 = gerarVetor(10);
        bubbleSort(lista2);
        System.out.println(Arrays.toString(lista2));
    }

    public static void selectionSort (int[] lista)
    {
        for (int i = 0; i< lista.length; i++)
        {
            int aux;
            int menorIndex = i;
            for (int j = i+1; j < lista.length; j++)
            {
                if (lista[j] < lista[menorIndex])
                {
                    menorIndex = j;
                }
            }
            aux = lista[i];
            lista[i] = lista[menorIndex];
            lista[menorIndex] = aux;
        }
    }

    public static void bubbleSort (int[] lista)
    {
        int aux;
        for (int i = 0; i < lista.length-1; i++)
        {
            for (int j = 0 ; j < lista.length-1; j++)
            {
                if(lista[j] > lista[j+1])
                {
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }
    }

    public static int[] gerarVetor (int n)
    {
        int[] v = new int[n];
        Random gerador = new Random();
        for (int i = 0; i < v.length; i++)
        {
            v[i] = gerador.nextInt(100);
        }
        return v;
    }
}