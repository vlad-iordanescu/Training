package AbstractWeaponsDealer;

public class Beretta extends ShotgunsFactory {
	String Name = "Beretta";

	public String getType() {
		return "Semi-Auto Shotgun";
	}

	public String getAmmoType() {
		return "BuckShells";
	}

	public int getAmmoNumber() {
		return 2;
	}
}