#include<iostream>
#include<vector>
using namespace std;
void votomax(vector <int>voti){
    int max=voti[0];
    for(int i=0;i<voti.size();i++){
        if(voti[i]>max){
            max=voti[i];
        }
    }
    cout<<"Il voto massimo è :" <<max<<endl;
}
void votomin(vector <int>voti){
    int min=voti[0];
    for(int i=1;i<voti.size();i++){
        if(voti[i]<min){
            min=voti[i];
        }
    }
    cout<<"Il voto minimo è : "<<min<<endl;;
}
void media(vector <int> voti){
    int somma=0;
    for(int i=0;i<voti.size();i++){
        somma=somma+voti[i];
    }
    int media=somma/voti.size();
    cout<<"La media dei voti è : "<<media<<endl;
}
int main(){
    int n;
    cout<<"Inserisci il numero di voti"<<endl;
    cin>>n;
    vector<int>voti;
    int num;
    int scelta;
    for(int i=0;i<n;i++){
        cout<<"Inserisci un numero"<<endl;
        cin>>num;
        voti.push_back(num);
    }
    do{
        cout<<"\nMENù\n"<<endl;
        cout<<"1.Calcola il massimo"<<endl;
        cout<<"2.Calcola il minimo"<<endl;
        cout<<"3.Calcolare la media dei voti"<<endl;
        cout<<"4.Esci"<<endl;
        cin>>scelta;
        switch (scelta){
        case 1:
            votomax(voti);
        break;
        case 2:
            votomin(voti);
        break;
        case 3:
            media(voti);
        break;
        case 4:
            cout<<"Uscita dal programma . . . "<<endl;
        break;
        default:
            cout<<"Scelta non valida"<<endl;
        }
        }
        while(scelta!=4);
        
        return 0;
        
}