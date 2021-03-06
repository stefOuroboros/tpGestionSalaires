/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author formation
 *
 */
public class Senior extends Employer {

	/**
	 * @param name
	 * @param surname
	 * @param healthID
	 * @param matricle
	 * @param adress
	 */
	public Senior(String name, String surname, long healthID, int matricle, Adress adress) {
		super(name, surname, healthID, matricle, adress);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int salary() {
		int rate = 16;
		int hoursADay = 8;
		int daysAYear = 212;
		int annualBrutSalary = rate * hoursADay * daysAYear;
		int taxes = (annualBrutSalary * 24) / 100;
		int annualSalary = annualBrutSalary - taxes;
		return annualSalary;
	}

	@Override
	public String toString() {
		return super.toString() + ". C'est un.e employé.e cadre ayant un salaire annuel de " + salary() + "€/ans";
	}
	
	

}
