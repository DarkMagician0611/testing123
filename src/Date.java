
public class Date {
	private int day, month, year;
	
	public Date() {
		day = 1;
		month = 1;
		year = 2018;
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void display() {
		System.out.println(day + "-" + month + "-" + year);
	}
}
