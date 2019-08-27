/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.restspring.controllers;

import cl.duoc.restspring.models.MatriculaEntity;
import cl.duoc.restspring.models.MatriculaRepository;
import cl.duoc.restspring.models.MatriculaEntity;
import cl.duoc.restspring.models.MatriculaRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins="*", methods={RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE,RequestMethod.PUT})
public class RESTMatriculaController {

    @Autowired
    MatriculaRepository repository;

    @GetMapping("/matriculas")
    public List<MatriculaEntity> listar() {
        return repository.findAll();
    }

    @GetMapping("/matriculas/{id}")
    public MatriculaEntity getMatricula(@PathVariable Integer id) {

        return repository.findById(id).orElse(new MatriculaEntity());
    }

    @PutMapping("/matriculas/{id}")
    public MatriculaEntity putMatricula(@RequestBody Map<String, String> dato, @PathVariable Integer id) {
        MatriculaEntity obj = new MatriculaEntity();
        obj.setNummat(id);
        obj.setRut(dato.get("rut"));
        obj.setDv(dato.get("dv"));
        obj.setPaterno(dato.get("paterno"));
        obj.setMaterno(dato.get("materno"));
        obj.setNombre(dato.get("nombre"));
        obj.setEmail(dato.get("email"));
        obj.setNumtaller(Integer.parseInt(dato.get("numtaller")));

        return repository.save(obj);

    }

    @PostMapping("/matriculas")
    public MatriculaEntity postMatricula(@RequestBody Map<String, String> dato) {
        MatriculaEntity obj = new MatriculaEntity();
        //obj.setIdcliente(Integer.parseInt(dato.get("idcliente")));
        obj.setRut(dato.get("rut"));
        obj.setDv(dato.get("dv"));
        obj.setPaterno(dato.get("paterno"));
        obj.setMaterno(dato.get("materno"));
        obj.setNombre(dato.get("nombre"));
        obj.setEmail(dato.get("email"));
        obj.setNumtaller(Integer.parseInt(dato.get("numtaller")));
        return repository.save(obj);

    }

    @DeleteMapping("/matriculas/{id}")
    public boolean deleteMatricula(@PathVariable Integer id) {
        repository.deleteById(id);
        return !repository.existsById(id);
    }

}
