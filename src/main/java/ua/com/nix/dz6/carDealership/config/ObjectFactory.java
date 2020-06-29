package ua.com.nix.dz6.carDealership.config;
import ua.com.nix.dz6.carDealership.config.impl.JavaApplicationConfiguration;
import ua.com.nix.dz6.carDealership.service.ConditionerService;
import ua.com.nix.dz6.carDealership.service.impl.WorkProcessServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {

    private static ObjectFactory instance;
    private ApplicationConfiguration config;

    private ObjectFactory() {

        config = new JavaApplicationConfiguration("ua.com.nix.dz6.carDealership",
                new HashMap<>(Map.of(ConditionerService.class, WorkProcessServiceImpl.class)));
    }

    public static ObjectFactory getInstance(){
        if (instance == null){
            instance = new ObjectFactory();
        }
        return instance;
    }

    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()){
            implClass = config.getCurrentImplementation(type);
        }
        T t;
        try {
            t = implClass.getDeclaredConstructor().newInstance();

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("невозможно создать класс: " + e.getClass().getName() + " " + ",msg: " + e.getMessage());
        }

        return t;
    }
}

