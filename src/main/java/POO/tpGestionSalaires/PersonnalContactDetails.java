/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author formation
 *
 */
public class PersonnalContactDetails {

	/**
	 * @param args
	 */
	
	private String countryNumber;
	private long phoneNumber;
	
	private String mailAdress;
	/**
	 * @param phoneNumber
	 * @param mailAdress
	 */
	public PersonnalContactDetails(String countryNumber, long phoneNumber, String mailAdress) {
		super();
		this.countryNumber = countryNumber;
		this.phoneNumber = phoneNumber;
		this.mailAdress = mailAdress;
	}
	
	@Override
	public String toString() {
		return "personalContactDetails [phoneNumber=" + countryNumber + phoneNumber + ", mailAdress=" + mailAdress + "]";
	}
}
