/*
 * Realiza un programa que lea 8 números y los muestre de manera descendente.
 */
package descendente;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final int TOTAL = 8;
		int[] nums = new int[TOTAL];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print("Número: ");
			nums[i] = sc.nextInt();
		}
		sc.close();
		boolean ordenado = false;
		int aux;
		for (int i = 0; i < nums.length - 1 && !ordenado; i++)
		{
			ordenado = true;
			for (int j = 0; j < nums.length - 1 - i; j++)
			{
				if(nums[j] < nums[j + 1])
				{
					aux = nums[j];
					nums[j] = nums[j+ 1];
					nums[j + 1] = aux;
					ordenado = false;
				}
			}
		}
		// Mostrar números:
		System.out.println("Números:");
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}

}
