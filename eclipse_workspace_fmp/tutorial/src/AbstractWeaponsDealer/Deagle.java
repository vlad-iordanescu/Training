package AbstractWeaponsDealer;

class Deagle extends HandGunsFactory {
	String Name = "Deagle";

	public String getType() {
		return "Semi-Auto Pistol";
	}

	public String getAmmoType() {
		return "NormalShells";
	}

	public int getAmmoNumber() {
		return 8;
	}
}