package rest_client_http;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			// InputStream input = new
			// URL("http://127.0.0.1:8080/a.txt").openStream();

			/*
			InputStream input = new URL(
					"http://127.0.0.1:8080/commerce/rest/utente/get/1")
					.openStream();
			*/
			Reader r=new InputStreamReader(new URL(
					"http://127.0.0.1:8080/commerce/rest/utente/get/1")
					.openStream());
			
			Scanner s=new Scanner(r);
			
			while (s.hasNext())
			{
				System.out.println(s.nextLine());
			}
			
			/*
			 * new FileInputStream(
			 * "/Users/manuelgentile/Desktop/replication.R.txt");
			 */
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

	}
}
