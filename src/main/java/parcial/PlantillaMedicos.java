package parcial;

import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ernesto
 */
public class PlantillaMedicos extends TArbolBB<Medico> implements IPlantillaMedicos {

    @Override
    public TArbolBB obtenerDirectorio(String laEspecialidad) {
        TArbolBB<Medico> arbol = new TArbolBB<>();
        obtenerMedicosConEspecialidad(this.getRaiz(), laEspecialidad, arbol);
        return arbol;
    }

    private void obtenerMedicosConEspecialidad(IElementoAB<Medico> actual, String laEspecialidad,
            TArbolBB<Medico> nuevoArbol) {

        Medico medico = actual.getDatos();
        TElementoAB elem = new TElementoAB(medico.getNombre(), medico);

        if (medico.getEspecialidad().equals(laEspecialidad)) {
            nuevoArbol.insertar(elem);
        }

        if (actual.getHijoIzq() != null) {
            obtenerMedicosConEspecialidad(actual.getHijoIzq(), laEspecialidad, nuevoArbol);
        }

        if (actual.getHijoDer() != null) {
            obtenerMedicosConEspecialidad(actual.getHijoDer(), laEspecialidad, nuevoArbol);
        }
    }
}
