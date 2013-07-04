package AbstractWeaponsDealer;

public interface Weapon {
	public abstract String getType();

	public abstract void setType(String prop);

	public abstract void setAmmoType(String prop);

	public abstract void setAmmoNumber(int prop);

	public abstract String getAmmoType();

	public abstract int getAmmoNumber();
}
