import java.util.Scanner;
import java.util.ArrayList;
public class mainLibro{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<classeLibro> lista=new ArrayList<classeLibro>();
        int scelta;
        do{
            System.out.println("Menù");
            System.out.println("1.Inserisci più libri");
            System.out.println("2.Visualizzare tutti i libri");
            System.out.println("3.Cercare un libro per codice");
            System.out.println("4.Calcolare il prezzo medio");
            System.out.println("5.Mostrare il libro più costoso");
            System.out.println("6.Contare quanti libri costano più di 20 euro");
            System.out.println("7.Eliminare un libro per codice");
            System.out.println("8.Esci");
            scelta=in.nextInt();
            in.nextLine();
            switch(scelta){
                case 1:
                    int n;
                    System.out.println("Quanti libri vuoi inserire");
                    n=in.nextInt();
                    in.nextLine();
                    for(int i=0;i<n;i++){
                        System.out.println("Inserisci il codice del libro :" +(i+1));
                        int codice=in.nextInt();
                        in.nextLine();
                        System.out.println("Inserisci il titolo del libro :" +(i+1));
                        String titolo=in.nextLine();
                        System.out.println("Inserisci il prezzo del libro :" +(i+1));
                        double prezzo=in.nextDouble();

                        Libro nuovoLibro= new Libro(codice,titolo,prezzo);
                        lista.add(nuovoLibro);
                    }
                    break;
                    case 2:
                        for(int i=0;i<lista.size();i++){
                            System.out.println(lista.get(i).toString());
                        }
                        break;
                        case 3:
                            System.out.println("Inserisci il codice del libro da cercare");
                            int codicedaCercare=in.nextInt();
                            in.nextLine();
                            for(int i=0;i<lista.size();i++){
                                if(lista.get(i).getCodice()==codicedaCercare){
                                    System.out.println(lista.get(i).toString());
                                }
                                }
                                break;
                                case 4:
                                    double somma=0;
                                    for(int i=0;i<lista.size();i++){
                                        somma=somma+lista.get(i).getPrezzo();
                                    }
                                    double media=somma/lista.size();
                                    System.out.println("Il prezzo medio è :" + media);
                                    break;
                                    
                                    case 5:
                                    double maxPrezzo=0;
                                    Libro libropiùcostoso=null;
                                    for(int i=0;i<lista.size();i++){
                                        if(lista.get(i).getPrezzo()>maxPrezzo){
                                            maxPrezzo=lista.get(i).getPrezzo();
                                            libropiùcostoso=lista.get(i);
                                        }
                                    }
                                    System.out.println("Il libro più costoso è :" +libropiùcostoso);
                                    break;
                                    
                                    case 6:
                                        int contatore=0;
                                        for(int i=0;i<lista.size();i++){
                                            if(lista.get(i).getPrezzo()>20){
                                                contatore++;
                                            }
                                        }
                                        System.out.println("I libri che superano il prezzo di 20 euro sono :" +contatore);
                                        break;
                                        case 7:
                                            System.out.println("Inserisci il codice del libro da eliminare");
                                            int codicedaEliminare=in.nextInt();
                                            in.nextLine();
                                            for(int i=0;i<lista.size();i++){
                                                if(lista.get(i).getCodice()==codicedaEliminare){
                                                    lista.remove(i);
                                                }
                                                else{
                                                    System.out.println("Libro non trovato");
                                                }
                                            }
                                            break;
                                            case 8:
                                                System.out.println("Uscita dal programma . . .");
                                                break;
                                                default:
                                                    System.out.println("Scelta non valida");

                                            
            }
        }
        while(scelta!=8);
        in.close();
    }
}