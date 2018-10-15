/**
 * 
 */
package POO.tpGestionSalaires;

/**
 * @author Steph
 *
 */

public class Employer extends Personne {
	
	private int matricle;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param name
	 * @param surname
	 * @param healthID
	 * @param matricle
	 * @param adress
	 */
	public Employer(String name, String surname, int healthID, int matricle, Adress adress) {
		super(name, surname, healthID, adress);
		this.matricle = matricle;
	}

}
