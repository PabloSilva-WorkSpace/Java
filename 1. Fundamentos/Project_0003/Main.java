public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Início do programa!");
		Calc calc; 			/* Criação de uma variável referência para objetos da classe Calc */
		calc = new Calc();	/* Instanciação de um objeto Calc */ 
		calc.set_a(14.8);
		calc.set_b(5.2);
		System.out.println(calc.sum());
	}
}
