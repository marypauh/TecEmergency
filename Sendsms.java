/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendsms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
 
/**
 *
 * @author raquelrojas
 */
public class Sendsms {

    public static String sendSMS() {
		try {
			// Construct data
			String apiKey = "apikey=" + "D/sVln1pkC8-CwHLYHDD9JzbjHZsm2M17PPZsnfNst";
			String message = "&message=" + "Te veo bb";
			String sender = "&sender=" + "Stranger";
			String numbers = "&numbers=" + "50684080188";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			return stringBuffer.toString();
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		
	}
}
    
    public static void main(String[] args) {
        Sendsms.sendSMS();
        


    }
    
}
