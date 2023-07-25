import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JSONParser parser = new JSONParser();
        
            Object obj = parser.parse(new FileReader("C:/Users/test_json.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String cod = (String)jsonObject.get("cod");
            //JSONArray li = (JSONArray)jsonObject.get("list");
           /* System.out.println("list: " + li);
            Iterator iterator = li.iterator();
         while (iterator.hasNext()) {
            System.out.println(iterator.next());
         } */

         Map<String, Float> m=new HashMap<String,Float>();
        Scanner s=new Scanner(System.in);
         System.err.println("Choose anyone option: 1. Get weather, 2. Get Wind Speed, 3. Get Pressure, 0. Exit");
        int a=s.nextInt();
        switch(a){
            case 1: 
            Scanner s1 =new Scanner(System.in);
            System.out.println("Enter the temperature(weather):");
            float w=s1.nextFloat();
            m.put("Weather",w);
            System.out.println(w);


            case 2: 
            Scanner s2 =new Scanner(System.in);
            System.out.println("Enter the Wind speed:");
            float ws=s2.nextFloat();
            m.put("Windspeed",ws);
            System.out.println(ws);


            case 3: 
            Scanner s3 =new Scanner(System.in);
            System.out.println("Enter the pressure:");
            float p=s3.nextFloat();
            m.put("pressure",p);
            System.out.println(p);


            case 0:
            System.out.println("Exited");
            break;


        }
        try{
            JSONObject jsObj=new JSONObject();
            jsObj.putAll(m);
            System.out.println(jsObj.toString());


        }
        
        catch(Exception e) {
            e.printStackTrace();
         }
    }
}
