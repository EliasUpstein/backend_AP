package com.portfolio.EliasUpstein.Service;

import com.portfolio.EliasUpstein.Entity.Proyecto;
import com.portfolio.EliasUpstein.Repository.RProyectos;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
    @Autowired
    RProyectos rProyectos;
    
    public List<Proyecto> list(){
        return rProyectos.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return rProyectos.findById(id);
    }
    
    public Optional<Proyecto> getByNombreP(String nombreP){
        return rProyectos.findByNombreP(nombreP);
    }
    
    public void save(Proyecto proyecto){
        rProyectos.save(proyecto);
    }
    
    public void delete(int id){
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyectos.existsById(id);
    }
    
    public boolean existsByNombreP(String nombreP){
        return rProyectos.existsByNombreP(nombreP);
    }
}
