package tomasz.szymaski.skoki.model.response;

public class SkoczekRest {
    private long id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private int miejsce;
    private float tura1;
    private float tura2;

    public int getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(int miejsce) {
        this.miejsce = miejsce;
    }

    public long getId() {
        return id;
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
