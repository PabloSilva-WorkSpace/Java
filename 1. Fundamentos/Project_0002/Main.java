public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Início do programa!");
		Calc calc; 			/* Criação de uma variável referência para objetos da classe Calc */
		calc = new Calc();	/* Instanciação de um objeto Calc */ 
		calc.set_a(7.8);
		calc.set_b(2.2);
		System.out.println(calc.sum());
	}
}

class Calc
{
	/************************************
	# Atributos da classe 
	*************************************/
	private double a;  /* A Keyword "private" realiza o encapsulamento do dado a */
	private double b;  /* A Keyword "private" realiza o encapsulamento do dado b */
	
	/************************************
	# Construtores da classe 
	*************************************/
	Calc()
	{
		this.a = 0.0;
		this.b = 0.0;
	}
	
	/************************************
	# Métodos da classe 
	*************************************/
	public void set_a(double a)
	{
		this.a = a;
	}
	
	public void set_b(double b)
	{
		this.b = b;
	}
	
	public double sum()
	{
		return (this.a + this.b);
	}
	
	public double sub()
	{
		return (this.a - this.b);
	}
}