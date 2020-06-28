package ua.com.nix.dz6.carDealership;

public class Main {
    public static void main(String[] args) {

        DirectorOfCarDealershipService director = new DirectorOfCarDealershipService();
        director.startWorkday(new WorkersOfCarDealership());
    }
}
