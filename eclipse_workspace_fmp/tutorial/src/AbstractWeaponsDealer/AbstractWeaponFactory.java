package AbstractWeaponsDealer;

public abstract class AbstractWeaponFactory implements Weapon{
	
	public String Name;
	
	@SuppressWarnings("unused")
	private String Type;
	
	@SuppressWarnings("unused")
	private String Ammotype;
	
	@SuppressWarnings("unused")
	private int AmmoNumber;

	public abstract String getType();

	public abstract void setType(String prop);

	public abstract void setAmmoType(String prop);

	public abstract void setAmmoNumber(int prop);

	public abstract String getAmmoType();

	public abstract int getAmmoNumber();

}
