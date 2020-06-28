package ua.com.nix.dz6.carDealership.service.impl;

import ua.com.nix.dz6.carDealership.data.WorkersOfCarDealership;
import ua.com.nix.dz6.carDealership.service.ConditionerService;
import ua.com.nix.dz6.carDealership.service.DirectorOfCarDealershipResponsibilityService;
import ua.com.nix.dz6.carDealership.service.DirectorOfCarDealershipResponsibilityServiceImpl;
import ua.com.nix.dz6.carDealership.service.MoodService;

public class DirectorOfCarDealershipServiceImpl {

    private MoodService moodService = new MoodServiceImpl();
    private ConditionerService conditionerService = new ConditionerServiceImpl();
    private DirectorOfCarDealershipResponsibilityService directorResponsibility = new DirectorOfCarDealershipResponsibilityServiceImpl();

    public void startWorkday(WorkersOfCarDealership workers){
        moodService.isExist();
        conditionerService.isExist();
        System.out.println("Кофе-машина работает!");
        directorResponsibility.startResponsible(workers);
        work(workers);
        directorResponsibility.finishResponsible();


    }

    public void work(WorkersOfCarDealership workers){
        System.out.println("Выплачивает премию.");
        System.out.println("Подписывает документы.");
        System.out.println("Контролирует работу сотрудников.");
    }
}
