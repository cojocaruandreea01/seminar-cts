package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo  {
	private ZooKeeper zookeeper;
	private List<Animal> animale;
	
	public Zoo(ZooKeeper z, List<Animal> animale) {
		super();
		this.zookeeper = zookeeper;
		this.animale = animale;
	}
	
	public Zoo() {
		super();
		this.zookeeper = new ZooKeeper("Adrian");
		this.animale = new ArrayList<>() ;
	}
	
	//metoda de adaugare animal in colectie
	public void AdaugareAnimal(Animal a) {
		this.animale.add(a);
	}
	
	//metoda prin care ingrijitorul sa hraneasca toate animalele din zoo
	public void HranesteAnimale() {
		for(Animal a : animale) {
			zookeeper.feed(a);
		}
	}
	//metoda pentru deplsare animale
	public void mutareAnimale() {
		for(Animal a : animale) {
			a.merge();
		}
	}
}
