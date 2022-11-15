package com.example.service.Service;

import com.example.service.Model.Avis;
import com.example.service.Model.Item;

import java.util.List;

public interface service {
    void  creeAvis(Avis avis);

    void  creeItem(Item item);

    List<Avis> TouslesAvisDeCetItem(Item i);

    List<Avis> TouslesAvis();

    List<Item> TouslesItem();


}
