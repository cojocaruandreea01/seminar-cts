package ro.ase.cts.template;
import ro.ase.cts.template.Masa;
import ro.ase.cts.template.MasaInBar;
import ro.ase.cts.template.TemplateOcupareMasa;


public class Main {

	public static void main(String[] args) {
		TemplateOcupareMasa masa = new Masa(23); 
		masa.ocupaMasa();
		TemplateOcupareMasa masa2 = new MasaInBar(23); 
		masa2.ocupaMasa();
	}

}
