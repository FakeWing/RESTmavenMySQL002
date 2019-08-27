/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.restspring.controllers;

import cl.duoc.restspring.models.TallerEntity;
import cl.duoc.restspring.models.TallerRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTTallerController {
    
    @Autowired
    TallerRepository repository;
    
    @GetMapping("/")
    public String main(){
        return "Talleres";
    }
    @GetMapping("/talleres")
    public List<TallerEntity> listar(){
        return repository.findAll();
    }
    
    @GetMapping("/talleres/{id}")
    public TallerEntity getTaller(@PathVariable Integer id){
        
        return repository.findById(id).orElse(new TallerEntity());
    }
    
    @PutMapping("/talleres/{id}")
    public TallerEntity putTaller(@RequestBody Map<String,String> dato, @PathVariable Integer id){
        TallerEntity obj= new TallerEntity();
        //obj.setIdcliente(Integer.parseInt(dato.get("idcliente")));
        obj.setNombre(dato.get("nombre"));
        obj.setDetalle(dato.get("detalle"));
        obj.setNumhoras(Integer.parseInt(dato.get("numhoras")));
        obj.setCupos(Integer.parseInt(dato.get("cupos")));
        
        return repository.save(obj);
        
    }
    
    @PostMapping("/talleres")
    public TallerEntity postTaller(@RequestBody Map<String,String> dato){
        TallerEntity obj= new TallerEntity();
        //obj.setIdcliente(Integer.parseInt(dato.get("idcliente")));
        obj.setNombre(dato.get("nombre"));
        obj.setDetalle(dato.get("detalle"));
        obj.setNumhoras(Integer.parseInt(dato.get("numhoras")));
        obj.setCupos(Integer.parseInt(dato.get("cupos")));
        return repository.save(obj);
        
    }
    
    @DeleteMapping("/talleres/{id}")
    public boolean deleteTaller(@PathVariable Integer id){
        repository.deleteById(id);
        return !repository.existsById(id);
    }
    
    
}
