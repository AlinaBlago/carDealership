package ua.com.nix.dz6.carDealership.service.impl;

import ua.com.nix.dz6.carDealership.exception.MoodException;

public class MoodServiceImpl {
    private boolean existMood = true;

    public void isExist(){
        if (existMood){
            System.out.println("Настроение есть");
        } else {
            throw new MoodException("Настроения нет");
        }
    }
}
