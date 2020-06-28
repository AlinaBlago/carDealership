package ua.com.nix.dz6.carDealership.service;

import ua.com.nix.dz6.carDealership.exception.ConditionerException;

public class ConditionerService {
    private boolean stateOfConditioner = true;

    public void isExist(){
        if (stateOfConditioner){
            System.out.println("Кондиционер включен.");
        } else {
            throw new ConditionerException("Кондиционер выключен.");
        }
    }
}
