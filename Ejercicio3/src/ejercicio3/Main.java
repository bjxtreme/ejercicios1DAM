//Completa el siguiente programa en java que primero rellena, y después muestra, un array de enteros de dos
//dimensiones.
//• El usuario, desde consola, decide el número de filas y columnas.
//• Las celdas se irán rellenando desde el número 0 e incrementándose
// de 4 en 4.
//• Se empezará por la columna de la derecha y cada columna se rellenará desde abajo.
//• Ejemplo de un array de 5 filas y 7 columnas:
//136 116 96 76 56 36 16
//132 112 92 72 52 32 12
//128 108 88 68 48 28 8
//124 104 84 64 44 24 4
//120 100 80 60 40 20 0
package ejercicio3;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System. out .print("Filas: ");
		int filas = teclado.nextInt();
		System. out .print("Columnas: ");
		int columnas = teclado.nextInt();
		teclado.close();
		int[][] nums = new int[filas][columnas];
		int cont = 0;
		for (int c = nums[0].length - 1; c >= 0 ; c--)
		{
			for (int f = nums.length - 1; f >= 0 ;f--)
			{
				nums[f][c] = cont;
				cont += 4;
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
	}
}
