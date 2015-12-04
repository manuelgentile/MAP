package web.controller;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("sss")
public class EsempioEJBBean {
	@Inject
	private BeanIniettato bean;
	

}
