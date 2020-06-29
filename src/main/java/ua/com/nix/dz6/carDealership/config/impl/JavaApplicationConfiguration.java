package ua.com.nix.dz6.carDealership.config.impl;

import org.reflections.Reflections;
import ua.com.nix.dz6.carDealership.config.ApplicationConfiguration;

import java.util.Set;

public class JavaApplicationConfiguration implements ApplicationConfiguration {

    private Reflections scanner;

    public JavaApplicationConfiguration(String packageToScan){
        this.scanner = new Reflections(packageToScan);
    }


    @Override
    public <T> Class<? extends T> getCurrentImplementation(Class<T> type) {
        Set<Class<? extends T>> children = scanner.getSubTypesOf(type);
        if (children.size() != 1){
            throw new RuntimeException("Может быть только одна имплементация.");
        }
        return children.iterator().next();
    }
}
