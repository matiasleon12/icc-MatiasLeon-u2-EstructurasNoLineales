package Materia.Controllers;

import Materia.Models.Node;

public class ArbolBinario {

    private Node raiz;

    public ArbolBinario(){
        this.raiz=null;

    }

    public void insert(int value){

        raiz = insertRec(raiz,value);                      

    }

    private Node insertRec(Node padre , int value){

        if (padre==null){
            return new Node(value);
        }
        if(value<padre.getValue()){
            //me voy a la left
            padre.setLeft(insertRec(padre.getLeft(), value));
        }else if(value>padre.getValue()){
            //me voy a la der
            padre.setRight(insertRec(padre.getRight(), value));

        }
        return padre;
        

    }

    public void imprimirArbol(){

        imprimir(raiz);

    }
    public void imprimir(Node node){
        if (node != null){

            
            System.out.println(node.getValue()+", ");
            
            imprimir(node.getLeft());
            imprimir(node.getRight());
        }
    }

    public boolean buscar(int value){
        return buscarRec(raiz, value);
    }

    private boolean  buscarRec(Node padre, int value){
        int right=0;
        int left=0;
        while(left<=right){
            int medio = (left + right)/2;
        }
    }
}