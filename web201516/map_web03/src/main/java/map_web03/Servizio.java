package map_web03;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("ciccio")
public class Servizio implements Serializable {
	private int i;
	
	public String getData()
	{
		return ""+new Date();
	}
	
	
	//

}
