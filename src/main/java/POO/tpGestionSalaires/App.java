package POO.tpGestionSalaires;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Adress rogerAdress = new Adress(55, "Crossroad", 34080, "Montpellier");
    	Adress dtaAdress = new Adress(210, "Route de la route", 34000, "Montpellier");
    	PersonnalContactDetails rogerPCD = new PersonnalContactDetails("+33",652648432L, "roger.rabbit@gmail.com");
    	ProfessionnalContactDetails rogerProfCD = new ProfessionnalContactDetails("+33", 482935264L, "rrabbit@gmail.com", "pôle développement", dtaAdress);
    	Senior Roger = new Senior("Rabbit", "Roger", 170033432285401L, 11111, rogerAdress);
        System.out.println(Roger + "\n");
        System.out.println(rogerPCD);
        System.out.println(rogerProfCD + "\n" + "\n");
        
        Adress bobAdress = new Adress(51, "Zone51", 51510, "Texas");
        Adress bobDtaAdress = new Adress(210, "Route de la route", 34000, "Montpellier");
        PersonnalContactDetails bobPCD = new PersonnalContactDetails("+33",632323232L, "bob.razowsky@gmail.com");
    	ProfessionnalContactDetails bobProfCD = new ProfessionnalContactDetails("+33", 482935252L, "bob.dta@gmail.com", "Service technique", bobDtaAdress);
        Technician Bob = new Technician("Razowsky" ,"Bob", 382117745632103L, 12794, bobAdress);
        System.out.println(Bob + "\n");
        System.out.println(bobPCD);
        System.out.println(bobProfCD + "\n" + "\n");
        Adress williamAdress = new Adress(12, "Rivoli", 75001, "Paris");
        Adress wDtaAdress = new Adress(210, "Route de la route", 34000, "Montpellier");
        PersonnalContactDetails williamPCD = new PersonnalContactDetails("+33",652648432L, "roger.rabbit@gmail.com");
    	ProfessionnalContactDetails williamProfCD = new ProfessionnalContactDetails("+33", 482935352L, "william.dta@gmail.com", "Service commercial", wDtaAdress);
        Commercial William = new Commercial("Sanders" ,"William", 175018078213601L, 85640, williamAdress, 850000);
        System.out.println(William + "\n");
        System.out.println(williamPCD);
        System.out.println(williamProfCD);
    }
}