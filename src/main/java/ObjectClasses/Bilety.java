package ObjectClasses;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Bilety implements Serializable {
    private Integer id;
    private Integer id_rozkladu;
    private LocalDateTime data_waznosci;
    private Double cena;

    public Bilety(Integer id, Integer id_rozkladu, LocalDateTime data_waznosci, Double cena) {
        this.id = id;
        this.id_rozkladu = id_rozkladu;
        this.data_waznosci = data_waznosci.now().withHour(23).withMinute(59).withSecond(59).withNano(999);
        this.cena = cena;
    }

    public Integer getId() {
        return id;
    }

    public Integer getId_rozkladu() {
        return id_rozkladu;
    }

    public LocalDateTime getData_waznosci() {
        return data_waznosci;
    }

    public Double getCena() {
        return cena;
    }
}