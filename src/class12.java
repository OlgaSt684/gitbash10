
public class class12 {

	public static void main(String[] args) {
		String [] names= {"Alex","Olga","Lili","Artur","Mika","Ulia","Peter","Luka"};
		for(int i=0; i<names.length; i++)
		System.out.print(names[i]+" ");
		
		System.out.println("   ");
		System.out.println("---------TASK ABOT CAR-----------");
		//CARS ARRAY II Variant
		
		String [] cars = {"Toyota","Honda","KIA","Tesla","BMW","Mercedes"};
		for(int c=0; c<cars.length; c++) {
			System.out.print(cars[c]+" ");}
		
		//CARS ARRAY II Variant Advanced FOR LOOP
		System.out.println("    ");
		for(String car : cars) {System.out.print(car+" ");}
		
		
		System.out.println("____________NUMBERS ARRAY________");
		
		
		
		int []numbers= {100,20,67,45,90,23};
		for(int n=0; n<numbers.length;n++) {System.out.print(numbers[n]+" ");}
		System.out.println("    ");
		System.out.println("Second variante");
		for(int nym:numbers) {System.out.print(nym+" ");}
		
		System.out.println("    ");
		System.out.println("-----------char array EXAMPLE-------------");
				
	char[] grade ={'A','B','C','D','E','F'};
	
	for(char gr: grade) {System.out.print(gr+" ");}
	System.out.println("    ");
	
	for(int f=grade.length-1; f>=0; f--) {System.out.print(grade[f]+" ");}
	
	System.out.println("  ");
		
			

	}

}
