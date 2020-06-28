package ua.com.nix.dz6.carDealership;

import ua.com.nix.dz6.carDealership.data.WorkersOfCarDealership;
import ua.com.nix.dz6.carDealership.service.DirectorOfCarDealershipService;

public class Main {
    public static void main(String[] args) {

        DirectorOfCarDealershipService director = new DirectorOfCarDealershipService();
        director.startWorkday(new WorkersOfCarDealership());
    }
}
