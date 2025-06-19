/*package Materia.Controllers;

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
    
}*/

package Materia.Controllers;

import Materia.Models.Node;

public class ArbolBinario{
    private Node raiz;

    public ArbolBinario() {
        this.raiz = null;
    }
    public void instert(int value){
        raiz = insertRec(raiz, value);


    }
    private Node insertRec(Node padre, int  value){
        if (padre==null){
            return new Node(value);
        }
        if( value <padre.getValue()){
            padre.setLeft(insertRec(padre.getLeft(), value));

        }else if(value>padre.getValue()){
            padre.setRight(insertRec(padre.getRight(), value));

        }
        return padre;
    

    }
    public void imprimirArbol(){
        // int alturat = getHeight();
        // System.out.println(" Altura total= " + alturat);
        imprimirPreOrderE(raiz);
        
        
        
    }
    // public void imprimir(Node node){
    //     if(node!=null){
    //         imprimir(node.getIzquierda());
    //         System.out.print(node.getValue()+ ", ");
    //         imprimir(node.getDerecha());
    //     }
    
    public void imprimirInOrderConAltura() {
        inOrderConAltura(raiz);
        System.out.println();
    }

    private void inOrderConAltura(Node node) {
        if (node != null) {
            inOrderConAltura(node.getLeft());
            int h = getHeightRec(node);
            System.out.print(node.getValue() + "(h=" + h + "), ");
            inOrderConAltura(node.getRight());
        }
    }



    public void imprimirPreOrder(Node node){
        if(node!=null){
            int altura = getHeightRec(node);
            System.out.print(node.getValue()+ " altura " + '('+ altura + ')' + ", ");
            imprimirPreOrder(node.getLeft());
            imprimirPreOrder(node.getRight());

        }
    }
     public void imprimirPreOrderE(Node node){
        if(node!=null){
            int equilibrio = getEquilibrioRec(node);
            System.out.print(node.getValue()+ " bf " + '('+ equilibrio + ')' + ", ");
            imprimirPreOrderE(node.getLeft());
            imprimirPreOrderE(node.getRight());

        }
    }
    public boolean buscar(int value){
        return buscarRec(raiz, value);
    }
    public Boolean buscarRec(Node root, int value){
        if (root == null) {
            System.out.println("Valor no encontrado");
        return false; 
    }

        if (value == root.getValue()) {
            System.out.println("Valor encontrado");
            return true;

        } else if (value < root.getValue()) {

            return buscarRec(root.getLeft(), value);

        } else {

            return buscarRec(root.getRight(), value);
        }

    }
    public int getHeight(){
        return getHeightRec(raiz);

    }
    public int getHeightRec(Node node){
        if(node == null){
            return 0;
        }
        int izquierdaHeight = getHeightRec(node.getLeft());
        int derechaHeight = getHeightRec(node.getRight());
        return Math.max(izquierdaHeight, derechaHeight)+1;
    }
    public int getEquilibrio(){
        return getEquilibrioRec(raiz);
    }
    public int getEquilibrioRec(Node node){
        if(node == null){
            return 0;
        }
        
        return getHeightRec(node.getLeft())- getHeightRec(node.getRight());

    }
    public int contarNodos() {
        return contarNodosRec(raiz);

    }
    public int contarNodosRec(Node node) {
    if (node == null) return 0;
    return 1 + contarNodosRec(node.getLeft()) + contarNodosRec(node.getRight());
    }

    public void imprimirInOrder() {
    inOrder(raiz);
    System.out.println();
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getValue() + ", ");
            inOrder(node.getRight());
        }
    }
    
    public void imprimirInOrderConEquilibrio() {
        inOrderConAltura(raiz);
        System.out.println();
    }

    public void inOrderConEquilibrio(Node node) {
        if (node != null) {
            inOrderConAltura(node.getLeft());
            int h = getHeightRec(node);
            System.out.print(node.getValue() + "(h=" + h + "), ");
            inOrderConAltura(node.getRight());
        }
    }
    public void imprimirInOrderConFE() {
        inOrderConFE(raiz);
        System.out.println();
    }

    private void inOrderConFE(Node node) {
        if (node != null) {
            inOrderConFE(node.getLeft());
            int bf = getEquilibrioRec(node);
            System.out.print(node.getValue() + "(bf=" + bf + "), ");
            inOrderConFE(node.getRight());
        }
    }


    public boolean estaEquilibrado() {
        return estaEquilibradoRec(raiz);
    }

    public boolean estaEquilibradoRec(Node node) {
        if (node == null) return true;
        int bf = getEquilibrioRec(node);
        return Math.abs(bf) <= 1 && estaEquilibradoRec(node.getLeft()) && estaEquilibradoRec(node.getRight());
    }


    public void imprimirDesequilibrados() {
        System.out.print("Nodos desequilibrados = ");
        imprimirDesequilibradosRec(raiz);
        System.out.println();
    }

    public void imprimirDesequilibradosRec(Node node) {
        if (node != null) {
            imprimirDesequilibradosRec(node.getLeft());
            int fe = getEquilibrioRec(node);
            if (Math.abs(fe) > 1) {
            System.out.print(node.getValue() + "(fE = " + fe + ") ");
            }
            imprimirDesequilibradosRec(node.getRight());
        }
    }

}