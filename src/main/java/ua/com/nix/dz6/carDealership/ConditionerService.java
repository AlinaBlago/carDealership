package ua.com.nix.dz6.carDealership;

import ua.com.nix.dz6.carDealership.exception.ConditionerException;

public class ConditionerService {
    private boolean stateOfConditioner = true;

    public void workCondition(){
        if (stateOfConditioner){
            System.out.println("Кондиционер включен.");
        } else {
            throw new ConditionerException("Кондиционер выключен.");
        }
    }
}
