import codigo.ControladorCargo;
import codigo.Funcionario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TDD {
    Funcionario f;
    ControladorCargo calculadora;
    
    @Before
    public void inicializa(){
        f = new Funcionario();
        calculadora = new ControladorCargo();
    }
    
    @Test
    public void desenvolvedorComSalarioMaiorQue3Mil() throws Exception{
        f.setCargo("DESENVOLVEDOR");
        f.setEmail("dev@email.com");
        f.setNome("Nome dev");
        f.setSalarioBase(5000f);
        
        float res = calculadora.calcular(f.getCargo(), f.getSalarioBase());
        
        Assert.assertEquals(4000f, res, 0);
    }
    
    @Test 
    public void desenvolvedorComSalarioMenorQue3Mil() throws Exception{
        f.setCargo("DESENVOLVEDOR");
        f.setEmail("dev@email.com");
        f.setNome("Nome dev");
        f.setSalarioBase(1000f);
        
        float res = calculadora.calcular(f.getCargo(), f.getSalarioBase());
        
        Assert.assertEquals(900f, res, 0);
    }
    
    @Test
    public void desenvolvedorComSalarioZero(){
        f.setCargo("DESENVOLVEDOR");
        f.setEmail("dev@email.com");
        f.setNome("Nome dev");
        f.setSalarioBase(0);
        
        try {
            float res = calculadora.calcular(f.getCargo(), f.getSalarioBase());
        } catch (Exception ex) {
            Assert.assertEquals("Informe um salário maior que 0!",  ex.getMessage());
        }
    }
    
    
    @Test
    public void cargoInexistente(){
        f.setCargo(" ");
        f.setEmail("dev@email.com");
        f.setNome("Nome");
        f.setSalarioBase(0);
        
        try {
            float res = calculadora.calcular(f.getCargo(), f.getSalarioBase());
        } catch (Exception ex) {
            Assert.assertEquals("Informe um cargo válido!",  ex.getMessage());
        }
    }
    
}
