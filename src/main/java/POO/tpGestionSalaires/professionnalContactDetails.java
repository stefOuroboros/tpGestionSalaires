/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author formation
 *
 */
public class professionnalContactDetails extends personalContactDetails {

	/**
	 * @param phoneNumber
	 * @param mailAdress
	 */
	
	private String service;
	private Adress buisnessAdress;
	
	public professionnalContactDetails(int phoneNumber, String mailAdress, String service, Adress buisnessAdress) {
		super(phoneNumber, mailAdress);
		this.service = service;
		this.buisnessAdress = buisnessAdress;
	}

}
