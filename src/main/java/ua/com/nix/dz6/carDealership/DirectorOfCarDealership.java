package ua.com.nix.dz6.carDealership;

public class DirectorOfCarDealership {

    private Mood mood = new Mood();
    private Conditioner conditioner = new Conditioner();

    public void startWorkday(WorkersOfCarDealership workers){
        mood.isExist();
        conditioner.workCondition();
        System.out.println("Кофе-машина работает!");
        work(workers);
        System.out.println("Проводит утренний бриффинг.");
        System.out.println("Дает советы по работе.");
        System.out.println("Подводит итоги дня.");
    }

    public void work(WorkersOfCarDealership workers){
        System.out.println("Открывает здание.");
        System.out.println("Подписывает документы.");
        System.out.println("Контролирует работу сотрудников.");
    }
}
