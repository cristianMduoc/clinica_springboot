package com.duoc.backendClinica.Paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/Paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/register")
    public String greetings(@RequestParam(value="name", defaultValue="World") String nombre) {
        return "Hello {" + nombre + "}";
    }

    @GetMapping
    public List<Paciente> getAllPacientes() {
        return (List<Paciente>) pacienteService.getAllPacientes();
    }

    @GetMapping("/{id}")
    public Paciente getPacienteById(@PathVariable Long id) {
        return pacienteService.getPacienteById(id);
    }

    @PostMapping("/guardar")
    public Paciente savePaciente(@RequestBody Paciente paciente) {
        return pacienteService.savePaciente(paciente);
    }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable Long id) {
        pacienteService.deletePaciente(id);
    }

    @PutMapping("/{id}")
    public Paciente updatePaciente(@PathVariable Long id) {
        return pacienteService.getPacienteById(id);
    }


}
