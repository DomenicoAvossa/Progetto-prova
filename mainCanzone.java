import java.util.Scanner;
import java.util.ArrayList;
public class mainCanzone{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<classeCanzone> Canzone=new ArrayList<classeCanzone>();
        int scelta; 
        do{
            System.out.println("Menù");
            System.out.println("1. Inserisci una canzone ");
            System.out.println("2.Visualizza tutte le canzoni");
            System.out.println("3.Cercare una canzone per codice");
            System.out.println("4.Calcolare la duratamedia delle canzoni");
            System.out.println("5.Trovare la canzone più lunga");
            System.out.println("6.Eliminare una canzone tramite codice");
            System.out.println("7.Esci");
            scelta=in.nextInt();
            in.nextLine();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci il codice della canzone");
                    int codice=in.nextInt();
                    in.nextLine();
                    System.out.println("Inserisci il titolo della canzone");
                    String titolo=in.nextLine();
                    System.out.println("Inserisci la durata della canzone");
                    double durata=in.nextDouble();
                    in.nextLine();
                
                    classeCanzone nuovacanzone=new classeCanzone(codice,titolo,durata);
                    Canzone.add(nuovacanzone);
                    break;
                    case 2:
                        for(int i=0;i<Canzone.size();i++){
                            System.out.println(Canzone.get(i).toString());
                        }
                        break;
                        case 3:
                            System.out.println("Inserisci il codice della canzone da cercare");
                            int codicedaCercare=in.nextInt();
                            in.nextLine();
                            boolean trovato=false;
                            for(int i=0;i<Canzone.size();i++){
                                if(Canzone.get(i).getcodice()==codicedaCercare){
                                    System.out.println(Canzone.get(i).toString());
                                    trovato=true;
                                }
                            }
                            break;
                            case 4:
                                double somma=0;
                                for(int i=0;i<Canzone.size();i++){
                                    somma=somma+Canzone.get(i).getdurata();
                                }
                                double media=somma/Canzone.size();
                                System.out.println("La durata media è :" +media);
                                break;
                                case 5:
                                    int maxDurata=0;
                                    classeCanzone canzonepiùLunga=null;
                                    for(int i=0;i<Canzone.size();i++){
                                        
                                        if(Canzone.get(i).getdurata()>maxDurata){
                                            maxDurata=Canzone.get(i).getdurata();
                                            canzonepiùLunga=Canzone.get(i);
                                        }
                                    }
                                    break;
                                    case 6:
                                        System.out.println("Inserisci il codice della canzone da eliminare");
                                        int codicedaEliminare=in.nextInt();
                                        in.nextLine();
                                        for(int i=0;i<Canzone.size();i++){
                                            if(Canzone.get(i).getcodice()==codicedaEliminare){
                                                Canzone.remove(i);
                                                
                                            }
                                        }
                                        break;
                                        case 7:
                                            System.out.println("Uscita dal programma . . .");
                                            break;
                                            default:
                                                System.out.println("Scelta non valida");
            }
            
        }
        while(scelta!=7);
            in.close();
    }
}