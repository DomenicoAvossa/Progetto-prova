import java.util.Scanner;
import java.util.ArrayList;
public class mainFilm{
    public static void main(String [] args){
        Scanner in=new Scanner (System.in);
        int scelta;
        ArrayList<classeFilm> film=new ArrayList<classeFilm>();
        
        do{
            System.out.println("MENù");
            System.out.println("1.Inserire un film");
            System.out.println("2.Visualizzare tutti i film");
            System.out.println("3.Cercare un film per codice");
            System.out.println("4.Calcolare la durata media dei film");
            System.out.println("5.Trovare il film più lungo");
            System.out.println("6.Eliminare un film tramite codice");
            System.out.println("7.Esci");
            scelta=in.nextInt();
            in.nextLine();
            switch(scelta){
                case 1:
                    
                    System.out.println("Inserisci il codice del film ");
                    int codice=in.nextInt();
                    in.nextLine();
                    System.out.println("Inserisci il titolo del film ");
                    String titolo=in.nextLine();
                    System.out.println("Inserisci la durata del film");
                    int durata=in.nextInt();
                    in.nextLine();

                    Film nuovofilm=new Film(codice,titolo,durata);
                    film.add(nuovofilm);
                
                    break;
                    case 2:
                        for(int i=0;i<film.size();i++){
                            System.out.println(film.get(i).toString());
                        }
                        break;
                        case 3:
                            int cerca;
                            System.out.println("Inserisci il codice da trovare");
                            cerca=in.nextInt();
                            in.nextLine();
                            for(int i=0;i<film.size();i++){
                                if(film.get(i).getcodice()==cerca){
                                    System.out.println("Il film esiste");
                                    System.out.println(film.get(i).toString());
                                }
                                else{
                                    System.out.println("Codice non valido");
                                }
                            }
                            break;
                            case 4:
                                double media;
                                for(int i=0;i<film.size();i++){
                                     somma=somma+film.get(i).getdurata();
                                }
                                media=(double)somma/film.size();
                                System.out.println("La duratamedia dei film è: " +media);
                                break;
                                case 5:
                                    for(int i=0;i<film.size();i++){
                                        int maxDurata=0;
                                        Film filmpiùlungo=null;
                                        if(film.get(i).getdurata()>maxDurata){
                                            maxDurata=film.get(i).getdurata();
                                            String filmpiùlungo=film.get(i);
                                        }
                            
                                    System.out.println("Il film più lungo è :" +filmpiùlungo);
                                    break;

                                    case 6:
                                        System.out.println("Inserisci il codice del film da eleminare");
                                        int codicedaEliminare=in.nextInt();
                                        in.nextLine();
                                        for(int i=0;i<film.size();i++){
                                            if(film.get(i).getcodice()==codicedaEliminare){
                                                film.remove(i);
                                                 break;
                                            }
                                        }
                                       
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
}
