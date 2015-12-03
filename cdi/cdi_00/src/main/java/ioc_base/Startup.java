package ioc_base;

import javax.enterprise.event.Observes;

import org.jboss.weld.environment.se.events.ContainerInitialized;

public class Startup {

	
	public void inizia(@Observes ContainerInitialized event) {

		
		System.out.println("DDDWDW");
		//Scanner s=new Scanner(System.in);
		//s.nextInt();
	}

}
