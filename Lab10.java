import java.util.*;

public class Lab10 {
    int city;
    int[] request;
    int[][] flights;

    public Lab10(String args0, String args1) {
        this.city = 0;
        this.request = getRequest(args0);
        this.flights = getFlightInfo(args1);
    }

    public int findCheapestPrice() {
        return findCheapestPrice(this.city, this.request, this.flights);
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder("-----Flights-----\n");
        for (int[] flight : flights) {
            ret.append(Arrays.toString(flight)).append("\n");
        }
        ret.append("-----Request-----\n");
        ret.append("-> Depart at city: ").append(request[0]);
        ret.append("\n-> Arrive at city: ").append(request[1]);
        ret.append("\n-> with at most: ").append(request[2]).append(" stops\n");
        return ret.toString();
    }

    public static int findCheapestPrice(int n, int[] request, int[][] flights_info) {
        //TODO complete this function, remove this line when you start
        throw new UnsupportedOperationException("Not yet implemented, remove this line when you start");
    }

    public int[][] getFlightInfo(String file) {
        //TODO complete this function, remove this line when you start
        throw new UnsupportedOperationException("Not yet implemented, remove this line when you start");


        //TODO update your variable @city here -> number of city
    }

    public int[] getRequest(String file) {
        //TODO complete this function, remove this line when you start
        throw new UnsupportedOperationException("Not yet implemented, remove this line when you start");
    }

    /* Recommend to have*/
    public void generateCityGraph(int[][] flights) {
        //TODO complete this function, remove this line when you start
        throw new UnsupportedOperationException("Not yet implemented, remove this line when you start");
    }

    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1]);
        Lab10 test = new Lab10(args[0], args[1]);
        System.out.println(test);
        System.out.println("Executing request...");
        System.out.println("Cheapest price found: " + test.findCheapestPrice());
    }


}
