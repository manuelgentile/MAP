package ioc_base;

import java.util.Scanner;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;

public class Startup2 {
	MyService service;
	
	@Inject @Prova
	public Startup2(MyService p)
	{
		this.service=p;
		
	}
	
	/*@Inject @Prova 
	public void setService(MyService p)
	{
	}*/
	
	public void inizia(@Observes ContainerInitialized event) {

		System.out.println("sono io!");
		System.out.println(service.getValue());
		//Scanner s=new Scanner(System.in);
		//s.nextInt();
	}

}
