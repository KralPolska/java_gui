package ObjectClasses;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BiletyMiesieczne implements Serializable {
    private Integer id;
    private String username;
    private LocalDateTime data_start;
    private LocalDateTime data_koniec;

    public BiletyMiesieczne()
    {
        this.id=-1;
        this.username="";
        this.data_start=null;
        this.data_koniec=null;
    }
    public BiletyMiesieczne(Integer id, String username, LocalDateTime data_start, LocalDateTime data_koniec) {
        this.id = id;
        this.username = username;
        this.data_start = data_start;
        this.data_koniec = data_koniec;
    }
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public LocalDateTime getData_start() {
        return data_start;
    }

    public LocalDateTime getData_koniec() {
        return data_koniec;
    }
}
