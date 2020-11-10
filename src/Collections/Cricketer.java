package Collections;

public class Cricketer implements Comparable<Cricketer> {
	String name;
	int year;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public Cricketer(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "Cricketer [nzbc=" + name + ", year=" + year + "]";
	}


	@Override
	public int compareTo(Cricketer that) {
		if(this.year>that.year){
			return 1;
		}
		else if(this.year<that.year){
			return -1;
		}
		
			return 0;
		
				
	}
}
