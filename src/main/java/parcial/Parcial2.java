package parcial;

import java.util.LinkedList;

import javax.swing.text.html.parser.Element;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ernesto
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlantillaMedicos hospital = new PlantillaMedicos();

        String[] archivo = ManejadorArchivosGenerico.leerArchivo("medicos.txt");
        String[] linea;
        Medico med;
        TElementoAB<Medico> elem;

        for (String string : archivo) {
            linea = string.split(",");
            med = new Medico(Integer.parseInt(linea[0]), linea[1], linea[2], Integer.parseInt(linea[3]));
            elem = new TElementoAB<Medico>(med.getCedula(), med);
            if (hospital.buscar(med.getCedula()) == null) {
                hospital.insertar(elem);
            }
        }

        /*
         * System.out.println(hospital);
         * for (Medico string : hospital.inOrden()) {
         * System.out.println(string.imprimirDatos());
         * }
         */

        System.out.println("conteo");
        System.out.println("numero de medicos");
        System.out.println(hospital.obtenerTamanio());

        hospital.eliminar(7669);
        hospital.eliminar(1632);
        hospital.eliminar(5328);
        hospital.eliminar(1081);
        hospital.eliminar(9069);

        System.out.println("\neliminaciones \n");

        System.out.println("numero de medicos despues de eliminacion");
        System.out.println(hospital.obtenerTamanio());

        System.out.println("directorios");
        TArbolBB arbolEspecialidad = hospital.obtenerDirectorio("Neurologia");
        System.out.println(arbolEspecialidad.obtenerTamanio());

    }

}
