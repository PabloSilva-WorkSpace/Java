public class Main
{
	private static int var_global = 10;
	
	public static void main(String[] args)
	{
		Car car1 = new Car();   /* 'car1' � uma vari�vel local, pois esta declarada dentro do m�todo 'main'. Sendo assim, 'car1' s� pode ser acessada dentro deste m�todo. */
		car1.set_manufacturer("Volkswagen");
		car1.set_model("Jetta");
		car1.set_year(2020);
		car1.show();
		System.out.println(car1.get_manufacturer());
		System.out.println(car1.get_model());
		System.out.println(car1.get_year());
		
		System.out.println("*****************************************");
		
		Car car2 = new Car();   /* 'car2' � uma vari�vel local, pois esta declarada dentro do m�todo 'main'. Sendo assim, 'car2' s� pode ser acessada dentro deste m�todo. */
		car2.set_manufacturer("Toyota");
		car2.set_model("Corola");
		car2.set_year(2020);
		car2.show();
		System.out.println(car2.get_manufacturer());
		System.out.println(car2.get_model());
		System.out.println(car2.get_year());
		
		System.out.println("*****************************************");
		
		car1.set_varStatic(123);   
		System.out.println(car1.get_varStatic());
		System.out.println(car2.get_varStatic());
		car2.set_varStatic(321);
		System.out.println(car2.get_varStatic());
		System.out.println(car1.get_varStatic());
		
		System.out.println("*****************************************");
		
		System.out.println(var_global);
		var_global = 20;
		System.out.println(var_global);
	}
}