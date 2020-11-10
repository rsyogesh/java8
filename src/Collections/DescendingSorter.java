package Collections;

import java.util.Comparator;

public class DescendingSorter implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer one, Cricketer two) {
		if(one.year>two.year){
			return -1;
		}
		else if(one.year<two.year){
			return 1;
		}
		return 0;
	}

}
