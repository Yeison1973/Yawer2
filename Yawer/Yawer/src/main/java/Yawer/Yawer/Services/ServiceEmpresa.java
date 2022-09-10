package Yawer.Yawer.Services;

import Yawer.Yawer.Domains.Empresa;
import Yawer.Yawer.Repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ServiceEmpresa {


    @Autowired
    EmpresaRepository empresaRepository;


    public List <Empresa> consultarListaEmpresa(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas.addAll(empresaRepository.findAll());

        return empresas;

    }

    public void crearEmpresa (Empresa empresa) {
        empresaRepository.save(empresa);
    }


    public Empresa buscarEmpresa (int id){

        Empresa empresa = null;

        for (Empresa p :consultarListaEmpresa() ) {
            if (p.getId() == id){
                return p;
            }
        }

        return empresa;
    }


    public void editarEmpresa (Empresa empresa) {
        empresaRepository.save(empresa);
    }


    public void eliminarrEmpresa (Long id){
    empresaRepository.deleteById(id);
    }


}