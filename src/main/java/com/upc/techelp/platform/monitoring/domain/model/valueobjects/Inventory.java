package com.upc.techelp.platform.monitoring.domain.model.valueobjects;

import com.upc.techelp.platform.monitoring.domain.model.entities.ComponentItem;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Embeddable
public class Inventory {
    @OneToMany(mappedBy = "dashBoard")
    private List<ComponentItem> inventory = new ArrayList<>();

    public Inventory() {
    }

    public void addItem() {

    }

}
