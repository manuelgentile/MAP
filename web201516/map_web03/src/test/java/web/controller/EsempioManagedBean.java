package web.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="esempio")
@SessionScoped
public class EsempioManagedBean {
	@ManagedProperty("#{ddd}")
	private BeanIniettato bean;
	

}
