/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author formation
 *
 */
public class ProfessionnalContactDetails extends PersonalContactDetails {

	/**
	 * @param phoneNumber
	 * @param mailAdress
	 */
	
	private String service;
	private Adress buisnessAdress;
	
	public ProfessionnalContactDetails(long phoneNumber, String mailAdress, String service, Adress buisnessAdress) {
		super(phoneNumber, mailAdress);
		this.service = service;
		this.buisnessAdress = buisnessAdress;
	}

	@Override
	public String toString() {
		return "professionnalContactDetails [service=" + service + ", buisnessAdress=" + buisnessAdress + "]";
	}	
}
