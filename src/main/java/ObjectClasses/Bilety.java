package ObjectClasses;

import java.io.Serializable;
import java.time.LocalDate;

public class Bilety implements Serializable {
    private Integer id;
    private Integer id_rozkladu;
    private LocalDate data_waznosci;
    private Double cena;

    public Bilety(Integer id, Integer id_rozkladu, LocalDate data_waznosci, Double cena) {
        this.id = id;
        this.id_rozkladu = id_rozkladu;
        this.data_waznosci = data_waznosci;
        this.cena = cena;
    }

    public Integer getId() {
        return id;
    }

    public Integer getId_rozkladu() {
        return id_rozkladu;
    }

    public LocalDate getData_waznosci() {
        return data_waznosci;
    }

    public Double getCena() {
        return cena;
    }
}
