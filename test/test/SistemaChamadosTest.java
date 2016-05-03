/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Persistencia.ChamadoDAO;
import entidade.BancoDeDados;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Pessoa;
import entidade.RegistroChamado;
import entidade.SistemaOperacional;
import entidade.Status;
import entidade.Tecnico;
import entidade.TipoConexao;
import entidade.TipoProblema;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31181805
 */
public class SistemaChamadosTest {
    
    private ChamadoDAO chamadoDAO;
    private Chamado chamado;
    private Tecnico tecnicoA;
    private ClienteEmpresa clienteEmpresa;
    private Empresa empresaA;
    private Empresa empresaB;
    private SistemaOperacional so;
    private TipoConexao tc;
    private TipoProblema tp;
    private Status status;
    private Pessoa pessoaA;
    private BancoDeDados bd;
    private RegistroChamado registroChamado;
    
    public SistemaChamadosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Before
    public void criandoChamado()
    {
        chamadoDAO = new ChamadoDAO();
        tecnicoA = new Tecnico("Marciano", 42424242);
        empresaA = new Empresa(1000, "NumPy");
        
        
        
        clienteEmpresa = new ClienteEmpresa(1, empresaA, 346000000, "NumPy", 45454545);
        chamado = new Chamado(1, "notebook.py", "Arquivo notebook.py nao encontrado", 1, tecnicoA,  clienteEmpresa, so.LINUX.toString(), "15.04", tc.ADSL.toString(), "152.456.1.1");
        registroChamado = new RegistroChamado("Notebook.py", chamado, tecnicoA);
        //chamadoDAO.put(chamado);
        
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testarGerarCodigo()
    {
        assertEquals(chamadoDAO.gerarCodigo(),1);     
    }
    
    @Test
    public void testarGerarCodigoRegistroChamado()
    {
        assertEquals(chamadoDAO.gerarCodigoRegistroChamado(),1);     
    }
    
    @Test
    public void testarGetAssunto()
    {
        assertEquals(registroChamado.getAssunto(),"Notebook.py");  
    }
    
    @Test
    public void testarGetChamado()
    {
        assertSame(registroChamado.getChamado(), chamado);
    }
    
    @Test
    public void testarGetTecnico()
    {
        assertEquals(registroChamado.getTecnico().toString(), "Marciano");
    }
}
