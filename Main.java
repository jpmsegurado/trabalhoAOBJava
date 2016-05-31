/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoãoPedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.addItemFinal("bla", 1);
        lista.addItemFinal("bla", 2);
        lista.addItemInicio("bla", 3);
        lista.addItemInicio("bla", 4);
        System.out.println(lista.imprimeLista());
        lista.removeItem(1);
        System.out.println(lista.imprimeLista());
        
    }
    
    
    
}
