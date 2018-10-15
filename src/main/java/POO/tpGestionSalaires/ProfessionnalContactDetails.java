/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author formation
 *
 */
public class ProfessionnalContactDetails extends PersonnalContactDetails {

	/**
	 * @param phoneNumber
	 * @param mailAdress
	 */
	
	private String service;
	private Adress buisnessAdress;
	
	public ProfessionnalContactDetails(String countryNumber, long phoneNumber, String mailAdress, String service, Adress buisnessAdress) {
		super(countryNumber, phoneNumber, mailAdress);
		this.service = service;
		this.buisnessAdress = buisnessAdress;
	}

	@Override
	public String toString() {
		return "professionnalContactDetails [service=" + service + ", buisnessAdress=" + buisnessAdress + "]";
	}	
}
