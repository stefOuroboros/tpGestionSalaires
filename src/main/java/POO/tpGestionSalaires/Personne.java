package POO.tpGestionSalaires;

public abstract class Personne {

	private String name;
	private String surname;
	private int healthID;
	private Adress adress;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	/**
	 * @param name
	 * @param surname
	 * @param healthID
	 */
	public Personne(String name, String surname, int healthID, Adress adress) {
		super();
		this.name = name;
		this.surname = surname;
		this.healthID = healthID;
		this.adress = adress;
	}

}
