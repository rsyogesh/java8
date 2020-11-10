package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PracticeCollections {

	public static void main(String[] args) {
		ArrayList<String> test1 = new ArrayList<String>();
		test1.add("rashmi");
		test1.add("yogesh");
		test1.add("sai");
		test1.add(1, "mommy");
		
		for(String s: test1){
			System.out.println(s);                                  
		}
		
		System.out.println(test1.size());
		System.out.println(test1.contains("rashmi"));
		
		Iterator<String> iterator = test1.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str);
		}
		
		System.out.println(test1.indexOf("yogesh"));
		System.out.println(test1.get(3));
		test1.remove(1);
		
		Collections.sort(test1);
		System.out.println(test1);
		
		List<Cricketer> team = new ArrayList<Cricketer>();
		team.add(new Cricketer("sachin",176));
		team.add(new Cricketer("dhoni",167));
		team.add(new Cricketer("kohli",123));
		team.add(new Cricketer("sehwag",187));
		team.add(new Cricketer("singh",67));
		
		Collections.sort(team);
		System.out.println(team);
		
		Collections.sort(team,new DescendingSorter());
		System.out.println(team);
	}

}
