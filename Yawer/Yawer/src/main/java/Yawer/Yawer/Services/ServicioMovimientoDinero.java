package Yawer.Yawer.Services;

import Yawer.Yawer.Domains.MovimientoDinero;
import Yawer.Yawer.Repositories.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServicioMovimientoDinero {

    @Autowired
    MovimientoDineroRepository movimientoDineroRepository;
    private MovimientoDinero movimientoDinero;


    public List<MovimientoDinero> consultarMovientoDinero() {
        List<MovimientoDinero> movimientoDineros = new ArrayList<MovimientoDinero>();
        movimientoDineros.addAll(movimientoDineroRepository.findAll());

        return movimientoDineros;
    }


    public void HacerMovimientoDinero(MovimientoDinero movimientoDinero) {
            movimientoDineroRepository.save(movimientoDinero);

    }

    public MovimientoDinero buscarMovimientoDinero (long id){

        MovimientoDinero movimientoDinero = null;

        for (MovimientoDinero p :consultarMovientoDinero() ) {
            if (p.getId() == id){
                return p;
            }
        }

        return movimientoDinero;
    }




    public void editarMovimientoDinero (MovimientoDinero movimientoDinero) {
        movimientoDineroRepository.save(movimientoDinero);
    }



    public void eliminarrMovientoDinero (Long id){
        movimientoDineroRepository.deleteById(id);
    }


}



