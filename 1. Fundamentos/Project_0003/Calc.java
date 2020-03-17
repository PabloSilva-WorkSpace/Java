public class Calc
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