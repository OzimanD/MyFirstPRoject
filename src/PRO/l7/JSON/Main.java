package PRO.l7.JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    
    public static void main(String[] args) throws Exception {
        // Посилання на курс валют
        String request = "http://query.yahooapis.com/v1/public/yql?format=json&q=select%20*%20from%20" +
                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";

        String result = performRequest(request);

        Gson gson = new GsonBuilder().create();
        // Відбувається десиріалізація, з текстового документа JSON, отримуємо об'єктне подання
        JSON json = (JSON) gson.fromJson(result, JSON.class);

        // Проходимо по кожному курсу валют та виводимо на екран
        for (Rate rate : json.query.results.rate) {
            System.out.println(rate.id + "=" + rate.Rate);
        }

        // Отримуємо з об'єкту текстовий JSON
        System.out.println("JSON: \n\t" + gson.toJson(json));
    }

    // Робимо запит та отримуємо JSON
    private static String performRequest(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r = 0;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } finally {
            http.disconnect();
        }

        return sb.toString();
    }

}