package LabIngSw.ProvaLab_04_11;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        int[] list=new int[]{2,3,7,1,8,10,6,4,9,5};
        
        for(int i=0; i<10; i++) 
        {
        	System.out.print(list[i]+ " ");
        }
    	System.out.println();
        
        MyListUtil M= new MyListUtil();
        M.Ordina(list, 10, true);
        
        for(int i=0; i<10; i++) 
        {
        	System.out.print(list[i]+ " ");
        }
    	System.out.println();
    	
    	M.Ordina(list, 10, false);
        
        for(int i=0; i<10; i++) 
        {
        	System.out.print(list[i]+ " ");
        }
    	System.out.println();
    }
}
