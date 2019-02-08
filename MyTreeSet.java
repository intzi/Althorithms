import java.util.TreeSet;

public class MyTreeSet<E> extends TreeSet<E>{
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {

		String strResult = "";
		for (E item : this) {
			strResult += item+"\n";
		}
		
		return strResult;
	}
}
