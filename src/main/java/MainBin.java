import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Rekdon on 22.05.2017.
 */
public class MainBin {
    public static void main(String[] args) {
        String result = "";
        try (FileWriter writer = new FileWriter("outputData.bin")) {

            Pattern spaceBinary = Pattern.compile("[ ]");
            String nameB = "[a-zA-Z0-9]+";
            String speedB = "speed:\\d{1,5}";
            String massB = "mass:\\d{1,12}";
            String passangersB = "passangers:\\d{1,2}";
            String pilotsB = "pilots:\\d{1}";
            String wheelsB = "wheels:\\d{1,5}";
            String maxCapacityB = "maxCapacity:\\d{1,6}";
            String weightGoodsB = "weightGoods:\\d{1,6}";


            String[] wordsBinary = spaceBinary.split(result);

            ArrayList<String> nameListBin = new ArrayList<>();
            ArrayList<String> speedListBin = new ArrayList<>();
            ArrayList<String> massListBin = new ArrayList<>();
            ArrayList<String> passangersListBin = new ArrayList<>();
            ArrayList<String> pilotsListBin = new ArrayList<>();
            ArrayList<String> wheelsListBin = new ArrayList<>();
            ArrayList<String> maxCapacityListBin = new ArrayList<>();
            ArrayList<String> weightGoodsListBin = new ArrayList<>();


            for (int i = 0; i < wordsBinary.length; i++) {
                if (Pattern.matches(nameB, wordsBinary[i])) {
                    nameListBin.add(wordsBinary[i]);
                }
            }
            for (int i = 0; i < wordsBinary.length; i++) {
                if (Pattern.matches(speedB, wordsBinary[i])) {
                    speedListBin.add(wordsBinary[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < wordsBinary.length; i++) {
                if (Pattern.matches(massB, wordsBinary[i])) {
                    massListBin.add(wordsBinary[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < wordsBinary.length; i++) {
                if (Pattern.matches(passangersB, wordsBinary[i])) {
                    passangersListBin.add(wordsBinary[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < wordsBinary.length; i++) {
                if (Pattern.matches(pilotsB, wordsBinary[i])) {
                    pilotsListBin.add(wordsBinary[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < wordsBinary.length; i++) {
                if (Pattern.matches(wheelsB, wordsBinary[i])) {
                    wheelsListBin.add(wordsBinary[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < wordsBinary.length; i++) {
                if (Pattern.matches(maxCapacityB, wordsBinary[i])) {
                    maxCapacityListBin.add(wordsBinary[i].replaceAll("[^0-9]+", ""));
                }
            }
            for (int i = 0; i < wordsBinary.length; i++) {
                if (Pattern.matches(weightGoodsB, wordsBinary[i])) {
                    weightGoodsListBin.add(wordsBinary[i].replaceAll("[^0-9]+", ""));
                }
            }

            ArrayList<TransportAirplane> transportAirplaneList = new ArrayList<>();
            for (int i = 0; i < nameListBin.size(); i++) {
                TransportAirplane transportAirplane = new TransportAirplane(nameListBin.get(i), Integer.parseInt(speedListBin.get(i)), Integer.parseInt(massListBin.get(i)), Integer.parseInt(passangersListBin.get(i)), Integer.parseInt(wheelsListBin.get(i)), Integer.parseInt(pilotsListBin.get(i)), Integer.parseInt(maxCapacityListBin.get(i)), Integer.parseInt(weightGoodsListBin.get(i)));
                transportAirplaneList.add(transportAirplane);
            }

            for (int i = 0; i < transportAirplaneList.size(); i++) {
                System.out.println(transportAirplaneList.get(i));
            }
            Collections.sort(transportAirplaneList, new Comparator<TransportAirplane>() {
                public int compare(TransportAirplane o1, TransportAirplane o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });
            for (int i = 0; i < transportAirplaneList.size(); i++) {
                System.out.println(transportAirplaneList.get(i));
            }
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
            System.out.print("Введіть назву нового літака : ");
            String name2 = null;
            try {
                name2 = reader1.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Введіть швидкість літака : ");
            int speed2 = 0;
            try {
                speed2 = Integer.parseInt(reader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Введіть вагу літака : ");
            int mass2 = 0;
            try {
                mass2 = Integer.parseInt(reader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Введіть кількість пасажирів літака : ");
            int passanger2 = 0;
            try {
                passanger2 = Integer.parseInt(reader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Введіть кількість коліс літака : ");
            int wheel2 = 0;
            try {
                wheel2 = Integer.parseInt(reader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Введіть кількість пілотів літака : ");
            int pilot2 = 0;
            try {
                pilot2 = Integer.parseInt(reader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Введіть максимальнy вантажність літака : ");
            int maxCapacity2 = 0;
            try {
                maxCapacity2 = Integer.parseInt(reader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print("Введіть вагу вантажу : ");
            int weightGoods2 = 0;
            try {
                weightGoods2 = Integer.parseInt(reader1.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            TransportAirplane transportAirplane1 = new TransportAirplane(name2, speed2, mass2, passanger2, wheel2, pilot2, maxCapacity2, weightGoods2);
            transportAirplaneList.add(transportAirplane1);
            Collections.sort(transportAirplaneList, new Comparator<TransportAirplane>() {
                public int compare(TransportAirplane o1, TransportAirplane o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });
            for (int i = 0; i < transportAirplaneList.size(); i++) {
                System.out.println(transportAirplaneList.get(i));
            }
            String textWrite = "";
            for (int i = 0; i < transportAirplaneList.size(); i++) {
                textWrite += "Назва літака : " + transportAirplaneList.get(i).getName() + " швидкість літака : " + transportAirplaneList.get(i).getSpeed() + " вага літака : " + transportAirplaneList.get(i).getMass() + " кількість пасажирів літака : " + transportAirplaneList.get(i).getNumberOfPassengers() + " кількість коліс літака : " + transportAirplaneList.get(i).getNumberOfWheels() + " кількість пілотів літака : " + transportAirplaneList.get(i).getNumberOfPilots() + "  максимальна вантажність літака : " + transportAirplaneList.get(i).getMaxLoadingCapacity() + " вага вантажу : " + transportAirplaneList.get(i).getWeightGoods();
            }
            Scanner scanner = new Scanner(textWrite);
            String str = scanner.nextLine();

            for (int val : str.toCharArray()) {
                try {
                    writer.write(Integer.toBinaryString(val) + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}