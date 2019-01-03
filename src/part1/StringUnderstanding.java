package part1;

public class StringUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User yasir = new User();
		yasir.name = "yasir";
		yasir.age = 40;
		
		User dany = new User();
		dany.name = "dany";
		dany.age = 14;
		
		
		User yasir2 = yasir;
		
		dany.name = "yasir";
		dany.age = 40;
		
		
		System.out.println(yasir +" "+ yasir2);
		System.out.println(yasir == yasir2);
		System.out.println(yasir == dany);
		System.out.println(yasir.equals(dany));



	
	
	
	}

}
