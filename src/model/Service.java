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
 * This class maintains the service and all the information about it.
 * @see java.lang.Object
 * @author Alejandro Garcia.<br>
 */
public class Service{

	//--------------------------------------------------------------------------------------------------

	//Constant

	//--------------------------------------------------------------------------------------------------
	public final static double BATH_P = 20000.0 ;
	public final static double BATHDOM_P = 30000.0;
	public final static double TEETH_P = 12000.0;
	public final static double NAILS_P = 8000.0;
	public final static double SHOT_P = 45000.0;
	public final static char BATH = 'b';
	public final static char BATHDOM = 'd';
	public final static char TEETH = 't';
	public final static char NAILS = 'n';
	public final static char SHOT = 's';

	//--------------------------------------------------------------------------------------------------

	//Attributes

	//--------------------------------------------------------------------------------------------------
	private char type;
	private double price;
	private String ownerId;
	private String petId;

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------
	private Pet clientPet;
	private DateIn serviceDate;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------
	
	/**
	 * Service constructor<br>
	 * @param type Is the type of service<br>
	 * @param ownerId Is the id of the owner<br>
	 * @param petId Is the id of the pet<br>
	 * @param pet A Pet object with which to initialize<br>
	 * @param serviceDate Is the day of the service<br>
	 */
	public Service(char type, String ownerId, String petId, Pet pet, DateIn serviceDate) {
		this.type = type;
		this.ownerId = ownerId;
		this.petId = petId;
		this.serviceDate = serviceDate;
		price = setInitialPrice();
	}

	/**
	 * <b>Gets</b> the service<br>
	 * @return an <code>char</code> specifying the service.<br>
	 */
	public  char getType() {
		return type;
	}

	/**
	 * <b>Sets</b> the client id.<br>
	 * @param type The client id<br>
	 */
	public void setType(char type) {
		this.type = type;
	}

	/**
	 * <b>Gets</b> the price of the service<br>
	 * @return an <code>double</code> specifying the price of the service.<br>
	 */
	public  double getPrice() {
		return price;
	}

	/**
	 * <b>Gets</b> the id of the owner<br>
	 * @return an <code>String</code> specifying the id of the owner.<br>
	 */
	public  String getOwnerId() {
		return ownerId;
	}

	/**
	 * <b>Sets</b> the client id.<br>
	 * @param ownerId The client id<br>
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * <b>Gets</b> the id of the pet<br>
	 * @return an <code>String</code> specifying the id of the pet.<br>
	 */
	public  String getPetId() {
		return petId;
	}

	/**
	 * <b>Sets</b> the pet id.<br>
	 * @param petId The pet id<br>
	 */
	public void setPetId(String petId) {
		this.petId = petId;
	}

	/**
	 * <b>Sets</b> the initial price of the service.<br>
	 * @return an <code>double</code> specifying the initial price
	 */
	public double setInitialPrice() {
		double depend = 0.0;
		switch (type) {
			case 'b':
				depend = BATH_P;
			break;
			case 'd':
				depend = BATHDOM_P;
			break;
			case 't':
				depend = TEETH_P;
			break;
			case 'n':
				depend = NAILS_P;
			break;
			case 's':
				depend = SHOT_P;
			break;	
		}
		return depend;
	}

	/**
	 * Shows all the information of the service
	 * @return an <code>String</code> specifying the service information
	 */
	public String toString() {
		String msg = "\n";
		msg += "\n";
		msg += "+-----------------------------------------------------------------------------+\n";
		msg += "| Service: "+type2String(type)+"\n";
		msg += "| Price: "+price+" COP\n";
		msg += "| Owner ID: "+ownerId+"\n";
		msg += "| Pet's name: " +petId+ "\n";
		msg += "| Date of the service: " +serviceDate.convertDateToString()+"\n";
		msg += "+-----------------------------------------------------------------------------+\n";
		return msg;
	}

	/**
	 * convert a char constant in a String of the service
	 * @param type Is the type of service  
	 * @return an <code>String</code> specifying the service
	 */
	public String type2String(char type) {
		String selection = "";
		switch (type) {
			case BATH:
				selection = "Bath";
			break;
			case BATHDOM:
				selection = "Bath to go";
			break;
			case TEETH:
				selection = "Dental prophylaxis";
			break;
			case NAILS:
				selection = "Cutting nails";
			break;
			case SHOT:
				selection = "Vaccination";
			break;	
		}
		return selection;
	}

}