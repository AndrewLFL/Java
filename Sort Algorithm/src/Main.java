import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] lista = gerarVetor(100);
        selectionSort(lista);
        System.out.println(Arrays.toString(lista));
        int[] lista2 = gerarVetor(100);
        bubbleSort(lista2);
        System.out.println(Arrays.toString(lista2));
        int[] lista3 = gerarVetor(100);
        insertionSort(lista3);
        System.out.println(Arrays.toString(lista3));

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

    public static void insertionSort (int[] lista)
    {
        for (int i = 1; i < lista.length; i++)
        {
            int chave = lista[i];
            int j = i-1;
            while (j >= 0 && lista[j] > chave)
            {
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = chave;
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