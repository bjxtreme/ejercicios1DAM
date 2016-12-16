// Escribe un programa en java que lea números enteros desde consola hasta que se
// introduzca el 0 o el -1, o bien se lleguen a introducir 121 números.
// Al acabar se mostrará el mayor de los pares y el menor de los impares, sin
// incluir, en caso de haberse introducido, el 0 o el -1.

package ejercicio1;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int minImpares = Integer.MAX_VALUE;
		int maxPares = Integer.MIN_VALUE;

		int cont = 0;
		final int NUM = 121;
		int num;
		System.out.print("Número (0 o -1) para terminar: ");
		num = sc.nextInt();
		while(cont < NUM && num != 0 && num != -1)
		{
			if(num % 2 == 0)
			{
				if(num > maxPares)
				{
					maxPares = num;
				}
			}
			else
			{
				if(num < minImpares)
				{
					minImpares = num;
				}
			}
			System.out.print("Número (0 o -1) para terminar: ");
			num = sc.nextInt();
			cont++;
		}
		sc.close();
		if(minImpares != Integer.MAX_VALUE)
		{
			System.out.println("El mínimo impar es " + minImpares);
		}
		if(maxPares != Integer.MIN_VALUE)
		{
			System.out.println("El máximo par es " + maxPares);
		}
	}

}
