package ioc_base;

import java.util.Arrays;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Loggami
@Interceptor
public class LoggamiInterceptor {
	

	@AroundInvoke
	public Object manageTransaction(InvocationContext ctx) throws Exception {
		System.out.println("before call to " + ctx.getMethod() + " with args " + Arrays.toString(ctx.getParameters()));
        Object returnMe = ctx.proceed();
        System.out.println("after call to " + ctx.getMethod() + " returned " + returnMe);
        return returnMe;
	}
}