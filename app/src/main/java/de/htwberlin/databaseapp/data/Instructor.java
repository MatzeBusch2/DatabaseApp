package de.htwberlin.databaseapp.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Instructor  {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "instructor_name")
    public String instructorName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "{"+this.id + "," + this.instructorName +"}";
    }
}
