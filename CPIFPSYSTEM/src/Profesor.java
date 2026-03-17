import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("60046938-1fa0-4432-bffb-ecf470e716ff")
public class Profesor {
    @objid ("2d18fca3-b247-42d2-81ee-f688daa0c4ec")
    private String nombre;

    @objid ("798483c2-6c46-47cb-af04-4a81fd5bd0aa")
    private int identificador;

    @objid ("0cdb8067-b6a5-4c29-a8d7-dc9453fe0ca8")
    public List<Modulo> imparte = new ArrayList<Modulo> ();

    @objid ("078ad7da-fc64-4c1e-b63c-ce9d2caf8e2c")
    public String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombre;
    }

    @objid ("19a2c7eb-53b8-41b1-8532-b22584d06e13")
    public void setNombre(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombre = value;
    }

    @objid ("478e9f7f-6831-48bc-bd87-454a77b295bb")
    public int getIdentificador() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.identificador;
    }

    @objid ("10bb7c56-04c2-44ac-b2d0-4923eab67e4b")
    public void setIdentificador(final int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.identificador = value;
    }

    @objid ("314eb822-bfa8-4e60-b8af-e62ddd145b24")
    public Profesor(final String nombre, final int identificador) {
    }

}
