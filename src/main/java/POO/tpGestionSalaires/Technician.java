package POO.tpGestionSalaires;

public class Technician extends Employer {
	
	/**
	 * @param name
	 * @param surname
	 * @param healthID
	 * @param matricle
	 * @param adress
	 */

	public Technician(String name, String surname, long healthID, int matricle, Adress adress) {
		super(name, surname, healthID, matricle, adress);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int salary() {
		int rate = 12;
		//int hoursADay = 9;
		int hoursAYear = 1607;
		int annualBrutSalary = rate * hoursAYear;
		int taxes = (annualBrutSalary * 24) / 100;
		int annualSalary = annualBrutSalary - taxes;
		return annualSalary;
	}

	@Override
	public String toString() {
		return super.toString() + ". C'est un.e technicien.ne ayant un salaire annuel de " + salary() + "€/ans";
	}
}
