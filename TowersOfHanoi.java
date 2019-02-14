
public class TowersOfHanoi {
	
	
	public TowersOfHanoi() {
		
	}
	
	public void printPoles(int sourceDisks, int destDisks, int spareDisks) {
		for(int i = 0; i < 7; i++) {
			System.out.println();			
		}
		makePole(sourceDisks, "Source");
		makePole(destDisks, "Dest");
		makePole(spareDisks, "Spare");
	}
	
	
	
	private void makePole(int disks, String name) {
		
		for(int i = 0; i < 10-disks; i++) {
			System.out.println("          |          ");
		}
		
		for(int i = 0; i < disks; i++) {
			System.out.println("##########|##########");
		}
		
		System.out.println("~~~~~~~~~~|~~~~~~~~~~");

		System.out.println("       "+name+"     ");
		System.out.println("\n");
	}
	
}
