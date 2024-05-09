package parcial;

import java.util.LinkedList;

public class TArbolBB<T> implements IArbolBB<T> {

    private IElementoAB<T> raiz;

    public IElementoAB<T> getRaiz() {
        return raiz;
    }

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    /**
     * @param unElemento
     * @return
     */
    @Override
    public boolean insertar(IElementoAB<T> unElemento) {
        if (esVacio()) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public IElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    /**
     * @return recorrida en inorden del arbol, null en caso de ser vacío
     */


    /**
     * @return recorrida en preOrden del arbol, null en caso de ser vacío
     */
    /**
     * @return
     */
    public boolean esVacio() {
        return (raiz == null);
    }



    @Override
    public LinkedList<T> inOrden() {
        LinkedList<T> listaInorden = null;
        if (!esVacio()) {
            listaInorden = new LinkedList<>();
            raiz.inOrden(listaInorden);
        }
        return listaInorden;

    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if (!esVacio()) {
            this.raiz = this.raiz.eliminar(unaEtiqueta);
        }
    }


 @Override
    public int obtenerTamanio() {
       if (esVacio())
           return 0;
       return this.getRaiz().obtenerTamanio();
    }

    @Override
    public LinkedList<T> preOrden() {
         LinkedList<T> listaPreOrden = null;
        if (!esVacio()) {
            listaPreOrden = new LinkedList<>();
            raiz.preOrden(listaPreOrden);
        }
        return listaPreOrden;
    }

    @Override
    public LinkedList<T> postOrden() {
        LinkedList<T> listaPostOrden = null;
        if (!esVacio()) {
            listaPostOrden = new LinkedList<>();
            raiz.postOrden(listaPostOrden);
        }
        return listaPostOrden;

    }


}
