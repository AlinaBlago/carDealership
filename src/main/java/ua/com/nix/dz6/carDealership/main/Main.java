package ua.com.nix.dz6.carDealership.main;

import ua.com.nix.dz6.carDealership.data.WorkersOfCarDealership;
import ua.com.nix.dz6.carDealership.service.DirectorOfCarDealershipService;
import ua.com.nix.dz6.carDealership.service.impl.DirectorOfCarDealershipServiceImpl;

public class Main {
    public static void main(String[] args) {

        DirectorOfCarDealershipService director = new DirectorOfCarDealershipServiceImpl();
        director.startWorkday(new WorkersOfCarDealership());
    }
}
