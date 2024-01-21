package ObjectClasses;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class RozkladJazdy {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty linia;
    private final SimpleStringProperty opis;

    public RozkladJazdy(int id, String linia, String opis) {
        this.id = new SimpleIntegerProperty(id);
        this.linia = new SimpleStringProperty(linia);
        this.opis = new SimpleStringProperty(opis);
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public SimpleStringProperty liniaProperty() {
        return linia;
    }

    public SimpleStringProperty opisProperty() {
        return opis;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public void setLinia(String linia) {
        this.linia.set(linia);
    }

    public void setOpis(String opis) {
        this.opis.set(opis);
    }

    public int getId() {
        return id.get();
    }
    public String getLinia() {
        return linia.get();
    }
    public String getOpis()
    {
        return opis.get();
    }
}