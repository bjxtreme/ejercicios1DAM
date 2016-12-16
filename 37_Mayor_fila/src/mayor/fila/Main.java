/*
 * Realiza un programa que cargue y muestre un array de 6 x 4 con números
 * enteros aleatorios de entre el 1 y el 10, ambos inclusive.
 * Además se ha de mostrar el número de fila cuya suma de sus elementos
 * es la mayor. En caso de empate se mostrará la primera fila.
 */

package mayor.fila;

import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{
		final int FILAS = 6;
		final int COLS = 4;
		int[][] nums = new int[FILAS][COLS];
		Random randon = new Random();
		// Rellenar aleatorios
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				nums[i][j] = randon.nextInt(10) + 1;
			}
		}
		// Mostrar array
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
		// Buscar mayor fila
		int maxFila = Integer.MIN_VALUE;
		int sumaFila = 0;
		int indiceFilaMax = 0;
		for (int i = 0; i < nums.length; i++)
		{
			sumaFila = 0;
			for (int j = 0; j < nums[0].length; j++)
			{
				sumaFila += nums[i][j];
			}
			if(sumaFila > maxFila)
			{
				maxFila = sumaFila;
				indiceFilaMax = i;
			}
		}
		System.out.println("La fila cuya suma es mayor es " + indiceFilaMax);

	}

}
