package ua.com.nix.dz6.carDealership;

import ua.com.nix.dz6.carDealership.data.WorkersOfCarDealership;
import ua.com.nix.dz6.carDealership.service.impl.DirectorOfCarDealershipServiceImpl;

public class Main {
    public static void main(String[] args) {

        DirectorOfCarDealershipServiceImpl director = new DirectorOfCarDealershipServiceImpl();
        director.startWorkday(new WorkersOfCarDealership());
    }
}
