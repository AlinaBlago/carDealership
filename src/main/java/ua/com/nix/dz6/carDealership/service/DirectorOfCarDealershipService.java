package ua.com.nix.dz6.carDealership.service;

import ua.com.nix.dz6.carDealership.data.abstr.InteractingPerson;

public interface DirectorOfCarDealershipService<W extends InteractingPerson> {
    public void startWorkday(W w);
}
