import java.util.ArrayList;

public class _21010310033_Minterm extends  _21010310033_DosyaOkuma{

	public static void minterm(String[] degiskenler) {
    	
   	 ArrayList<Integer> minterm = new ArrayList<>();
   	 System.out.print("F = ");
   	 for(int i=0 ;i<Tablo.length;i++) {
          if(Tablo[i][4]==1){
   			 if(Tablo[i][0]==0 && Tablo[i][1]==0 && Tablo[i][2]==0 && Tablo[i][3]==0) {
   				 System.out.print(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4]+"'"+" + ");	
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==0 && Tablo[i][1]==0 && Tablo[i][2]==0 && Tablo[i][3]==1) {
   				 System.out.print(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4]+" + ");
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==0 && Tablo[i][1]==0 && Tablo[i][2]==1 && Tablo[i][3]==0) {
   				 System.out.print(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+degiskenler[4]+"'"+" + ");	
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==0 && Tablo[i][1]==0 && Tablo[i][2]==1 && Tablo[i][3]==1) {
   				 System.out.print(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+degiskenler[4]+" + ");
   				 minterm.add(i);
   			 }
   			
   			 else if(Tablo[i][0]==0 && Tablo[i][1]==1 && Tablo[i][2]==0 && Tablo[i][3]==0) {
   				 System.out.print(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+"'"+degiskenler[4]+"'"+" + ");
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==0 && Tablo[i][1]==1 && Tablo[i][2]==0 && Tablo[i][3]==1) {
   				 System.out.print(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+"'"+degiskenler[4]+" + ");
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==0 && Tablo[i][1]==1 && Tablo[i][2]==1 && Tablo[i][3]==0) {
   				 System.out.print(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+degiskenler[4]+"'"+" + ");
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==0 && Tablo[i][1]==1 && Tablo[i][2]==1 && Tablo[i][3]==1) {
   				 System.out.print(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+degiskenler[4]+" + ");
   				 minterm.add(i);
   			 }
   			
   			 else if(Tablo[i][0]==1 && Tablo[i][1]==0 && Tablo[i][2]==0 && Tablo[i][3]==0) {
   				 System.out.print(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4]+"'"+" + ");	
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==1 && Tablo[i][1]==0 && Tablo[i][2]==0 && Tablo[i][3]==1) {
   				 System.out.print(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4]+" + ");
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==1 && Tablo[i][1]==0 && Tablo[i][2]==1 && Tablo[i][3]==0) {
   				 System.out.print(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+degiskenler[4]+"'"+" + ");
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==1 && Tablo[i][1]==0 && Tablo[i][2]==1 && Tablo[i][3]==1) {
   				 System.out.print(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+degiskenler[4]+" + ");
   				 minterm.add(i);	 
   			 }
   			 
   			 else if(Tablo[i][0]==1 && Tablo[i][1]==1 && Tablo[i][2]==0 && Tablo[i][3]==0) {
   				 System.out.print(degiskenler[1]+degiskenler[2]+degiskenler[3]+"'"+degiskenler[4]+"'"+" + ");	
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==1 && Tablo[i][1]==1 && Tablo[i][2]==0 && Tablo[i][3]==1) {
   				 System.out.print(degiskenler[1]+degiskenler[2]+degiskenler[3]+"'"+degiskenler[4]+" + ");
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==1 && Tablo[i][1]==1 && Tablo[i][2]==1 && Tablo[i][3]==0) {
   				 System.out.print(degiskenler[1]+degiskenler[2]+degiskenler[3]+degiskenler[4]+"'"+" + ");
   				 minterm.add(i);
   			 }
   			 else if(Tablo[i][0]==1 && Tablo[i][1]==1 && Tablo[i][2]==1 && Tablo[i][3]==1) {
   				 System.out.print(degiskenler[1]+degiskenler[2]+degiskenler[3]+degiskenler[4]+" + ");
   				 minterm.add(i);
   			 }
   		 }
   	 }
   	 System.out.println();
   	 System.out.print("F = "+"\u2211"+"(");
   	 for (int i = 0; i < minterm.size(); i++) {
            System.out.print(minterm.get(i) + ",");
        }
   	 System.out.println(")");
   	 
    }
}
