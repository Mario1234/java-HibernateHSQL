import org.hibernate.Session;

public class Principal {

	public static void main(String[] args) {		
		try {
			InstanciadorHibernate instanciaHibernate = new InstanciadorHibernate();
		
			//instanciaHibernate.executeSQLCommand("create table survey (id int,name varchar);");
	
		    Session session = instanciaHibernate.getSession();
	
		    Usuario usuarioHiber = new Usuario();
		    usuarioHiber.setNombre("Alfred");
		    usuarioHiber.setApellido("Hitch");
		    System.out.println(usuarioHiber.getId());
		    
		    session.save(usuarioHiber);
		    session.flush();
		    
		    System.out.println(usuarioHiber.getId());
		    Usuario usuarioHiberSesion= (Usuario) session.get(Usuario.class, usuarioHiber.getId());
		    System.out.println(usuarioHiberSesion.getNombre());
	
		    session.close();
		    instanciaHibernate.checkData("SELECT * FROM USUARIO");
		} catch (Exception e) {
			System.out.println("erorrrrrr");
			e.printStackTrace(System.out);
		}
	}

}
