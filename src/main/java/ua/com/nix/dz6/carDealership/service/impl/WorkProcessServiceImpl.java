package ua.com.nix.dz6.carDealership.service.impl;

import ua.com.nix.dz6.carDealership.exception.ConditionerException;
import ua.com.nix.dz6.carDealership.service.ConditionerService;

public class WorkProcessServiceImpl implements ConditionerService {
    private boolean stateOfConditioner = true;
    private boolean buttonWorked = true;

    @Override
    public void isExist(){
        if (stateOfConditioner){
            System.out.println("Кондиционер включен.");
        } else {
            throw new ConditionerException("Кондиционер выключен.");
        }
        if (buttonWorked){
            System.out.println("Кнопка работает.");
        } else {
            throw new ConditionerException("Кнопка не работает.");
        }
    }
}
