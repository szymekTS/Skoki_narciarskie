package tomasz.szymaski.skoki.shared.dto;

import java.io.Serializable;

public class SkoczekDTO implements Serializable {
    private static final long serialVersionUID = 9015030391223486590L;
    private long id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private long pesel;

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
