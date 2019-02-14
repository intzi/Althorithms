
public class MyMain {

	public static int a = 2;
	
	public static void main(String[] args) {
		
		
		//Calculate the Greatest Common Divisor of 77 and 21.
		
		/*
		Calc calc = new Calc();
		System.out.println(calc.gcd(77, 21));
		*/
	
		//---------------------------------------------------
		
		// My Generic Tree Set. ABC Sorting.
		
		/*
		MyTreeSet<String> myTree = new MyTreeSet<>();
		myTree.add("me");
		myTree.add("from");
		myTree.add("Hello");
		System.out.println(myTree);
		*/
		
		//---------------------------------------------------
		
		// Power Calculator - Simple - Smart
		
		/*
		Calc calc = new Calc();
		System.out.println("Simple Algorithm: "+calc.simplePowerCalc(2, 16));
		System.out.println("Smart Algorithm: "+calc.smartPowerCalc(2, 16));
		*/
		
		//---------------------------------------------------
		
		// Rendering to the base r, where r in the range from 2...10
		
		/*
		Calc calc = new Calc();
		System.out.println(calc.render(9, 8));
		*/
		
		// ~~~~~~~~~~ Towers of Hanoi ~~~~~~~~~~~
		/*
			TowersOfHanoi toh = new TowersOfHanoi();
			toh.printPoles(10, 0, 0);
			for(int i = 0; i < 10; i++) {
				try {
					toh.printPoles(10-i, 0, i);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			toh.printPoles(0, 1, 9);
			
			for(int i = 0; i < 10; i++) {
				try {
					toh.printPoles(0, 1+i, 9-i);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		*/
	}

}
