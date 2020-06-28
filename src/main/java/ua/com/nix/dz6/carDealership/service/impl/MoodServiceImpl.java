package ua.com.nix.dz6.carDealership.service.impl;

import ua.com.nix.dz6.carDealership.exception.MoodException;
import ua.com.nix.dz6.carDealership.service.MoodService;

public class MoodServiceImpl implements MoodService {
    private boolean existMood = true;

    @Override
    public void isExist(){
        if (existMood){
            System.out.println("Настроение есть");
        } else {
            throw new MoodException("Настроения нет");
        }
    }
}
