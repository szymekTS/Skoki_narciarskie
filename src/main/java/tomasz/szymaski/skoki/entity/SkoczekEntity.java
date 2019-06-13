package tomasz.szymaski.skoki.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "skoczkowie")
public class SkoczekEntity implements Serializable {
    private static final long serialVersionUID = 5861268926826771827L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 50)
    private String imie;

    @Column(nullable = false, length = 50)
    private String nazwisko;

    @Column(nullable = false)
    private long pesel;

    @Column(nullable = false)
    private int wiek;
    @Column
    private int miejsce;
    @Column
    private float tura1;

    @Column
    private float tura2;

    public int getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(int miejsce) {
        this.miejsce = miejsce;
    }

    public float getTura1() {
        return tura1;
    }

    public void setTura1(float tura1) {
        this.tura1 = tura1;
    }

    public float getTura2() {
        return tura2;
    }

    public void setTura2(float tura2) {
        this.tura2 = tura2;
    }
    public long getId() {
        return id;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
