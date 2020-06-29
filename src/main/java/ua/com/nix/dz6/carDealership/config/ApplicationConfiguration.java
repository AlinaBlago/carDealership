package ua.com.nix.dz6.carDealership.config;

public interface ApplicationConfiguration {

    <T> T getCurrentImplementation(Class<T> type);
}
