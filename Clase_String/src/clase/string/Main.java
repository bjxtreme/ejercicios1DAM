package clase.string;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		String cadena = "hola";
		System.out.println("La cadena "  + cadena +
				" tiene " + cadena.length() + " caracteres.");


		for (int i = 0; i < cadena.length(); i++)
		{
			System.out.println(cadena.charAt(i));
		}


		cadena = "Este es un método muy curioso.";
		String[] troceado = cadena.split(" ");
		for (int i = 0; i < troceado.length; i++)
		{
			System.out.println(troceado[i]);
		}


	}

}
