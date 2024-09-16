package p04_02_objects_in_list;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private String name;
    private Timestamp createdTimestamp;

    public Item(String itemName) {
        this.name = itemName;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()); 
    }

    public String getFormattedCreatedTimestamp() {
        LocalDateTime localDateTime = this.createdTimestamp.toLocalDateTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 

        return localDateTime.format(formatter);
    }

    public String toString(){
        return this.name + " " + "(created at: " + this.getFormattedCreatedTimestamp() + ")";
    }
}
