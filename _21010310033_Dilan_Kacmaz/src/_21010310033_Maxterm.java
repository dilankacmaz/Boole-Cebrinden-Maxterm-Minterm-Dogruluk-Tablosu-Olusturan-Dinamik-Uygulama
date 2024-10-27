import java.util.ArrayList;

public class _21010310033_Maxterm extends _21010310033_DosyaOkuma {
	 public static void maxterm(String[] degiskenler) {
    	 
    	 ArrayList<Integer> maxterm = new ArrayList<>();
    	 System.out.print("F = ");
    	 for(int i=0 ;i<Tablo.length;i++) {
             if(Tablo[i][4]==0){
            	 if(Tablo[i][0]==0 && Tablo[i][1]==0 && Tablo[i][2]==0 && Tablo[i][3]==0) {
    				 System.out.print("( "+ degiskenler[1]+"+"+degiskenler[2]+"+"+degiskenler[3]+"+"+degiskenler[4]+" ). ");	
    				maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==0 && Tablo[i][1]==0 && Tablo[i][2]==0 && Tablo[i][3]==1) {
    				 System.out.print("( "+degiskenler[1]+"+"+degiskenler[2]+"+"+degiskenler[3]+"+"+degiskenler[4]+"'"+" ). ");
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==0 && Tablo[i][1]==0 && Tablo[i][2]==1 && Tablo[i][3]==0) {
    				 System.out.print("( "+degiskenler[1]+"+"+degiskenler[2]+"+"+degiskenler[3]+"'"+"+"+degiskenler[4]+" ). ");	
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==0 && Tablo[i][1]==0 && Tablo[i][2]==1 && Tablo[i][3]==1) {
    				 System.out.print("( "+degiskenler[1]+"+"+degiskenler[2]+"+"+degiskenler[3]+"'"+"+"+degiskenler[4]+"'"+" ). ");
    				 maxterm.add(i);
    			 }
    			
    			 else if(Tablo[i][0]==0 && Tablo[i][1]==1 && Tablo[i][2]==0 && Tablo[i][3]==0) {
    				 System.out.print("( "+degiskenler[1]+"+"+degiskenler[2]+"'"+"+"+degiskenler[3]+"+"+degiskenler[4]+" ). ");
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==0 && Tablo[i][1]==1 && Tablo[i][2]==0 && Tablo[i][3]==1) {
    				 System.out.print("( "+degiskenler[1]+"+"+degiskenler[2]+"'"+"+"+degiskenler[3]+"+"+degiskenler[4]+"'"+" ). ");
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==0 && Tablo[i][1]==1 && Tablo[i][2]==1 && Tablo[i][3]==0) {
    				 System.out.print("( "+degiskenler[1]+"+"+degiskenler[2]+"'"+"+"+degiskenler[3]+"'"+"+"+degiskenler[4]+" ). ");
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==0 && Tablo[i][1]==1 && Tablo[i][2]==1 && Tablo[i][3]==1) {
    				 System.out.print("( "+degiskenler[1]+"+"+degiskenler[2]+"'"+"+"+degiskenler[3]+"'"+"+"+degiskenler[4]+"'"+" ). ");
    				 maxterm.add(i);
    			 }
    			
    			 else if(Tablo[i][0]==1 && Tablo[i][1]==0 && Tablo[i][2]==0 && Tablo[i][3]==0) {
    				 System.out.print("( "+degiskenler[1]+"'"+"+"+degiskenler[2]+"+"+degiskenler[3]+"+"+degiskenler[4]+" ). ");	
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==1 && Tablo[i][1]==0 && Tablo[i][2]==0 && Tablo[i][3]==1) {
    				 System.out.print("( "+degiskenler[1]+"'"+"+"+degiskenler[2]+"+"+degiskenler[3]+"+"+degiskenler[4]+"'"+" ). ");
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==1 && Tablo[i][1]==0 && Tablo[i][2]==1 && Tablo[i][3]==0) {
    				 System.out.print("( "+degiskenler[1]+"'"+"+"+degiskenler[2]+"+"+degiskenler[3]+"'"+"+"+degiskenler[4]+" ). ");
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==1 && Tablo[i][1]==0 && Tablo[i][2]==1 && Tablo[i][3]==1) {
    				 System.out.print("( "+degiskenler[1]+"'"+"+"+degiskenler[2]+"+"+degiskenler[3]+"'"+"+"+degiskenler[4]+"'"+" ). ");
    				 maxterm.add(i);
    			 }
    			 
    			 else if(Tablo[i][0]==1 && Tablo[i][1]==1 && Tablo[i][2]==0 && Tablo[i][3]==0) {
    				 System.out.print("( "+degiskenler[1]+"'"+"+"+degiskenler[2]+"'"+"+"+degiskenler[3]+"+"+degiskenler[4]+" ). ");	
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==1 && Tablo[i][1]==1 && Tablo[i][2]==0 && Tablo[i][3]==1) {
    				 System.out.print("( "+degiskenler[1]+"'"+"+"+degiskenler[2]+"'"+"+"+degiskenler[3]+"+"+degiskenler[4]+"'"+" ). ");
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==1 && Tablo[i][1]==1 && Tablo[i][2]==1 && Tablo[i][3]==0) {
    				 System.out.print("( "+degiskenler[1]+"'"+"+"+degiskenler[2]+"'"+"+"+degiskenler[3]+"'"+"+"+degiskenler[4]+" ). ");
    				 maxterm.add(i);
    			 }
    			 else if(Tablo[i][0]==1 && Tablo[i][1]==1 && Tablo[i][2]==1 && Tablo[i][3]==1) {
    				 System.out.print("( "+degiskenler[1]+"'"+"+"+degiskenler[2]+"'"+"+"+degiskenler[3]+"'"+"+"+degiskenler[4]+"'"+" ). ");
    				 maxterm.add(i);
    			 }
             }
     }

    	 System.out.println();
    	 System.out.print("F = "+"\u220F"+"(");
    	 for (int i = 0; i < maxterm.size(); i++) {
             System.out.print(maxterm.get(i) + ",");
         }
    	 System.out.print(")");




     }
}
