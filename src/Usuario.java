
public class Usuario {
    private Integer id = new Integer(1234);
    private String nombre;
    private String apellido;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	public void setApellido(String apel) {
		apellido = apel;		
	}
	public String getApellido() {
        return apellido;
    }
}
