package ro.ase.cts.command;

public class Main {

	public static void main(String[] args) {
		
		try {
			ManagerComenzi manager=new ManagerComenzi();
			ContBancar cont=new ContBancar("RO234534", 0);
			manager.invoca(new ComandaConstituire(cont, 1000));
			manager.invoca(new ComandaDepunere(cont, 500));
			manager.executaComanda();
			manager.invoca(new ComandaRetragere(cont, 900));
			manager.invoca(new ComandaRetragere(cont, 700));
			manager.executaComenzi();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
