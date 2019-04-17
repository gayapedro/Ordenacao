/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioordenacao;

/**
 *
 * @author 030112096
 */
public class Sort {
    
    public static long selectionSort(Comparable[] vet){
        long compares = 0;
        for(int i=0;i<vet.length-1;i++){
            int menor = i;
            for(int j=i+1;j<vet.length;j++){
                compares++;
                if(vet[j].compareTo(vet[menor])<0){
                    menor = j;
                }
            }
            if(menor!=i){
                Comparable aux = vet[menor];
                vet[menor] = vet[i];
                vet[i] = aux;
            }
        }
        return compares;
    }
    
    public static long insertionSort(Comparable[] vet){
        int j;
        long compares = 0;
        for(int i=1;i<vet.length;i++){
            Comparable aux=vet[i];
            for(j=i;j>0 && aux.compareTo(vet[j-1])<0;j--){
                compares++;
                vet[j] = vet[j-1];
            }
            vet[j] = aux;
        }
        return compares;
    }
    
    public static long shellSort(Comparable[] vet){
        long compares = 0;
        for(int n=vet.length/2;n>0;n/=2){
            for(int i=n;i<vet.length;i++){
                Comparable aux = vet[i];
                int j=i;
                for(;j>=n && aux.compareTo(vet[j-n])<0;j-=n){
                    compares++;
                    vet[j]=vet[j-n];
                }
                vet[j] = aux;
            }
        }
        return compares;
    }
}
