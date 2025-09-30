package com.adso.aprendiz.Controller;

import com.adso.aprendiz.Service.AprendizService;
import com.adso.aprendiz.entity.AprendizEntity;
import com.adso.aprendiz.repository.AprendizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/aprendiz")
@CrossOrigin("http://localhost:5173/")
public class AprendizController {
    @Autowired
    private AprendizService aprendizService;

    @PostMapping
    public void crearAprendiz(@RequestBody AprendizEntity aprendiz){
        aprendizService.crearAprendiz(aprendiz);
    }

    @GetMapping
    public List<AprendizEntity> obtenerAprendices(){
        return aprendizService.obtenerAprendices();
    }

    @GetMapping("/{id}")
    public AprendizEntity buscarPorId(@PathVariable Long id){
        return aprendizService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarAprendiz(@PathVariable Long id){
        aprendizService.eliminarAprendiz(id);
    }

    @PutMapping("/{id}")
    public AprendizEntity actualizarAprendiz(@PathVariable Long id, @RequestBody AprendizEntity aprendiz){
        return aprendizService.actualizarAprendiz(id, aprendiz);
    }
}
