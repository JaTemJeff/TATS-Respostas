import org.junit.Before;
import org.junit.Test;
import codigo.Funcionario;
import codigo.ControladorCargo;

public class TesteSemTDD {
    Funcionario f;
    ControladorCargo calculadora;
    
    @Before
    public void inicializa(){
        f = new Funcionario();
        calculadora = new ControladorCargo();
    }
    
    @Test
    public void teste01(){
        f.setCargo("DBA");
        f.setEmail("dba@email.com");
        f.setNome("Nome DBA");
        f.setSalarioBase(1000);
        
        calculadora.calcular(f.getCargo(), f.getSalarioBase());
    }
}
