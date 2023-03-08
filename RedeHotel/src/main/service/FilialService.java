package main.service;

import main.dao.IDao;
import main.model.Filial;

import java.util.List;

public class FilialService {

    private IDao<Filial> filialIDao;


    public FilialService(IDao<Filial> filialIDao) {

        this.filialIDao = filialIDao;
    }


    public Filial salvar(Filial filial) {

        return filialIDao.salvar(filial);
    }

    public List<Filial> listar() {

        return filialIDao.listar();
    }
}
