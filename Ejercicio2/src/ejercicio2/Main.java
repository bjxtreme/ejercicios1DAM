//Escribe un programa en java que lea desde teclado hasta un máximo de 111
// números enteros entre el -70 y el 70, ambos incluidos.
//• Si se introduce el 0, o bien se llegan a introducir los 111 dentro
// del rango, el programa terminará.
//• Los números introducidos fuera del rango no serán tenidos en cuenta a
// ningún efecto, y no se mostrará
// ningún mensaje cuando sean introducidos.
//• Al terminar, el programa mostrará los números (que estarán dentro del rango) que se hayan introducido
//pero en el orden inverso al de su introducción.


package ejercicio2;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int num;
		final int TOTAL = 111;
		int[] nums = new int[TOTAL];
		do
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			if(num >= -70 && num <= 70)
			{
				nums[cont] = num;
			}
			cont++;
		}
		while(num != 0 && cont < TOTAL);
		sc.close();
		for (int i = cont - 1; i >= 0 ;i--)
		{
			System.out.println(nums[i]);
		}
	}

}
