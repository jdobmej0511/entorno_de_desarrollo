import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("196fe5d3-178d-48b0-bef1-ad9ea0888ad3")
public class Departamento {
    @objid ("c8ffc49a-743a-4cbf-84af-45cb23928202")
    private String nombre;

    @objid ("4c56a8e7-32c1-48d1-b6b8-da7e3bf61e34")
    private Profesor jefeDepartamento;

    @objid ("a2f43da4-36c9-4d66-9068-ea1f25656e6e")
    public Profesor esJefe;

    @objid ("08ad0270-e8ab-49c0-ace9-8a31f804486b")
    public List<Modulo> contiene = new ArrayList<Modulo> ();

    @objid ("49296e4f-4e80-4704-9edf-bf39822c1f3b")
    public List<Profesor> pertenece = new ArrayList<Profesor> ();

    @objid ("a8ece276-433a-4fb1-a572-859f7c32e6ff")
    private CPIFP cpifp;

    @objid ("1c55dc62-a66a-492e-bf19-22e7da8a0986")
    public void añadirProfesor(Profesor profesor) {
        this.pertenece.add(profesor);
    }

    @objid ("e60acf92-3aa8-469a-9c44-57685558aff9")
    public void quitarProfesores() {
    }

    @objid ("79dc6679-8c0f-4a2d-bd79-22cbe2ce2213")
    public void obtenerProfesores() {
    }

    @objid ("33bde152-d79b-4433-8b58-ad6910003be0")
    public void listarProfesores() {
    }

    @objid ("dc8eb296-4f74-4cef-97b2-1e4adf217c40")
    public String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombre;
    }

    @objid ("461bae00-5fbc-494c-9c71-56eec18a2999")
    public void setNombre(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombre = value;
    }

    @objid ("d1a471d7-6707-47da-b52d-3bfedf8d40e5")
    public Profesor getJefeDepartamento() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.jefeDepartamento;
    }

    @objid ("501b8000-350b-49ee-bcfa-208b6f6759b9")
    public void setJefeDepartamento(final Profesor value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.jefeDepartamento = value;
    }

    @objid ("1e37e9a4-7049-4b13-9c6e-cca28f6e59ec")
    public CPIFP getCpifp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.cpifp;
    }

    @objid ("8fcbce83-4752-4582-88a0-c467dedc9378")
    public void setCpifp(final CPIFP value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.cpifp = value;
    }

    @objid ("163413e3-98e5-46d1-b0d8-e82aeaec522e")
    public Departamento(final String nombre, final Profesor jefeDepartamento) {
        this.nombre = nombre;
        this.jefeDepartamento = jefeDepartamento;
    }

}
