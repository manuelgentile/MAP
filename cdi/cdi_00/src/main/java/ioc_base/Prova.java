package ioc_base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

import javax.inject.Qualifier;

@Qualifier
@Target({TYPE, METHOD, PARAMETER, FIELD,CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Prova {

}
