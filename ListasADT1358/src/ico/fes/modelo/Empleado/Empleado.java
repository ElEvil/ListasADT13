/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.modelo.Empleado;

/**
 *
 * @author user
 */
public class Empleado {

    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private float sueldobase;
    private int aniodeingreso;
    private int horasExtras;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterno, String materno, float sueldobase, int aniodeingreso, int horasExtras) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldobase = sueldobase;
        this.aniodeingreso = aniodeingreso;
        this.horasExtras = horasExtras;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the paterno
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    /**
     * @return the materno
     */
    public String getMaterno() {
        return materno;
    }

    /**
     * @param materno the materno to set
     */
    public void setMaterno(String materno) {
        this.materno = materno;
    }

    /**
     * @return the sueldobase
     */
    public float getSueldobase() {
        return sueldobase;
    }

    /**
     * @param sueldobase the sueldobase to set
     */
    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }

    /**
     * @return the aniodeingreso
     */
    public int getAniodeingreso() {
        return aniodeingreso;
    }

    /**
     * @param aniodeingreso the aniodeingreso to set
     */
    public void setAniodeingreso(int aniodeingreso) {
        this.aniodeingreso = aniodeingreso;
    }

    /**
     * @return the horasExtras
     */
    public int getHorasExtras() {
        return horasExtras;
    }

    /**
     * @param horasExtras the horasExtras to set
     */
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + "\n nombre=" + nombre + "\n paterno=" + paterno + "\n materno=" + materno + "\n sueldobase=" + sueldobase + "\n aniodeingreso=" + aniodeingreso + "\n horasExtras=" + horasExtras + "}\n------------------------\n";
    }
    

}
