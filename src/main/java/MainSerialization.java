import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Rekdon on 22.05.2017.
 */
public class MainSerialization implements Serializable {
    private static  ArrayList<Mashine> mashines = new ArrayList<Mashine>();
    public static void main(String[] args)
    {

        mashines= (ArrayList<Mashine>) desDate("C:\\Users\\Rekdon\\IdeaProjects\\JavaRush\\GitJavaLab\\PracticalTask01.05.2017\\inputData.txt");
        Bus bus = new Bus("bus",1000,4000,20,4);
        IntercityDouble_DeckerBus cityBus = new IntercityDouble_DeckerBus("B56-40",6000,30,4,3,5,"Greece");
        UrbanBus longDistanceBus = new UrbanBus("Bogdan42",70,400,50,8,"Kalinka","Sadova");


        mashines.add(bus);
        mashines.add(cityBus);
        mashines.add(longDistanceBus);




        System.out.println(mashines.size());
        System.out.println("before sorting");
        for(Mashine mashine : mashines)
        {
            System.out.println(mashine.toString());
        }
        System.out.println("------------after sorting------------");
        Collections.sort(mashines, new Comparator<Mashine>() {
            public int compare(Mashine o1,Mashine o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        for(Mashine s: mashines)
        {
            System.out.println(s.toString());
        }
        serDate("File",mashines);


    }

    private static Object desDate(String file_name){
        Object retObject = null;
        try{
            FileInputStream fileIn = new FileInputStream(file_name+".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            retObject = in.readObject();
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }catch(IOException e){
            System.out.println("Error");
            System.out.println(2);
        }catch(ClassNotFoundException e){
            System.out.println("Class not found");
            System.exit(3);
        }
        return retObject;
    }
    private static void serDate(String file_name,Object obj){
        try{
            FileOutputStream fileOut = new FileOutputStream(file_name+".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            fileOut.close();
            out.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }catch(IOException e){
            System.out.println("Error");
            System.out.println(2);
        }
    }
}

