package ua.com.nix.dz6.carDealership.service.impl;
import ua.com.nix.dz6.carDealership.annotation.Value;
import ua.com.nix.dz6.carDealership.service.WorkEnvironmentService;

public class WorkEnvironmentServiceImpl implements WorkEnvironmentService {

    @Value
    private String coffeeMachine;

    @Override
    public void check() {
        System.out.println("Свет есть, " + coffeeMachine + " работает");
    }
}
