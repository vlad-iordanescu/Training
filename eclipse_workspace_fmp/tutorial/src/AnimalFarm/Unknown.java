package AnimalFarm;

class Unknown implements AnimalProp {
	protected String Usage;
	public String Name;

	@Override
	public String getUsage() {
		return Usage;
	}

	@Override
	public void setUsage(String NewUsage) {
		Usage = NewUsage;
	}
}