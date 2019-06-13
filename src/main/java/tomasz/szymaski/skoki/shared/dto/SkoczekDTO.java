package tomasz.szymaski.skoki.shared.dto;

import java.io.Serializable;

public class SkoczekDTO implements Serializable {
    private static final long serialVersionUID = 9015030391223486590L;
    private long id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private long pesel;
    private int miejsce;
    private float tura1;
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

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public long getId() {
        return id;
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
