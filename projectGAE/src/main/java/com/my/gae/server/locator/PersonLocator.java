package com.my.gae.server.locator;

import com.google.web.bindery.requestfactory.shared.Locator;
import com.my.gae.domain.Person;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;

@RooGwtLocator("com.my.gae.domain.Person")
@Component
public class PersonLocator extends Locator<Person, Long> {

    public Person create(Class<? extends com.my.gae.domain.Person> clazz) {
        return new Person();
    }

    public Person find(Class<? extends com.my.gae.domain.Person> clazz, Long id) {
        return Person.findPerson(id);
    }

    public Class<com.my.gae.domain.Person> getDomainType() {
        return Person.class;
    }

    public Long getId(Person person) {
        return person.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Person person) {
        return person.getVersion();
    }
}
