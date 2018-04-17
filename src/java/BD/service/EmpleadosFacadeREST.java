/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD.service;

import BD.Empleados;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("bd.empleados")
public class EmpleadosFacadeREST extends AbstractFacade<Empleados> {

    @PersistenceContext(unitName = "TrabajoDeCursoWS1PU")
    private EntityManager em;

    public EmpleadosFacadeREST() {
        super(Empleados.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Empleados entity) {
        super.create(entity);
    }
    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Empleados> findAll() {
        return super.findAll();
    }
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }    

    @GET
    @Path("BuscarPorID")
    @Produces(MediaType.APPLICATION_XML)
    public Empleados buscarPorIdXML(@QueryParam("id") int ID){
        return super.find(ID);
    } 
    @GET
    @Path("BuscarPorID")
    @Produces(MediaType.APPLICATION_JSON)
    public Empleados buscarPorID(@QueryParam("id") int ID){
        return super.find(ID);
    }     
    @GET
    @Path("MostrarTodos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Empleados> MostrarTodosLosEmpleados(){
        return super.findAll();
    }
    
    
}
