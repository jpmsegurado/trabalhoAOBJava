/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoãoPedro
 */
public class ListaEncadeada {
    
    private int tamanho;
    private ItemLista primeiro,ultimo;
    
    ListaEncadeada(){
        this.tamanho = 0;
        this.primeiro = null;
        this.ultimo = null;
    }
    
    public void addItemInicio(String dado,int chave){
        ItemLista novo = new ItemLista(dado, chave);
        novo.setProximo(this.primeiro);
        this.primeiro = novo;
    }
    public void addItemFinal(String dado,int chave){
        ItemLista novo = new ItemLista(dado, chave);
        ItemLista aux = this.primeiro;
        if(this.primeiro == null){
            // se não existe um primeiro, cria o primeiro
            this.primeiro = novo;
            this.ultimo = this.primeiro;
        }else{
            // caso contrarario pega cria um novo item
            // faz o ultimo como o seu proximo
            // e faz com que seja o ultimo da lista
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }
        
        this.tamanho++;
    }

    public void removeItem(int chave){
        ItemLista aux = this.primeiro;
        while(aux != null && aux.getProximo().getChave() != chave){
            aux = aux.getProximo();
        }
        
        aux.setProximo(aux.getProximo().getProximo());
        
        
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public ItemLista getPrimeiro() {
        return primeiro;
    }
    
    public ItemLista getItemLista(int chave){
        ItemLista aux = this.primeiro;
        while(aux != null && aux.getChave() != chave){
            aux = aux.getProximo();
        }
        
        return aux;
    }
    
    public String imprimeLista(){
        ItemLista aux = this.primeiro;
        StringBuilder builder = new StringBuilder();
        while(aux != null){
            builder.append("\n");
            builder.append("chave-->").append(aux.getChave());
            builder.append("\n");
            builder.append("dado--->").append(aux.getDado());
            builder.append("\n");
            
            aux = aux.getProximo();
        }
        builder.append("\n");
        builder.append("----fim lista----");
        
        return builder.toString();
    }
    
    
    public void ordenaLista(){
        ItemLista aux1 = this.primeiro;
        while(aux1 != null){
            ItemLista aux2 = this.primeiro;
            while(aux2 != null){
                if(aux2.getChave() > aux1.getChave()){
                    trocaValores(aux1, aux2);
                }
                
                aux2 = aux2.getProximo();
            }
            aux1 = aux1.getProximo();
        }
    }
    
    public void trocaValores(ItemLista item1, ItemLista item2){
        ItemLista aux = new ItemLista(item1.getDado(), item1.getChave());
        item1.setChave(item2.getChave());
        item1.setDado(item2.getDado());
        item2.setChave(aux.getChave());
        item2.setDado(aux.getDado());
        
        
    }
        
}
