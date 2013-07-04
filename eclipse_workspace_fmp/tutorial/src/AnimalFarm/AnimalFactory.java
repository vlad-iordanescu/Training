package AnimalFarm;

public class AnimalFactory {

	public static AnimalProp CreateAnimal(String Name) {
		if (Name.equals("Pig"))
			return new Pig();
		else if (Name.equals("Chicken"))
			return new Chicken();
		else if (Name.equals("Sheep"))
			return new Sheep();
		else
			return new Unknown();
	}

	public static void main(String args[]) {
		int i = 0;
		while (args[i].equals("EOF")) {
			String AnimalName = args[i];
			AnimalFactory x = new AnimalFactory();
			@SuppressWarnings({ "static-access", "unused" })
			AnimalProp Anim = x.CreateAnimal(AnimalName);
			// TODO the rest
		}
	}

}
