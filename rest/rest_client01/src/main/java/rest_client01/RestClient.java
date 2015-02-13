package rest_client01;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {

	public static void main(String[] args) {

		 //getta();
		crea();
	}

	private static void getta() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client
				.target("http://127.0.0.1:8080/commerce/rest/utente/get/1");
		Response response = target.request().get();
		Utente value = response.readEntity(Utente.class);
		System.out.println(value);
		response.close(); 
	}

	private static void crea() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client
				.target("http://127.0.0.1:8080/commerce/rest/utente/add");
		Utente ut = new Utente();
		ut.setNome("sssPippo");
		ut.setEta(12);
		ut.setUsername("spippo");
		ut.setPassword("spippo");
		Response response = target.request().post(
				Entity.entity(ut, MediaType.APPLICATION_JSON));

		System.out.println(response.getStatus());
		response.close(); 
	}

}