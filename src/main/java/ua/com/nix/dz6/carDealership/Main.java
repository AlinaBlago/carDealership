package ua.com.nix.dz6.carDealership;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Main.main");
        DirectorOfCarDealership director = new DirectorOfCarDealership();
        director.startWorkday(new WorkersOfCarDealership());
    }
}
