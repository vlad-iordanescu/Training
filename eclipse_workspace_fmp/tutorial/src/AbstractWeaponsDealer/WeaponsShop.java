package AbstractWeaponsDealer;

public class WeaponsShop{

	public Weapon Create (String Name) {
		if (Name.equals("TommyGun"))
			return new TommyGun();

		else if (Name.equals("Beretta"))
			return new Beretta();

		else if (Name.equals("Deagle"))
			return new Deagle();
		return null;
	}

}
