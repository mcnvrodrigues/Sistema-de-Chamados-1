/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Persistencia.ChamadoDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marciano
 */
public class SistemaChamadosTest {
    
    private ChamadoDAO chamado;
    
    public SistemaChamadosTest() {
    }
    
    @Before
    public void criandoChamado()
    {
        chamado = new ChamadoDAO();
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
    
    @Test
    public void testarGerarCodigo()
    {
        assertEquals(chamado.gerarCodigo(),1);     
    }
    
    @Test
    public void testarGerarCodigoRegistroChamado()
    {
        assertEquals(chamado.gerarCodigoRegistroChamado(),1);     
    }
}
