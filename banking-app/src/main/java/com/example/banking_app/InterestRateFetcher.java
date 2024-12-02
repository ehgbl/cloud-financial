package com.example.banking_app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class InterestRateFetcher {
    private static final String API_KEY = "5e63c79f49f6b88a081630385c9b7619 ";
    private static final String SERIES_ID = "DFF";
    private static final String FRED_API_URL = "https://api.stlouisfed.org/fred/series/observations";

    public static void main(String[] args) {
        try {
            String urlString = FRED_API_URL + "?series_id=" + SERIES_ID + "&api_key=" + API_KEY + "&file_type=json";
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            // Parse JSON response and extract interest rate data
            // (Use a JSON library like org.json or Gson for parsing)

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
