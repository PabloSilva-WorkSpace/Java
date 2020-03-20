public class Main
{
	private static int var_global = 10;
	
	public static void main(String[] args)
	{
		Car car1 = new Car();   /* 'car1' é uma variável local, pois esta declarada dentro do método 'main'. Sendo assim, 'car1' só pode ser acessada dentro deste método. */
		car1.set_manufacturer("Volkswagen");
		car1.set_model("Jetta");
		car1.set_year(2020);
		car1.show();
		System.out.println(car1.get_manufacturer());
		System.out.println(car1.get_model());
		System.out.println(car1.get_year());
		
		System.out.println("*****************************************");
		
		Car car2 = new Car();   /* 'car2' é uma variável local, pois esta declarada dentro do método 'main'. Sendo assim, 'car2' só pode ser acessada dentro deste método. */
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