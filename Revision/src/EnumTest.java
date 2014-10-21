import java.util.EnumSet;


public enum EnumTest
{
	Luis("30","calvo"),
	Jose("33","moreno"),
	Pepe("5","moreno");
	
	private  String  edad;
	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	private  String pelo;
	
	private  EnumTest(String age, String hair)
	{
		edad=age;
		pelo=hair;
	}
	
	
	public static void main(String args[])
	{
		for(EnumTest test: EnumTest.values())
		{
			System.out.printf("%s\t %s\t %s\n" ,test,test.getEdad(),test.getPelo());
		}
		
		System.out.println("\n\nRange of enum");
		for(EnumTest test: EnumSet.range(EnumTest.Luis,EnumTest.Jose))
		{
			System.out.printf("%s\t %s\t %s\n" ,test,test.getEdad(),test.getPelo());
		}
	}
}
