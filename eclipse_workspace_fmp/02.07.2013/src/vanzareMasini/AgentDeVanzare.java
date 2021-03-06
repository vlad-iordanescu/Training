package vanzareMasini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgentDeVanzare<T> {

	private String nume;

	private List<Vanzare<T>> vanzari = new ArrayList<Vanzare<T>>();

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Vanzare<T> getVanzare(int i) {
		return vanzari.get(i);
	}

	public void addVanzari(Vanzare<T> vanzare) {
		vanzari.add(vanzare);
	}

	public List<Vanzare<T>> getList() {
		return vanzari;
	}

	public Vanzare<T> mostExpensive() {
		Vanzare<T> mostExpensive = null;
		for (Vanzare<T> vanzare : vanzari) {
			if (mostExpensive == null) {
				mostExpensive = vanzare;
			}
			if (vanzare.getPret() > mostExpensive.getPret()) {
				mostExpensive = vanzare;
			}
		}
		return mostExpensive;
	}

	public void CarSpeedSort() {

		Collections.sort(vanzari, new Comparator<Vanzare<T>>() {

			@Override
			public int compare(Vanzare<T> o1, Vanzare<T> o2) {
				if (o1.getSpeed() > o2.getSpeed())
					return 1;
				else if (o1.getSpeed() < o2.getSpeed())
					return -1;
				return 0;
			}

		});

	}

}
