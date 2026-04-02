public class classeCanzone{
    private int codice;
    private String titolo;
    private double durata;
    public classeCanzone(int codice,String titolo,double durata){
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
    public void setdurata(double durata){
        this.durata=durata;
    }
    public int getcodice(){
        return codice;
    }
    public String gettitolo(){
        return titolo;
    }
    public double getdurata(){
        return durata;
    }
    public String toString(){
        return "Codice :" +codice+
        "\nTitolo :" +titolo+
        "Durata :"+ durata;
    }
}