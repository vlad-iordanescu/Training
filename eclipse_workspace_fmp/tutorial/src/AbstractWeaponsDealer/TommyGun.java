package AbstractWeaponsDealer;

public class TommyGun extends MachineGunsFactory {
	String Name = "TommyGun";

	public String getType() {
		return "Semi-Automatic";
	}

	public String getAmmoType() {
		return "NormalShells";
	}

	public int getAmmoNumber() {
		return 32;
	}
}