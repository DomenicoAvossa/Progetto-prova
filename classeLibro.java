public class classeLibro{
   private int codice;
   private String titolo;
   private double prezzo;
   public classeLibro(int codice,String titolo,double prezzo){
        this.codice=codice;
        this.titolo=titolo;
        this.prezzo=prezzo;
   }
   public void setCodice(int codice){
        this.codice=codice;
   }
   public void setTitolo(String titolo){
        this.titolo=titolo;
   }
   public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
   }
   public int getcodice(){
        return codice;
   }
   public String getTitolo(){
        return titolo;
   }
   public double getPrezzo(){
        return prezzo;
   }
    public String toString(){
        return "Codice :" +codice+
        "\nTitolo :"+titolo+
        "Prezzo :" +prezzo;
    } 
}