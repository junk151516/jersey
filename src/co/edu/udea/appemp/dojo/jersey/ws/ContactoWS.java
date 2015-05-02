package co.edu.udea.appemp.dojo.jersey.ws;

import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.udea.appemp.dojo.jersey.pojo.Contacto;
import java.util.List;
//import java

@Path("contacto")
public class ContactoWS {

	private ArrayList<Contacto> misContactos;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/todoscontactos")
	public ArrayList<Contacto> obtenerTodosLosContactos() {
		return misContactos;
	}

	public ContactoWS() {
		super();
		this.misContactos = new ArrayList<Contacto>();
		Contacto nuevoContacto = new Contacto(1, "Jorge", "Cazorla", "5723438",
				"jorge@gmail.com");

		Contacto contacto2 = new Contacto(2, "Pedro", "Perez", "5903033",
				"pedro@gmail.com");
		Contacto contacto3 = new Contacto(3, "Carlos", "Figueroa", "4444445",
				"carlos@gmail.com");

		misContactos.add(nuevoContacto);
		misContactos.add(contacto2);
		misContactos.add(contacto3);

	}
}
