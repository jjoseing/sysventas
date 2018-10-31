/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.syscenterlife.servicio.global;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.syscenterlife.dao.global.ConfiguracionDaoI;
import pe.com.syscenterlife.dao.global.PersonaDaoI;

import pe.com.syscenterlife.modelo.GloPersonas;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Service
@Transactional
public class PersonaServicioImpl implements PersonaServicioI{
 
    @Autowired
    public PersonaDaoI daoI;
    
    @Override
    public List<GloPersonas> listarEntidad(){ return daoI.listarEntidad();}
    @Override
    public List<GloPersonas> listarEntidadDato(String dato){ return daoI.listarEntidadDato(dato);}
    @Override
    public GloPersonas buscarEntidadId(int id){return daoI.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(GloPersonas persona){daoI.guardarEntidad(persona);}
    @Override
    public void eliminarEntidad(int id){daoI.eliminarEntidad(id);}
    @Override
    public void modificarEntidad(GloPersonas persona){daoI.modificarEntidad(persona);}
}
