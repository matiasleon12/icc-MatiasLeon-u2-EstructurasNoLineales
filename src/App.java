import Materia.Controllers.ArbolBinario;

public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario ab = new ArbolBinario();
        ab.instert(50);
        ab.instert(17);
        ab.instert(76);
        ab.instert(9);
        ab.instert(23);
        ab.instert(54);
        ab.instert(14);
        ab.instert(19);
        System.out.println("Nombre: Matias Leon");
        System.out.println("Peso del árbol = " + ab.contarNodos());
        System.out.println("Altura es = " + ab.getHeight());

        System.out.print("Arbol InOrder\n");
        ab.imprimirInOrder();

        System.out.print("Arbol InOrder con alturas\n");
        ab.imprimirInOrderConAltura();

        System.out.print("Arbol InOrder con factor de equilibrio\n");
        ab.imprimirInOrderConFE();

        System.out.println("Arbol está equilibrado = " + ab.estaEquilibrado());

        System.out.println("Agregamos valor = 15");
        ab.instert(15);

        System.out.print("Arbol InOrder con factor de equilibrio\n");
        ab.imprimirInOrderConFE();

        ab.imprimirDesequilibrados();

    }


}