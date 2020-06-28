package ua.com.nix.dz6.carDealership.service.impl;

import ua.com.nix.dz6.carDealership.exception.ConditionerException;

public class ConditionerServiceImpl {
    private boolean stateOfConditioner = true;

    public void isExist(){
        if (stateOfConditioner){
            System.out.println("Кондиционер включен.");
        } else {
            throw new ConditionerException("Кондиционер выключен.");
        }
    }
}
