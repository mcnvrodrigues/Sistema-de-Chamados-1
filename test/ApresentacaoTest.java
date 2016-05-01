/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class ApresentacaoTest {
    
    public ApresentacaoTest() {
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
        ChamadoDAO ch1 = new ChamadoDAO();
        
        assertEquals(ch1.gerarCodigo(),1);
        
        ChamadoDAO ch2 = new ChamadoDAO();
        
        assertEquals(ch2.gerarCodigo(),1);        
        
}
    
}
