package ioc_base;

import java.util.Scanner;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Client {
	

	public static void main(String[] args) {
		// MyFactory m = MyFactory.getInstance();

		// MyService service = m.getMyServiceImpl();


		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		
		MyService service=container.select(MyService.class).get();
		System.out.println(service.getValue());
		
		
		Scanner s=new Scanner(System.in);
		s.nextInt();
		
		container.shutdown();
	}

}
