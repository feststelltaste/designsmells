package de.feststelltaste.encapsulation.whistleblower.client;

import de.feststelltaste.encapsulation.whistleblower.service.api.ClassOfTheApi;
import de.feststelltaste.encapsulation.whistleblower.service.api.Service;

public class Client {

    Service service;

    public Client(Service service) {
        this.service = service;
    }

    public void executeService() {
        ClassOfTheApi result = service.doSomething();
    }


}
