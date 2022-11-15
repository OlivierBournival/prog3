package com.example.service.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.service.Model.Avis;
import com.example.service.Model.Item;

import java.util.List;



@Dao
public interface monDao {

    @Insert
     Long createAvis(Avis a);

    @Insert
    Long createItem(Item i);

    @Query("Select * From Avis")
    List<Avis> TouslesAvis();
    @Query("Select * From Item")
    List<Item> TouslesItem();

    @Query("Select * From Avis WHERE :i like idItem")
    List<Avis> TouslesAvisDeCetItem(Item i);


}
