package AbstractWeaponsDealer;

public class Client {
	public static void main(String args[]) {
		WeaponsShop x = new WeaponsShop();
		@SuppressWarnings("unused")
		Weapon receive = x.Create(args[0]);
		//TODO the rest
	}
}
