package POO.tpGestionSalaires;

public abstract class Personne {

	private String name;
	private String surname;
	private long healthID;
	@Override
	public String toString() {
		return surname + " " + name + " (numéro de sécurité sociale : " + healthID + ")";
	}


	private Adress adress;
	
	
	public Adress getAdress() {
		return adress;
	}


	public void setAdress(Adress adress) {
		this.adress = adress;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	/**
	 * @param name
	 * @param surname
	 * @param healthID
	 */
	public Personne(String name, String surname, long healthID, Adress adress) {
		super();
		this.name = name;
		this.surname = surname;
		this.healthID = healthID;
		this.adress = adress;
	}

}
