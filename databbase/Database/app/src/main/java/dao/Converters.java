package dao;

import androidx.room.TypeConverter;

import java.util.Date;
import com.google.type.DateTime;


public class Converters {
    @TypeConverter
    public  Date toDate(Long dateLong){
        return dateLong == null ? null: new Date(dateLong);
    }

    @TypeConverter
    public Long fromDate(Date date){
        return date == null ? null : date.getTime();
    }
}
