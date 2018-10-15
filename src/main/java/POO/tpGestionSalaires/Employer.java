/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author Steph
 *
 */

public abstract class Employer extends Personne {
	
	private int matricle;
	
	/**
	 * @param name
	 * @param surname
	 * @param healthID
	 * @param matricle
	 * @param adress
	 */
	
	public Employer(String name, String surname, long healthID, int matricle, Adress adress) {
		super(name, surname, healthID, adress);
		this.matricle = matricle;
	}
	
	@Override
	public String toString() {
		return super.toString()+". Employé immatriculé " + matricle + getAdress();
	}

	public abstract int salary ();

}
