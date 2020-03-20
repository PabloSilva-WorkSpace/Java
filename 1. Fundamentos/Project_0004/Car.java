public class Car
{
	/*** <ATRIBUTOS> ****************************************************************************************************************************************
	#
	************************************************************************************************************************************************************/
	private String manufacturer = new String();
	private String model = new String();
	private int year;
	private static int varStatic;
	
	
	/*** <CONSTRUTORES> ****************************************************************************************************************************************
	#1 - Construtores não são métodos, nem métodos especiais. Construtores inicializam um objeto na fase de construção.
	#2 - Construtores não retornam valor
	************************************************************************************************************************************************************/
	Car()
	{
		
	}
	
	/*** <MÉTODOS> *********************************************************************************************************************************************
	#
	************************************************************************************************************************************************************/
	public void set_model(String model){
		this.model = model;
	}
	
	public String get_model(){
		return (this.model);
	}
	
	public void set_year(int year){
		this.year = year;
	}
	
	public int get_year(){
		return (this.year);
	}
	
	public void set_manufacturer(String manuf){
		this.manufacturer = manuf;
	}
	
	public String get_manufacturer(){
		return (this.manufacturer);
	}
	
	public void set_varStatic(int varStatic){
		this.varStatic = varStatic;
	}
	
	public int get_varStatic(){
		return (this.varStatic);
	}
	
	public void show(){
		System.out.println(this.manufacturer);
		System.out.println(this.model);
		System.out.println(this.year);
	}
}