package ua.com.nix.dz6.carDealership.service.impl;

import ua.com.nix.dz6.carDealership.config.ObjectFactory;
import ua.com.nix.dz6.carDealership.data.WorkersOfCarDealership;
import ua.com.nix.dz6.carDealership.service.DirectorOfCarDealershipResponsibilityService;
import ua.com.nix.dz6.carDealership.service.WorkEnvironmentService;

public class DirectorOfCarDealershipResponsibilityServiceImpl implements DirectorOfCarDealershipResponsibilityService {

    private WorkEnvironmentService workEnvironmentService = ObjectFactory.getInstance().createObject(WorkEnvironmentService.class);

    @Override
    public void startResponsible(WorkersOfCarDealership workers){
        workEnvironmentService.check();
        System.out.println("Проводит утренний бриффинг.");
        System.out.println("Дает советы по работе.");
    }

   @Override
    public void finishResponsible(){
        System.out.println("Подводит итоги дня.");
    }
}
