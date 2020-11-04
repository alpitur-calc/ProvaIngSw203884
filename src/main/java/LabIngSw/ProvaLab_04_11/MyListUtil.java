package LabIngSw.ProvaLab_04_11;

public class MyListUtil{
	
	public int[] Ordina(int[] list,int n, boolean type){
		
		if(type) { // ordine 
			for(int j=0; j<n; j++) {
				for(int i=0; i<n; i++)
				{
					if(i!=j && list[j]<=list[i]) 
					{
						int temp= list[j];
						list[j]= list[i];
						list[i]= temp;
					}
				}
			}
		}
		else { //ordine decrescente
			for(int j=0; j<n; j++) {
				for(int i=0; i<n; i++)
				{
					if(i!=j &&  list[j]>=list[i]) 
					{
						int temp= list[j];
						list[j]= list[i];
						list[i]= temp;
					}
				}
			}
		}
		
		return list;
		
	}
	
	
}
