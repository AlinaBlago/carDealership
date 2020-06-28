package ua.com.nix.dz6.carDealership.service;

import ua.com.nix.dz6.carDealership.data.abstr.InteractingPerson;

public interface DirectorResponsibilityService<W extends InteractingPerson> {
    void startResponsible(W w);
    void finishResponsible();
}
