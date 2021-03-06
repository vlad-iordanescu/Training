package vanzareMasini;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Main {

	public HashMap<AgentDeVanzare<Car>, Vanzare<Car>> CreateMap (AgentDeVanzare<Car> vanzatori[]) {
		
		HashMap<AgentDeVanzare<Car>, Vanzare<Car>> map = new HashMap<AgentDeVanzare<Car>, Vanzare<Car>>();
		for(int i = 0 ; i<vanzatori.length;i++){
			map.put(vanzatori[i], vanzatori[i].mostExpensive());
		}
		return map;
	}
	
	public AgentDeVanzare<Car> BinarySearch(String name, List<AgentDeVanzare<Car>> listVanzatori){
		
		Collections.sort(listVanzatori,new Comparator<AgentDeVanzare<Car>>() {

			public int compare(AgentDeVanzare<Car> o1, AgentDeVanzare<Car> o2) {
				return o1.getNume().compareTo(o2.getNume());
			}
		});
		AgentDeVanzare<Car> agentNou= new AgentDeVanzare<Car>();
		agentNou.setNume(name);
		int i=0;
		i=Collections.binarySearch(listVanzatori, agentNou, new Comparator<AgentDeVanzare<Car>>() {

			public int compare(AgentDeVanzare<Car> o1, AgentDeVanzare<Car> o2) {
				return o1.getNume().compareTo(o2.getNume());
			}
		});
		return listVanzatori.get(i);
		
	}
	
	public static void main(String[] args) {
		AgentDeVanzare<Car> adrian = new AgentDeVanzare<Car>();
		Vanzare<Car> car1 = new Vanzare<Car>();
		Vanzare<Car> car2 = new Vanzare<Car>();
		Vanzare<Car> car3 = new Vanzare<Car>();

		adrian.setNume("Adrian");
		car1.setPret(20000);
		car2.setPret(60000);
		car3.setPret(15000);

		car1.setSpeed(200);
		car2.setSpeed(250);
		car3.setSpeed(180);

		Car carModel1 = new Car();
		car1.setItem(carModel1);

		Car carModel2 = new Car();
		car2.setItem(carModel2);

		Car carModel3 = new Car();
		car3.setItem(carModel3);

		adrian.addVanzari(car1);
		adrian.addVanzari(car2);
		adrian.addVanzari(car3);

		for (int i = 0; i < 3; i++) {
			System.out.println(adrian.getVanzare(i).getSpeed());
		}
		adrian.CarSpeedSort();

		System.out.println("");
		for (int i = 0; i < 3; i++) {
			System.out.println(adrian.getVanzare(i).getSpeed());
		}

		System.out.println("");
		System.out.println(adrian.mostExpensive().getPret());
		
		

	}

}
