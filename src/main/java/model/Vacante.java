package model;

import java.util.Objects;

public class Vacante {
    private Integer idVacante;
    private String nombreDeVacante;
    private String descripcion;
    private String fechaPublicacion;
    private Double salarioVacante;
    private Integer destacado;

    public Vacante(Integer idVacante, String nombreDeVacante, String descripcion, String fechaPublicacion, Double salarioVacante, Integer destacado) {
        this.idVacante = idVacante;
        this.nombreDeVacante = nombreDeVacante;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.salarioVacante = salarioVacante;
        this.destacado = destacado;
    }

    public Integer getIdVacante() {
        return idVacante;
    }

    public void setIdVacante(Integer idVacante) {
        this.idVacante = idVacante;
    }

    public String getNombreDeVacante() {
        return nombreDeVacante;
    }

    public void setNombreDeVacante(String nombreDeVacante) {
        this.nombreDeVacante = nombreDeVacante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Double getSalarioVacante() {
        return salarioVacante;
    }

    public void setSalarioVacante(Double salarioVacante) {
        this.salarioVacante = salarioVacante;
    }

    public Integer getDestacado() {
        return destacado;
    }

    public void setDestacado(Integer destacado) {
        this.destacado = destacado;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Vacante vacante)) return false;
        return Objects.equals(getIdVacante(), vacante.getIdVacante()) && Objects.equals(getNombreDeVacante(), vacante.getNombreDeVacante()) && Objects.equals(getDescripcion(), vacante.getDescripcion()) && Objects.equals(getFechaPublicacion(), vacante.getFechaPublicacion()) && Objects.equals(getSalarioVacante(), vacante.getSalarioVacante()) && Objects.equals(getDestacado(), vacante.getDestacado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVacante(), getNombreDeVacante(), getDescripcion(), getFechaPublicacion(), getSalarioVacante(), getDestacado());
    }

    @Override
    public String toString() {
        return "idVacante: " + idVacante +
                ", nombreDeVacante: " + nombreDeVacante + '\'' +
                ", descripcion: " + descripcion + '\'' +
                ", fechaPublicacion: " + fechaPublicacion +
                ", salarioVacante: " + salarioVacante +
                ", destacado: " + destacado;
    }


}
