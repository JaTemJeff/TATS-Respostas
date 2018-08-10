/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.utfpr.tats.atividade02.SenhaValidator;
import br.com.utfpr.tats.atividade02.Usuario;
import br.com.utfpr.tats.atividade02.UsuarioDAO;
import br.com.utfpr.tats.atividade02.UsuarioValidator;
import static javafx.scene.input.KeyCode.T;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 *
 * @author Jeff
 */
public class atividade02Test {
    Usuario usuario;
    UsuarioDAO dao;
    SenhaValidator senha;
    UsuarioValidator validator;
    
    
    @Mock
    private UsuarioDAO usuarioDAO;
    
    @Mock
    private SenhaValidator senhaValidator; 
    
    @Before
    public void inicializa(){
        usuario = new Usuario();
        dao = null;
        senha = null;
        validator = new UsuarioValidator(dao);
    }
    
    @Test
    public void usuarioValidoTest(){
        //Nome com mais de 5 letras
        usuario.setNome("Jefferson");
        usuario.setSenha("123456");
        usuario.setSenhaConfirmada("123456");
        try {
            validator.ehUsuarioValido(usuario);
        } catch (Exception ex) {
            Assert.assertEquals(null,  ex.getMessage());
        }
    }
    
    @Test
    public void usuarioInvalidoTest(){
        //Nome com menos de 5 letras
        usuario.setNome("Test");
        usuario.setSenha("123456");
        usuario.setSenhaConfirmada("123456");
        try {
            validator.ehUsuarioValido(usuario);
        } catch (Exception ex) {
            Assert.assertEquals("nome do usuario precisa de pelo menos 5 caracteres",  ex.getMessage());
        }
    }
    
    @Test
    public void senhaInvalidaTest(){
        senhaValidator = Mockito.mock(SenhaValidator.class);
     
        try {
            Mockito.when(senhaValidator.verificar(usuario.getSenha())).thenReturn(false);
            senhaValidator.verificar(usuario.getSenha());
        } catch (Exception ex) {
            Assert.assertEquals("senha invalida",  ex.getMessage());
        }
    }
    
    @Test
    public void senhasDiferentesTest(){
        //Senha diferente da senha confirmada
        usuario.setNome("Jefferson");
        usuario.setSenha("123456");
        usuario.setSenhaConfirmada("3213123");
        try {
            validator.ehUsuarioValido(usuario);
        } catch (Exception ex) {
            Assert.assertEquals("senhas diferentes",  ex.getMessage());
        }
    }
    
    @Test
    public void usuarioJaExisteTest(){
        //Usuario já existe
        usuarioDAO = Mockito.mock(UsuarioDAO.class);
        
        try {
            Mockito.when(usuarioDAO.getByName(usuario.getNome())).thenReturn(usuario);
            usuarioDAO.getByName(usuario.getNome());
        } catch (Exception ex) {
            Assert.assertEquals("usuario ja existe",  ex.getMessage());
        }
    }
    
    @Test
    public void usuarioEmBrancoTest(){
        //Usuario nulo
        try {
            validator.ehUsuarioValido(null);
        } catch (Exception ex) {
            Assert.assertEquals(null,  ex.getMessage());
        }
    }
}
