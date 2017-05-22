import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rekdon on 22.05.2017.
 */
public class MainJson {
    private static final String FILENAME = "C:\\Users\\Rekdon\\IdeaProjects\\JavaRush\\GitJavaLab\\PracticalTask01.05.2017\\file.json";
    public static void main(String[] args)
    {
        Bus bus = new Bus("bus",1000,4000,20,4);
        IntercityDouble_DeckerBus cityBus = new IntercityDouble_DeckerBus("B56-40",6000,30,4,3,5,"Greece");
        UrbanBus longDistanceBus = new UrbanBus("Bogdan42",70,400,50,8,"Kalinka","Sadova");

        ArrayList<Mashine> mashines = new ArrayList<Mashine>();
        mashines.add(bus);
        mashines.add(cityBus);
        mashines.add(longDistanceBus);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(mashines);


        try (FileWriter fileWriter = new FileWriter(FILENAME))
        {
            fileWriter.write(json);
        }
        catch (IOException ex)
        {
            System.out.println("error");
        }
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME));
            ArrayList<Mashine> list = (ArrayList<Mashine>) gson.fromJson(json,new TypeToken<ArrayList<Mashine>>(){}.getRawType());
            System.out.println(list);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error");
        }

    }
}
