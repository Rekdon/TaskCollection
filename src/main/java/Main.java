
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Plane plane = new Plane("Боєнг Б251-В", 400, 50000, 40, 4, 2);
        Airlaner airlaner = new Airlaner("Боєнг Б251-В", 400, 50000, 40, 4, 2, 2);
        TransportAirplane transportAirplane = new TransportAirplane("Боєнг Б251-В", 400, 50000, 40, 4, 2, 500000, 20000);
        Bus bus = new Bus("Автобус", 120, 2000, 28, 4);
        UrbanBus urbanBus = new UrbanBus("Автобус", 120, 2000, 28, 4, "Садова", "Дріж завод");
        IntercityDouble_DeckerBus intercityDoubleDeckerBus = new IntercityDouble_DeckerBus("Автобус", 120, 2000, 28, 4, 2, "Чернівці-Рим");
        System.out.println("******************************************");
        System.out.println(plane.toString());
        System.out.println("------------------------------------------");
        System.out.println(airlaner.toString());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(transportAirplane.toString());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("__________________________________________");
        System.out.println(bus.getInfo());
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(urbanBus.getInfo());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(intercityDoubleDeckerBus.getInfo());
    }
}
