package LabIngSw.ProvaLab_04_11;

import static org.junit.Assert.assertArrayEquals;

import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//	@Before
	
    @Test
    public void OrdinaWorks()
    {
    	DateTime date= new DateTime();
    	
    	System.out.println("Inizio test:" +date);
    	int[] lista= new int[]{10,2,6,1,7,3,8,4,9,5};
    	int[] lista2= new int[]{100,20,60,10,70,30,80,40,90,50};
    	
    	int[] listaord= new int[]{1,2,3,4,5,6,7,8,9,10};
    	int[] lista2ord= new int[]{100,90,80,70,60,50,40,30,20,10};
    		
    	MyListUtil M = new MyListUtil();
    	M.Ordina(lista, 10, true);
    	M.Ordina(lista2, 10, false);
    	
    	assertArrayEquals(lista, listaord);
    	assertArrayEquals(lista2, lista2ord);

    	System.out.println("Fine test:" + date);
    }
}
