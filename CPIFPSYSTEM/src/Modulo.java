import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a6eb568b-f5b8-4ca6-996c-697f3b7e7187")
public class Modulo {
    @objid ("a5626c8d-0bb9-4ebe-8ae2-193fbbcc42fb")
    private String nombre;

    @objid ("93d727d4-f23d-4746-b489-fe239608a982")
    private int idModulo;

    @objid ("17d6d191-4521-488a-9fb6-d0c1b017973f")
    public void setNombre(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombre = value;
    }

    @objid ("78be7117-4197-4a6f-849b-16b7f3124eee")
    public String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombre;
    }

    @objid ("10e27402-0ae1-4d18-a094-8743bffb82b3")
    public Modulo(final String nombre, final int ideModulo) {
        this.nombre = nombre;
        this.idModulo = ideModulo;
    }

}
