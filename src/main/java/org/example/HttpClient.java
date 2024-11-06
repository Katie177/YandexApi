package org.example;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HttpClient {
    public static String request() {

        String response = "";

        try {

            URL url = new URL("https://api.weather.yandex.ru/v2/forecast?lat=55.75&lon=37.62&limit=7");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Yandex-Weather-Key", "");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            connection.disconnect();
            System.out.println(content);
            response = content.toString();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }
}