package ua.com.nix.dz6.carDealership;

public class Mood {
    private boolean existMood = true;

    public void isExist(){
        if (existMood){
            System.out.println("Настроение есть");
        } else {
            throw new MoodException("Настроения нет");
        }
    }
}