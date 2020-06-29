package ua.com.nix.dz6.carDealership.service.impl;

import ua.com.nix.dz6.carDealership.data.WorkersOfCarDealership;
import ua.com.nix.dz6.carDealership.data.abstr.InteractingPerson;
import ua.com.nix.dz6.carDealership.service.DirectorOfCarDealershipResponsibilityService;

public class DirectorOfCarDealershipResponsibilityServiceImpl implements DirectorOfCarDealershipResponsibilityService {

    @Override
    public void startResponsible(WorkersOfCarDealership workers){
        System.out.println("Проводит утренний бриффинг.");
        System.out.println("Дает советы по работе.");
    }

   @Override
    public void finishResponsible(){
        System.out.println("Подводит итоги дня.");
    }
}
