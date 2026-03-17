import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("20c2a36d-3ef6-4793-bed5-f230ba483720")
public class CPIFP {
    @objid ("a3ceb326-5862-4b7f-bf18-4260d90aa697")
    private String nombre;

    @objid ("3012d36a-a6cf-4cdb-b4b1-bb4240bb32c2")
    private String direccion;

    @objid ("aabe1b92-ee27-4e9e-8375-a09d282759c6")
    private String tlf;

    @objid ("fb8a90c4-7a57-4a5a-8157-2854c6aec423")
    private List<Departamento> listaDepartamentos = new ArrayList<Departamento> ();

    @objid ("9d2344aa-9773-4f2a-b0e3-13ef9190bc37")
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante> ();

    @objid ("18ae4841-f882-455f-b21f-f86482932341")
    public void añadirEstudiante(Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
    }

    @objid ("0fc3c3e4-885d-42d2-8fec-1bebccb996de")
    public void quitarEstudiante(final Estudiante Quitar) {
    }

    @objid ("ef52558a-aeda-4341-ac87-e44d30dd17c8")
    public void obtenerEstudiante(final Estudiante Obtener) {
    }

    @objid ("4131d13d-4826-4009-9777-dd962c398a7a")
    public void añadirDepartamento(Departamento departamento) {
        this.listaDepartamentos.add(departamento);
    }

    @objid ("86a4445d-cd9b-433a-ba19-ec1d47628872")
    public void quitarDepartamento(final Departamento Quitar) {
    }

    @objid ("d9626d91-4a79-4afc-b643-061fedb8337d")
    public void obtenerDepartamento(final Departamento Obtener) {
    }

    @objid ("97f73348-74c5-491b-a876-27f7bd827fbc")
    public List<Estudiante> listarEstudiantes() {
        // TODO Auto-generated return
        return null;
    }

    @objid ("f847f3c4-3665-4f5a-8feb-ec7da9852009")
    public List<Departamento> listarDepartamentos() {
        // TODO Auto-generated return
        return listaDepartamentos;
    }

    @objid ("7b520ec3-ae32-444e-9d7a-2cd6f09c0e7b")
    public void setNombre(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombre = value;
    }

    @objid ("70b3892a-e8c6-428c-8cd9-120e64e2f35c")
    public String getNombre() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombre;
    }

    @objid ("45f68b55-1232-4709-96cc-5067785a3794")
    public String getDireccion() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.direccion;
    }

    @objid ("b4ffd526-8e5d-4eeb-8f19-1b6bf3b83c5e")
    public void setDireccion(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.direccion = value;
    }

    @objid ("6ca71eb1-6613-41ed-804c-f646a00f4282")
    public String getTlf() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tlf;
    }

    @objid ("7c0b59c0-6041-49d8-a925-0c22a3ea8487")
    public void setTlf(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tlf = value;
    }

    @objid ("96d453a0-24be-4dde-9afd-972d2af863b6")
    public CPIFP(final String nombre, final String direccion, final String tlf) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tlf = direccion;
    }

}
