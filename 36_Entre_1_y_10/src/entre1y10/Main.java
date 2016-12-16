/*
 * Realiza un programa que termine cuando el usuario haya metido todos los números
 *  comprendidos entre el 1 y el 10.
 */

package entre1y10;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final int TOTAL = 10;
		boolean[] nums = new boolean[TOTAL + 1];
		int cont = 0;
		Scanner sc = new Scanner(System.in);
		int aux;
		while(cont < TOTAL)
		{
			System.out.print("Número:");
			aux = sc.nextInt();
			if(aux >= 1 && aux <= TOTAL &&	!nums[aux])
			{
				nums[aux] = true;
				cont++;
			}
		}
		sc.close();;
	}
}
