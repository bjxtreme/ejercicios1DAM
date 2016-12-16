//Realiza un programa que lea desde consola un array de dimensiones introducidas por el usuario y el valor
//inicial, que deberá ser 0 ó 1. Se creará y mostrará el array formando un dibujo en “ajedrez” con 0 y 1. Ejemplo de
//3 x 4 y valor inicial 0:
//0 1 0 1
//1 0 1 0
//0 1 0 1
package ajedrez;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Filas: ");
		int filas = sc.nextInt();
		System.out.print("Columnas: ");
		int cols = sc.nextInt();
		sc.close();
		int[][] nums = new int[filas][cols];

		int numInicial = 0;
		int numRelleno = -1;

		for (int i = 0; i < nums.length; i++)
		{
			numRelleno = numInicial;
			for (int j = 0; j < nums[0].length; j++)
			{
				nums[i][j] = numRelleno;
				numRelleno = numRelleno ^ 1;
			}
			numInicial = numInicial ^ 1;
		}

		// Mostrar
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[0].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.print("\n\n");
		}

	}

}
