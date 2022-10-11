package backendclase22b.service;

import backendclase22b.dao.EntrenadorDAOH2;
import backendclase22b.dao.IDao;
import backendclase22b.dominio.Entrenador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorServiceImpl implements IEntrenadorService{

    private IDao<Entrenador> entrenadorIDao;

    public EntrenadorServiceImpl() {
        entrenadorIDao = new EntrenadorDAOH2();
    }

    @Override
    public List<Entrenador> listarEntrenadores() {
        return entrenadorIDao.listarTodos();
    }
}
