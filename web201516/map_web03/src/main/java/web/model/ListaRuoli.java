package web.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ListaRuoli {
	private List<Ruolo>  ruoli;

	public List<Ruolo> getRuoli() {
		return ruoli;
	}

	public void setRuoli(List<Ruolo> ruoli) {
		this.ruoli = ruoli;
	}
	
	

}
