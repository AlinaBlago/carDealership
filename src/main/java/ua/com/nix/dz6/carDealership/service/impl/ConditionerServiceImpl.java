package ua.com.nix.dz6.carDealership.service.impl;

import ua.com.nix.dz6.carDealership.exception.ConditionerException;
import ua.com.nix.dz6.carDealership.service.ConditionerService;

public class ConditionerServiceImpl implements ConditionerService {
    private boolean stateOfConditioner = true;

    @Override
    public void isExist(){
        if (stateOfConditioner){
            System.out.println("Кондиционер включен.");
        } else {
            throw new ConditionerException("Кондиционер выключен.");
        }
    }
}
