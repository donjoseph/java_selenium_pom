package utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {

    public static void main(String [] args) throws IOException {
        JSONObject object = new JSONObject();
        object.put("firstName", "Don");
        object.put("lasname", "Joseph");

        Map adress = new HashMap(4);
        adress.put("line1" , "street");
        adress.put("city" , "Union City");
        adress.put("state" , "CA");

        object.put("address", adress);

        JSONArray phone = new JSONArray();

        Map phone1 = new HashMap(2);
        phone1.put("type", "Work");
        phone1.put("number", "4794021281");

        Map phone2 = new HashMap(2);
        phone2.put("type", "HOme");
        phone2.put("number", "4794021282");

        phone.put(phone1);
        phone.put(phone2);

        object.put("phones", phone);

        PrintWriter pw = new PrintWriter("JSONExample.json");
        pw.write(object.toString());

        pw.flush();
        pw.close();


            // define the range
            int max = 10;
            int min = 1;
            int range = max - min + 1;

            // generate random numbers within 1 to 10
            for (int i = 0; i < 10; i++) {
                int rand = (int)(Math.random() * range) + min;

                // Output is different everytime this code is executed
                System.out.println(rand);
            }


        HttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost("www.google.com");
        httpPost.setEntity(new StringEntity(object.toString()));
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");

        HttpResponse response = httpClient.execute(httpPost);





    }
}
