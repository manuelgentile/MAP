package rest_client_http;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.Gson;

public class MainHttp {

	public static void main(String[] args) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(
				"http://127.0.0.1:8080/commerce/rest/utente/get/1");

		try {
			CloseableHttpResponse response = httpclient.execute(httpget);

			HttpEntity e = response.getEntity();

			Scanner s = new Scanner(e.getContent());

			String content = s.nextLine();

			
			Gson gson=new Gson();
			Utente u = gson.fromJson(content, Utente.class);  
			
			System.out.println(u);
			
			
			/*
			
			String r=content.substring(1,content.length()-1);
			
			String[] rr=r.split(",");
			
			
			
			
			Utente u=new Utente();
			for (String p:rr)
			{
				//System.out.println(p);
				String[] pp=p.split(":");
				String key=pp[0].replaceAll("\"", "");
				String value=pp[1].replaceAll("\"", "");
				
				if ("id".equals(key))
				{
					u.setId(Integer.parseInt(value));
				}
				
				try {
					
					Method metodo = u.getClass().getMethod("set"+key, Integer.class);
					
				} catch (NoSuchMethodException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				System.out.println(key+"\t"+value);
				
			}*/
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
