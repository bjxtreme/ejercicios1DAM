/*
 * Realiza un programa que lea números enteros desde teclado hasta
 *  que se introduzcan 12 impares sin repetir.
 */
package impares;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final int NUM = 12;
		int[] nums = new int[NUM];
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int aux;
		boolean existe;
		while(cont < NUM)
		{
			System.out.print("Número (impar): ");
			aux = sc.nextInt();
			if(aux % 2 != 0) // Es impar
			{
				existe = false;
				for (int i = 0; i < cont && !existe; i++)
				{
					if(aux == nums[i])
					{
						existe = true;
					}
				}
				if(!existe)
				{
					nums[cont] = aux;
					cont++;
				}
				else
				{
					System.out.println("Ya existe.");
				}
			}
			else
			{
				System.out.println("Es par.");
			}
		}
		sc.close();
		// Impares sin repetir
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}

}
