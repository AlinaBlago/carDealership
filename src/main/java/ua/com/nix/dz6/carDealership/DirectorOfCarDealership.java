package ua.com.nix.dz6.carDealership;

public class DirectorOfCarDealership {

    public void startWorkday(WorkersOfCarDealership workers){
        System.out.println("Настроение есть!");
        System.out.println("Кондиционер включен!");
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
