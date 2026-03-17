import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("88761bc6-22e1-4759-a5a5-7097d59e8463")
public class Estudiante {
    @objid ("20ca979b-3eb6-4e27-bae5-fe104fe71033")
    private String nombre;

    @objid ("6a98aad3-edba-4181-b8e7-c9ded73efb31")
    private int identificador;

    @objid ("fb8e9ccd-81df-465e-9f15-8e28b92d6b41")
    public Modulo estudia;

    @objid ("92984f2c-270b-4418-b4aa-9eb0d8515bce")
    public String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombre;
    }

    @objid ("b7dfcaca-be1a-4c0c-b925-8e597e4b5fb4")
    public void setNombre(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombre = value;
    }

    @objid ("7dd20ee6-771c-45dc-8622-16acd73e9561")
    public Estudiante(final String nombre, final int identificador) {
    }

}
