package ua.com.nix.dz6.carDealership.service.impl;
import ua.com.nix.dz6.carDealership.annotation.Value;
import ua.com.nix.dz6.carDealership.service.WorkEnvironmentService;

public class WorkEnvironmentServiceImpl implements WorkEnvironmentService {

    @Value
    private String coffee;

    @Override
    public void check() {
        System.out.println("Кофе машина включена, " + coffee + " варится.");
    }
}
