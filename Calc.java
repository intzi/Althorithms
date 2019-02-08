
public class Calc {
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int gcd(int a, int b) {
		
		while(a % b != 0) {
			
			int tempB = b;
			b = a % b;
			a = tempB;
		}
		
		return b;
	}
	
	
	/* ~~Simple Power Algorithm~~
	 * ~Compute b to the power of N~
	 * 1) Set p = 1.
	 * 2) For i=1,...,n, repeat:
	 * 		2.1) Multiply p by b
	 * 3) Return p
	 */
	
	public long simplePowerCalc(int number, int power) {
		long p = 1;
		System.out.print("Simple algorithm steps: ");
		for(int i=1; i<=power; i++) {
			System.out.print("+");
			p *= number;
		}
		System.out.println();
		return p;
	}
	
	/* ~~Smart Power Algorithm~~
	 * ~Compute b to the power of N~
	 * 1) Set p = 1, set q = b, set m = n
	 * 2) While m > 0, repeat:
	 *		2.1) If m is odd, multiply p by q
	 *		2.2) Halve m (discarding any remainder).
	 * 		2.3) Multiply q by itself.
	 * 3) Terminate returning p
	 */
	
	public long smartPowerCalc(int number, int power) {
		
		long p = 1;
		long q = number;
		int m = power;
		System.out.print("Smart algorithm steps: ");
		while(m > 0) {
			System.out.print("+");
			if(m % 2 == 1)
				p *= q;
			m = m / 2;
			q *= q;
		}
		System.out.println();
		return p;
	}
	
	/* ~~Rendering to to the base in the range 2..10~~
	 * 
	 * 1) Set i = number, r = base
	 * 2) If i < 0:
	 *		1.1) Render character '-'
	 * 		1.2) Render(-i) to the base of r
	 * 3) If 0 <= i < r:
	 *		2.1) Let d be the digit corresponding to i
	 *		2.1) Render digit d
	 * 4) Else if:
	 *		3.1) Let d be the digit corresponding to the (i modulo r)
	 *		3.2) Render(i/r) to the base r
	 *		3.3) Render the digit d.
	 *
	 */
	
	public String render(int number, int base) {
		
		String str = "";
		int i = number;
		int r = base;
		
		if(i < 0) {
			str += "-";
			str += render(-i, r);
		}else if(i < r) {
			char d = (char) ('0' + i);
			str += d;
		}else {
			char d = (char) ('0' + (i % r));
			str += render(i/r , r);
			str += d;
		}
		
		return str;
	}



}
