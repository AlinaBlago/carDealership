package ua.com.nix.dz6.carDealership;

public class DirectorOfCarDealershipService {

    private Mood mood = new Mood();
    private Conditioner conditioner = new Conditioner();
    private DirectorOfCarDealershipResponsibility directorResponsibility = new DirectorOfCarDealershipResponsibility();

    public void startWorkday(WorkersOfCarDealership workers){
        mood.isExist();
        conditioner.workCondition();
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
