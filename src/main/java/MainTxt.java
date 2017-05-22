import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Rekdon on 22.05.2017.
 */
public class MainTxt {
    public static void main(String[] args) throws IOException {
        String s = "";
        Scanner in = new Scanner(new File("inputData.txt"));
        while (in.hasNext())
            s += in.nextLine() + "\r\n";
        try (FileWriter writer = new FileWriter("outputData.txt")) {
            Pattern space = Pattern.compile("[ ]");
            String name = "[a-zA-Z0-9]+|(\\s[a-zA-Z0-9])+";
            String speed = "speed:\\d{1,5}";
            String mass = "mass:\\d{1,10}";
            String passengers = "passengers:\\d{1,2}";
            String pilots = "pilots:\\d{1}";
            String wheels = "wheels:\\d{1,5}";
            String stewardess = "stewardess:\\d{0,2}";

            String[] words = space.split(s);

            ArrayList<String> nameList = new ArrayList<>();
            ArrayList<String> speedList = new ArrayList<>();
            ArrayList<String> massList = new ArrayList<>();
            ArrayList<String> passengersList = new ArrayList<>();
            ArrayList<String> pilotsList = new ArrayList<>();
            ArrayList<String> wheelsList = new ArrayList<>();
            ArrayList<String> stewardessList = new ArrayList<>();


            for (int i = 0; i < words.length; i++) {
                if (Pattern.matches(name, words[i])) {
                    //   writer.write(words[i] + " ");
                    nameList.add(words[i]);
                }
            }
            for (int i = 0; i < words.length; i++) {
                if (Pattern.matches(speed, words[i])) {
                    speedList.add(words[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < words.length; i++) {
                if (Pattern.matches(mass, words[i])) {
                    massList.add(words[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < words.length; i++) {
                if (Pattern.matches(passengers, words[i])) {
                    passengersList.add(words[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < words.length; i++) {
                if (Pattern.matches(pilots, words[i])) {
                    pilotsList.add(words[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < words.length; i++) {
                if (Pattern.matches(wheels, words[i])) {
                    wheelsList.add(words[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < words.length; i++) {
                if (Pattern.matches(stewardess, words[i])) {

                    stewardessList.add(words[i].replaceAll("[^0-9]+", ""));
                }
            }


            ArrayList<Airlaner> airlanersList = new ArrayList<>();
            for (int i = 0; i < nameList.size(); i++) {
                Airlaner airlaner11 = new Airlaner(nameList.get(i), Integer.parseInt(speedList.get(i)), Integer.parseInt(massList.get(i)), Integer.parseInt(passengersList.get(i)), Integer.parseInt(wheelsList.get(i)), Integer.parseInt(pilotsList.get(i)), Integer.parseInt(stewardessList.get(i)));
                airlanersList.add(airlaner11);
            }
            for (int i = 0; i < airlanersList.size(); i++) {
                System.out.println(airlanersList.get(i));
            }
            Collections.sort(airlanersList, new Comparator<Airlaner>() {
                public int compare(Airlaner o1, Airlaner o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });
            for (int i = 0; i < airlanersList.size(); i++) {
                System.out.println(airlanersList.get(i));
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введіть назву нового літака : ");
            String name1 = reader.readLine();
            System.out.print("Введіть швидкість літака : ");
            int speed1 = Integer.parseInt(reader.readLine());
            System.out.print("Введіть вагу літака : ");
            int mass1 = Integer.parseInt(reader.readLine());
            System.out.print("Введіть кількість пасажирів літака : ");
            int passanger1 = Integer.parseInt(reader.readLine());
            System.out.print("Введіть кількість коліс літака : ");
            int wheel1 = Integer.parseInt(reader.readLine());
            System.out.print("Введіть кількість пілотів літака : ");
            int pilot1 = Integer.parseInt(reader.readLine());
            System.out.print("Введіть кількість стьюардес : ");
            int stewardess1 = Integer.parseInt(reader.readLine());
            Airlaner airlaner = new Airlaner(name1, speed1, mass1, passanger1, wheel1, pilot1, stewardess1);
            airlanersList.add(airlaner);
            Collections.sort(airlanersList, new Comparator<Airlaner>() {
                public int compare(Airlaner o1, Airlaner o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });
            for (int i = 0; i < airlanersList.size(); i++) {
                System.out.println(airlanersList.get(i));
            }
            for (int i = 0; i < airlanersList.size(); i++) {
                writer.write("Назва літака : " + airlanersList.get(i).getName() + " швидкість літака : " + airlanersList.get(i).getSpeed() + " вага літака : " + airlanersList.get(i).getMass() + " кількість пасажирів літака : " + airlanersList.get(i).getNumberOfPassengers() + " кількість коліс літака : " + airlanersList.get(i).getNumberOfWheels() + " кількість пілотів літака : " + airlanersList.get(i).getNumberOfPilots() + "  кількість стьюардес літака : " + airlanersList.get(i).getNumberOfStewardess() + "  ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("-----------------------------------------------");
        Pattern space = Pattern.compile("[ ]");
        String sBinary = "";
        Scanner inBinary = new Scanner(new File("inputData.bin"));
        while (inBinary.hasNext())
            sBinary += inBinary.nextLine() + "\r\n";

        String[] words = space.split(sBinary);
        String result = "";
        for (int i = 0; i < words.length; i++) {

            String[] substr = new String[words[i].length() / 8];

            if (words[i].length() % 8 == 0) {
                substr = words[i].split("(?<=\\G.{8})");

                for (int j = 0; j < substr.length; j++) {
                    int count = Integer.parseInt(substr[j], 2);
                    String aChar = new Character((char) count).toString();
                    System.out.print(aChar);
                    result += aChar;
                }
            }
        }
    }
}
