package model;

import java.util.ArrayList;

/*
 * ANALISIS
 * Descripcion: Computador con serial unico, ubicado en un piso/columna
 * y con una lista (ArrayList) de incidentes asociados (relacion 1..*).
 */

/** Entidad Computador. */
public class Computador {

    private String serial;             // unico
    private int piso;                  // 1..5
    private int columna;               // 0..9 (primera disponible al registrar)
    private ArrayList<Incidente> incidentes;

    /**
     * Crea un computador.
     * @param serial serial unico.
     * @param piso piso de ubicacion (1..5).
     * @param columna columna en el piso (0..9).
     * @pre  serial!=null && !serial.trim().isEmpty() && piso>=1 && piso<=5 && columna>=0 && columna<=9
     * @post atributos asignados y lista de incidentes vacia
     */
    public Computador(String serial, int piso, int columna) {
        this.serial = serial;
        this.piso = piso;
        this.columna = columna;
        this.incidentes = new ArrayList<Incidente>();
    }

    /** @return serial. */
    public String getSerial() { return serial; }

    /** @return piso (1..5). */
    public int getPiso() { return piso; }

    /** @return columna (0..9). */
    public int getColumna() { return columna; }

    /** @return cantidad de incidentes. */
    public int getCantidadIncidentes() { return incidentes.size(); }

    /** @return lista interna (solo lectura por referencia). */
    public ArrayList<Incidente> getIncidentes() { return incidentes; }

    /**
     * Agrega un incidente a este computador.
     * @param inc incidente no nulo.
     * @pre  inc!=null
     * @post incidentes.size() aumenta en 1 y el ultimo es inc
     */
    public void agregarIncidente(Incidente inc) { incidentes.add(inc); }

    @Override
    public String toString() {
        return "PC[" + serial + "] Piso " + piso + " Col " + columna + " (incidentes=" + incidentes.size() + ")";
    }
}