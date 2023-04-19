package com.example.gtics_proyecto_grupo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/Paciente")
public class controllerPaciente {

    @RequestMapping(value={"","/"},method = RequestMethod.GET)
    public String vistBase(){
        return "paciente/PacienteInicio";
    }

    @RequestMapping(value={"/altern"},method = RequestMethod.GET)
    public String vistaAlterna(){

        return "paciente/Paciente";
    }

    @RequestMapping(value={"/Cuestionario"},method = RequestMethod.GET)
    public String vistaPacienteCuestionarios(){

        return "paciente/PacienteCuestionario";
    }

    @RequestMapping(value={"/Citas"},method = RequestMethod.GET)
    public String vistaCitas(){

        return "paciente/PacienteCitas";
    }

    @RequestMapping(value={"/Agendar"},method = RequestMethod.GET)
    public String vistaAgendarCitas(){

        return "paciente/PacienteAgendarCita";
    }

    @RequestMapping(value={"/Perfil"},method = RequestMethod.GET)
    public String vistaPerfil(){

        return "paciente/PacientePerfil";
    }

    @RequestMapping(value={"/HistorialCitas"},method = RequestMethod.GET)
    public String vistaHistorialCitas(){

        return "paciente/PacienteHistorialCitas";
    }
}
