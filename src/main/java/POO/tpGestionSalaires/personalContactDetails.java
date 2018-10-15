/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author formation
 *
 */
public class personalContactDetails {

	/**
	 * @param args
	 */
	
	private int phoneNumber;
	@Override
	public String toString() {
		return "personalContactDetails [phoneNumber=" + phoneNumber + ", mailAdress=" + mailAdress + "]";
	}
	private String mailAdress;
	/**
	 * @param phoneNumber
	 * @param mailAdress
	 */
	public personalContactDetails(int phoneNumber, String mailAdress) {
		super();
		this.phoneNumber = phoneNumber;
		this.mailAdress = mailAdress;
	}
}
