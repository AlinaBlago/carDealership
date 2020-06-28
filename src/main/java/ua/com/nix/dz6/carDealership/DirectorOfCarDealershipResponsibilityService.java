package ua.com.nix.dz6.carDealership;

import ua.com.nix.dz6.carDealership.data.WorkersOfCarDealership;

public class DirectorOfCarDealershipResponsibilityService {
    public void startResponsible(WorkersOfCarDealership workers){
        System.out.println("Проводит утренний бриффинг.");
        System.out.println("Дает советы по работе.");
    }
    public void finishResponsible(){
        System.out.println("Подводит итоги дня.");
    }
}
