package ua.com.nix.dz6.carDealership.config;

public class ObjectFactory {

    public static ObjectFactory instance;
    public ObjectFactory() {}

    public static ObjectFactory getInstance(){
        if (instance == null){
            instance = new ObjectFactory();
        }
        return instance;
    }

    public <T> T createObject(Class<T> type) {
        return null;
    }
}

