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
    	personnalContactDetail rogerPCD = new personnalContactDetail(0652648432L, "roger.rabbit@gmail.com")
    	Senior Roger = new Senior("Rabbit", "Roger", 170033432285401L, 11111, rogerAdress);
        System.out.println(Roger);
        
        Adress bobAdress = new Adress(51, "Zone51", 51510, "Texas");
        Technician Bob = new Technician("Razowsky" ,"Bob", 382117745632103L, 12794, bobAdress);
        System.out.println(Bob);
        
        Adress williamAdress = new Adress(12, "Rivoli", 75001, "Paris");
        Commercial William = new Commercial("Sanders" ,"William", 175018078213601L, 85640, williamAdress, 850000);
        System.out.println(William);
    }
}