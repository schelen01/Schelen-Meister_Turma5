package test;
import RedeHotel.main.dao.config.ConfiguracaoJDBC;

import main.dao.impl.FilialDaoImpl;
import main.model.Filial;
import main.service.FilialService;
import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FilialServiceTest {
    
    //lembre-se é: private final...
    private final FilialService filialService = new FilialService(new FilialDaoImpl(new ConfiguracaoJDBC()));

    //teste
    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void salvarFilialTest() {
        Filial filial, Ibis;

        filial = new Filial("Ibis- Florais do Sul", "Rua 5", "51", "Santa Catarina", "SC", true);
        Ibis = filialService.salvar(filial);

        filial = new Filial("Ibis- PREMIUM ", "Rua Gustavo Friedrich", "2114", "São Paulo", "SP", true);
        Ibis = filialService.salvar(filial);

        filial = new Filial("Ibis- Stand Confort", "Rua 8 norte", "1421", "Distrito Federal", "DF", false);
        Ibis = filialService.salvar(filial);

        filial = new Filial("Ibis - Conforto Nacional", "Avenida Marechal Floriano", "996",  "Santa Catarina", "SC", false);
        Ibis = filialService.salvar(filial);

        filial = new Filial("Ibis - Amor Eterno, Amor", "Alameda Fonseca", "1552",  "São Paulo", "SP", false);
        Ibis = filialService.salvar(filial);

        assertNotNull(filial.getId());
    }

    @Test
    public void listarFiliaisTest() {
        List<Filial> filiais = filialService.listar();
        assertEquals(5, filiais.size());
    }
}