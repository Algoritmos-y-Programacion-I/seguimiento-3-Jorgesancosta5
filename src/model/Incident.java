package model;

import java.time.LocalDate;

/*
 * ANALISIS
 * Descripcion: Incidente reportado a un computador con fecha, descripcion
 * y estado de solucion .
 */
public class Incident {

    private LocalDate dateReport;   // no null
    private String description;     // no vacia
    private boolean solution;       // false por defecto
    private int solutionHours;      

    public Incident(LocalDate dateReport, String description) {
        this.dateReport = dateReport;
        this.description = description;
        this.solution = false;
        this.solutionHours = 0;
    }

    public LocalDate getDateReport() { return dateReport; }
    public String getDescription() { return description; }
    public boolean isSolution() { return solution; }
    public int getSolutionHours() { return solutionHours; }

    /** Marca solucion y registra horas y si no ha sido solucionado sera o puede ser 0. */
    public void setSolution(boolean solution, int solutionHours) {
        this.solution = solution;
        this.solutionHours = Math.max(0, solutionHours);
    }

    @Override
    public String toString() {
        String estado = solution ? ("SOLUCIONADO (" + solutionHours + "h)") : "PENDIENTE";
        return dateReport + " - " + description + " - " + estado;
    }
}
