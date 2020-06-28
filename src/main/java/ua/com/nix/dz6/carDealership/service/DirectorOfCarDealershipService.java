package ua.com.nix.dz6.carDealership.service;

import ua.com.nix.dz6.carDealership.data.WorkersOfCarDealership;
import ua.com.nix.dz6.carDealership.service.impl.ConditionerServiceImpl;
import ua.com.nix.dz6.carDealership.service.impl.MoodServiceImpl;

public class DirectorOfCarDealershipService {

    private MoodService moodService = new MoodServiceImpl();
    private ConditionerService conditionerService = new ConditionerServiceImpl();
    private DirectorOfCarDealershipResponsibilityService directorResponsibility = new DirectorOfCarDealershipResponsibilityService();

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
