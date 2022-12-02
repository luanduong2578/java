package java_32_GET_SET;

import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	public MyDate(int day, int month, int year) {
		if (day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}

		if (year > 0) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}
	@Override
	public String toString() {
		return "Ngay: "+ this.day + "/"+ this.month +"/"+this.year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		if (day > 0 && day <= 31) {
			this.day = day;
		}
	}

	public void setMonth(int month) {
		if (month > 0 && month <= 12) {
			this.month = month;
		}
	}

	public void setYear(int year) {
		if (year > 0) {
			this.year = year;
		}
	}
	

}
