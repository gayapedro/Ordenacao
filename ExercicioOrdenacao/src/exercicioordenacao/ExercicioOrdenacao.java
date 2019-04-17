/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioordenacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 030112096
 */
public class ExercicioOrdenacao {

    int tamanho = 0;
            
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Periodico> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("./src/resource/QualisCapes.csv"))) {
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] valores = line.split(";");
                    Periodico per = new Periodico(valores[0],valores[1],valores[2],valores[3]);
                    lista.add(per);
                }
        }
        Periodico[] vet = lista.toArray(new Periodico[lista.size()]);
        lista.clear();
        System.out.println("Selection Sort | Comparações: "+Sort.selectionSort(vet));
        try (BufferedReader br = new BufferedReader(new FileReader("./src/resource/QualisCapes.csv"))) {
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] valores = line.split(";");
                    Periodico per = new Periodico(valores[0],valores[1],valores[2],valores[3]);
                    lista.add(per);
                }
        }
        vet = lista.toArray(new Periodico[lista.size()]);
        lista.clear();
        System.out.println("Insertion Sort | Comparações: "+Sort.insertionSort(vet));
        try (BufferedReader br = new BufferedReader(new FileReader("./src/resource/QualisCapes.csv"))) {
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] valores = line.split(";");
                    Periodico per = new Periodico(valores[0],valores[1],valores[2],valores[3]);
                    lista.add(per);
                }
        }
        vet = lista.toArray(new Periodico[lista.size()]);
        lista.clear();
        System.out.println("Shell Sort | Comparações: "+Sort.shellSort(vet));
    }
    
}
