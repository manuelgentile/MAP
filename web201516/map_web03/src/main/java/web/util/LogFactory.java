package web.util;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@ApplicationScoped
public class LogFactory {

	@Produces
	Logger createLogger(InjectionPoint injectionPoint) {
		return Logger.getLogger(

				injectionPoint.getMember().getDeclaringClass().getName()

		);
	}

}