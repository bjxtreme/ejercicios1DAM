/*
 * Realiza un programa que lea 10 palabras, para posteriormente mostrarlas
 *  en orden alfabético ascendente.
 */
package ordenar.palabras;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final int NUM = 10;
		String[] palabras = new String[NUM];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < palabras.length; i++)
		{
			System.out.print("Palabra: ");
			palabras[i] = sc.nextLine();
		}
		sc.close();
		boolean ordenado = false;
		String aux;
		for (int i = 0; i < palabras.length - 1 && !ordenado; i++)
		{
			ordenado = true;
			for (int j = 0; j < palabras.length - 1 - i; j++)
			{
				if(palabras[j].compareTo(palabras[j + 1]) > 0)
				{
					aux = palabras[j];
					palabras[j] = palabras[j + 1];
					palabras[j + 1] = aux;
					ordenado = false;
				}
			}
		}
		System.out.println("Palabras ordenadas:");
		for (int i = 0; i < palabras.length; i++)
		{
			System.out.println(palabras[i]);
		}

	}

}
