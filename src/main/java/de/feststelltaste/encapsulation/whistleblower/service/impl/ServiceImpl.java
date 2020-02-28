package de.feststelltaste.encapsulation.whistleblower.service.impl;

import de.feststelltaste.encapsulation.whistleblower.service.api.ClassOfTheApi;
import de.feststelltaste.encapsulation.whistleblower.service.api.Service;

public class ServiceImpl implements Service {

    @Override
    public ClassOfTheApi doSomething() {
        return new ClassOfTheApi();
    }
}
