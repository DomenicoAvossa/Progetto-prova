public class classeFilm{
    private int codice;
    private String titolo;
    private int durata;
    public classeFilm(int codice,String titolo,int durata){
        this.codice=codice;
        this.titolo=titolo;
        this.durata=durata;
    }
    public void setcodice(int codice){
        this.codice=codice;
    }
    public void settitolo(String titolo){
        this.titolo=titolo;
    }
    public void setdurata(int durata){
        this.durata=durata;
    }
    public int getcodice(){
        return codice;
    }
    public String gettitolo(){
        return titolo;
    }
    public int getdurata(){
        return durata;
    }
    public String toString(){
        return "Codice :" +codice+
        "\nTitolo :" + titolo;
        "Durata :"+durata;
    }

}