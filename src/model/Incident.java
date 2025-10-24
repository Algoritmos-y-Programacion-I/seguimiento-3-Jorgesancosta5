package model;

import java.time.LocalDate;

/*
 * ANALISIS
 * Descripcion: Incidente reportado a un computador con descripcion y fecha.
 */

/** Entidad Incidente. */
public class Incidente {

    private String descripcion;   // no vacia
    private LocalDate fecha;      // no null

    /**
     * Crea un incidente.
     * @param descripcion texto del incidente.
     * @param fecha fecha del incidente.
     * @pre  descripcion!=null && !descripcion.trim().isEmpty() && fecha!=null
     * @post this.descripcion==descripcion && this.fecha==fecha
     */
    public Incidente(String descripcion, LocalDate fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    /** @return descripcion del incidente. */
    public String getDescripcion() { return descripcion; }

    /** @return fecha del incidente. */
    public LocalDate getFecha() { return fecha; }

    @Override
    public String toString() {
        return fecha + ": " + descripcion;
    }
}