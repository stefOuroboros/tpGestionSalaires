/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author formation
 *
 */
public class Commercial extends Employer {

	/**
	 * @param name
	 * @param surname
	 * @param healthID
	 * @param matricle
	 * @param adress
	 */
	int annualTurnover;
	
	public Commercial(String name, String surname, long healthID, int matricle, Adress adress, int annualTurnover) {
		super(name, surname, healthID, matricle, adress);
		this.annualTurnover = annualTurnover;
	}

	/* (non-Javadoc)
	 * @see POO.tpGestionSalaires.Employer#salary()
	 */
	@Override
	public int salary() {
		int annualBrutSalary = (annualTurnover * 5) / 100;
		//int annualBrutSalary = annualTurnover * fivePurcentTO;
		int taxes = (annualBrutSalary * 24) / 100;
		int annualSalary = annualBrutSalary - taxes;
		return annualSalary;
	}
	
	@Override
	public String toString() {
		return super.toString() + ". C'est un.e commercial.e ayant un salaire annuel de " + salary() + "€/ans";
	}

}
