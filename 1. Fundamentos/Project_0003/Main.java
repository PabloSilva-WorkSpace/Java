public class Main
{
	public static void main(String[] args)
	{
		System.out.println("In�cio do programa!");
		Calc calc; 			/* Cria��o de uma vari�vel refer�ncia para objetos da classe Calc */
		calc = new Calc();	/* Instancia��o de um objeto Calc */ 
		calc.set_a(14.8);
		calc.set_b(5.2);
		System.out.println(calc.sum());
	}
}
