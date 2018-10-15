/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author formation
 *
 */
public class PersonalContactDetails {

	/**
	 * @param args
	 */
	
	private long phoneNumber;
	
	private String mailAdress;
	/**
	 * @param phoneNumber
	 * @param mailAdress
	 */
	public PersonalContactDetails(long phoneNumber, String mailAdress) {
		super();
		this.phoneNumber = phoneNumber;
		this.mailAdress = mailAdress;
	}
	
	@Override
	public String toString() {
		return "personalContactDetails [phoneNumber=" + phoneNumber + ", mailAdress=" + mailAdress + "]";
	}
}
