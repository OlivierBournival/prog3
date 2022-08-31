package dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import model.Personne;

@Dao
public interface monDao {

    @Insert
     Long createpersonne(Personne p);

    @Query("Select * From personne")
    List<Personne> touteLesPersonne();


}
