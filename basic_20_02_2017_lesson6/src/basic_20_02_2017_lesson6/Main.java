package basic_20_02_2017_lesson6;

public class Main {

	public static void main(String[] args) {
		String [] names = {"anton", "ira", "petro", "marta"};
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i].);
//		}
//		for (String name : names){
//			System.out.println(name);
//		}
//		System.out.println(names.length);
		
		int coins [] = {50,25,10,2,2,1};
		int number = 127;
		for (int i : coins) {
			if (number>=i){
				System.out.println(i+" = "+number/i);
				number = number%i;
			}
		}
		
		
		
		
	}
}
