package web.controller;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("esempio")
@SessionScoped

public class EsempioCDIBean {
	
	private BeanIniettato bean;

	@Inject
	public EsempioCDIBean(BeanIniettato bean)
	{
		
	}
	
	public BeanIniettato getBean() {
		return bean;
	}

	@Inject
	public void setBean(BeanIniettato bean) {
		this.bean = bean;
		//codice.......
	}
	
	
	
	
	
	

}
