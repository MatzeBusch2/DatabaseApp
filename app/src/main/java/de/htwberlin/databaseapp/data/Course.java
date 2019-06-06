package de.htwberlin.databaseapp.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(foreignKeys = @ForeignKey(entity = Instructor.class, parentColumns = "id", childColumns = "instructor_name"))


public class Course implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int cid;

    @ColumnInfo(name = "course_name")
    public String courseName;

    @ColumnInfo(name = "location")
    public String location;

    @ColumnInfo(name = "instructor_name")
    public String instructorName;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String toString(){
        return "{"+this.cid + "," + this.courseName + "," + this.location + this.instructorName +"}";
    }
}
