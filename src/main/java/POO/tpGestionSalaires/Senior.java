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
	public Senior(String name, String surname, int healthID, int matricle, Adress adress) {
		super(name, surname, healthID, matricle, adress);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int salary() {
		int rate = 12;
		int hours = 8;
		return 0;
	}

}
