/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID : A00358891
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
 * @author: ALEJANDRO GARCIA QUIÑONEZ <alejo.gar.122@gmail.com>
 * 
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */
package model;

/**
 * This class maintains the time.<br>
 * @author Alejandro Garcia.<br>
 */
public class DateIn {

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------
	
	//--------------------------------------------------------------------------------------------------

	//Attributes

	//--------------------------------------------------------------------------------------------------
	private int day;
	private int month;
	private int year;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	/**
	 * DateIn constructor<br>
	 * @param day Is the number of the current day in the month<br>
	 * @param month Is the number of the current month<br>
	 * @param year Is the current year<br>
	 */
	public DateIn(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
	}

	/**
	 * <b>Gets</b> the medicine name<br>
	 * @return an <code>integer</code> specifying the medicine name.<br>
	 */
	public  int getDay() {
		return day;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param day The dose of the medicine<br>
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * <b>Gets</b> the medicine name<br>
	 * @return an <code>integer</code> specifying the medicine name.<br>
	 */
	public  int getMonth() {
		return month;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param month The dose of the medicine<br>
	 */
	public void setMonth(int month) {
		this.month = month;
	}


	/**
	 * <b>Gets</b> the medicine name<br>
	 * @return an <code>integer</code> specifying the medicine name.<br>
	 */
	public  int getYear() {
		return year;
	}

	/**
	 * <b>Sets</b> the dose of the medicine.<br>
	 * @param year The dose of the medicine<br>
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Shows a String of the date
	 * @return an <code>String</code> specifying the date
	 */
	public String convertDateToString() {
		String msg = "";
		msg += Integer.toString(day);
		msg += "/";
		msg += Integer.toString(month);
		msg += "/";
		msg += Integer.toString(year);
 		return msg;
	}

}