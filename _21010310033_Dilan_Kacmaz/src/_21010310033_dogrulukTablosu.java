
public class _21010310033_dogrulukTablosu extends _21010310033_DosyaOkuma{
	public static void dogrulukTablosu(String[]denklem) {
    	
    	
	    
        
        String metin = "00000\n00010\n00100\n00110\n01000\n01010\n01100\n01110\n10000\n10010\n10100\n10110\n11000\n11010\n11100\n11110";

        
        String[] satirlar = metin.split("\n");

        
        Tablo = new int[satirlar.length][];

        
        for (int i = 0; i < satirlar.length; i++) {
            String satir = satirlar[i];
            Tablo[i] = new int[satir.length()]; 

            
            for (int j = 0; j < satir.length(); j++) {
                char karakter = satir.charAt(j);
                Tablo[i][j] = Character.getNumericValue(karakter);
            }
        }

       System.out.println("doðruluk tablosu: ");
        System.out.println(degiskenler[1]+" "+degiskenler[2]+" "+degiskenler[3]+" "+degiskenler[4]+" "+degiskenler[0]);
       
        
        for(int i=1; i<denklem.length;i++) {
       if(denklem[i].equals(degiskenler[1])) {
    	   for(int j=0;j<Tablo.length;j++ )
    	   if(Tablo[j][0]==1) {
    		   Tablo[j][4]=1;
    	   }
       }
       
        }  
        
        for(int i=1; i<denklem.length;i++) {
               if(denklem[i].equals(degiskenler[2])) {
            	   for(int j=0;j<Tablo.length;j++ )
            	   if(Tablo[j][1]==1) {
            		   Tablo[j][4]=1;
            	   }
               }
    	       
    	        } 
        
        for(int i=1; i<denklem.length;i++) {
            if(denklem[i].equals(degiskenler[3])) {
         	   for(int j=0;j<Tablo.length;j++ )
         	   if(Tablo[j][2]==1) {
         		   Tablo[j][4]=1;
         	   }
            }
 	       
 	        }  
        
        for(int i=1; i<denklem.length;i++) {
            if(denklem[i].equals(degiskenler[4])) {
         	   for(int j=0;j<Tablo.length;j++ )
         	   if(Tablo[j][3]==1) {
         		   Tablo[j][4]=1;
         	   }
            }
 	       
 	        }  
        
      
        
        for(int i=1; i<denklem.length;i++) {
            if(denklem[i].equals(degiskenler[1]+degiskenler[2])) {
         	   for(int j=0;j<Tablo.length;j++ )
         	   if(Tablo[j][0]==1 && Tablo[j][1]==1) {
         		   Tablo[j][4]=1;
         	   }
            }
 	       
 	        }  
        
        for(int i=1; i<denklem.length;i++) {
             if(denklem[i].equals(degiskenler[1]+degiskenler[3])) {
          	   for(int j=0;j<Tablo.length;j++ )
          	   if(Tablo[j][0]==1 && Tablo[j][2]==1) {
          		   Tablo[j][4]=1;
          	   }
             }
  	       
  	        }  
        
        for(int i=1; i<denklem.length;i++) {
              if(denklem[i].equals(degiskenler[1]+degiskenler[4])) {
           	   for(int j=0;j<Tablo.length;j++ )
           	   if(Tablo[j][0]==1 && Tablo[j][3]==1) {
           		   Tablo[j][4]=1;
           	   }
              }
   	       
   	        }  
        
        for(int i=1; i<denklem.length;i++) {
              if(denklem[i].equals(degiskenler[2]+degiskenler[3])) {
           	   for(int j=0;j<Tablo.length;j++ )
           	   if(Tablo[j][1]==1 && Tablo[j][2]==1) {
           		   Tablo[j][4]=1;
           	   }
              }
   	       
   	        }  
        
        for(int i=1; i<denklem.length;i++) {
               if(denklem[i].equals(degiskenler[2]+degiskenler[4])) {
            	   for(int j=0;j<Tablo.length;j++ )
            	   if(Tablo[j][1]==1 && Tablo[j][3]==1) {
            		   Tablo[j][4]=1;
            	   }
               }
    	       
    	        }  
        
        for(int i=1; i<denklem.length;i++) {
               if(denklem[i].equals(degiskenler[3]+degiskenler[4])) {
            	   for(int j=0;j<Tablo.length;j++ )
            	   if(Tablo[j][2]==1 && Tablo[j][3]==1) {
            		   Tablo[j][4]=1;
            	   }
               }
    	       
    	        }  
       
        
     
      
      for(int i=1; i<denklem.length;i++) {
           if(denklem[i].equals(degiskenler[1]+degiskenler[2]+degiskenler[3])) {
        	   for(int j=0;j<Tablo.length;j++ )
        	   if(Tablo[j][0]==1 && Tablo[j][1]==1 && Tablo[j][2]==1) {
        		   Tablo[j][4]=1;
        	   }
           }
	       
	        }  
      
      for(int i=1; i<denklem.length;i++) {
           if(denklem[i].equals(degiskenler[1]+degiskenler[3]+degiskenler[4])) {
        	   for(int j=0;j<Tablo.length;j++ )
        	   if(Tablo[j][0]==1 && Tablo[j][2]==1 && Tablo[j][3]==1) {
        		   Tablo[j][4]=1;
        	   }
           }
	       
	        }  
      
      for(int i=1; i<denklem.length;i++) {
           if(denklem[i].equals(degiskenler[2]+degiskenler[3]+degiskenler[4])) {
        	   for(int j=0;j<Tablo.length;j++ )
        	   if(Tablo[j][1]==1 && Tablo[j][2]==1 && Tablo[j][3]==1) {
        		   Tablo[j][4]=1;
        	   }
           }
	       
	        }  
      for(int i=1; i<denklem.length;i++) {
           if(denklem[i].equals(degiskenler[1]+degiskenler[2]+degiskenler[4])) {
        	   for(int j=0;j<Tablo.length;j++ )
        	   if(Tablo[j][0]==1 && Tablo[j][1]==1 && Tablo[j][3]==1) {
        		   Tablo[j][4]=1;
        	   }
           }
	       
	        }  
     
      
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+"'")) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==0) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }  
      
      for(int i=1; i<denklem.length;i++) {
           if(denklem[i].equals(degiskenler[2]+"'")) {
        	   for(int j=0;j<Tablo.length;j++ )
        	   if(Tablo[j][1]==0) {
        		   Tablo[j][4]=1;
        	   }
           }
	       
	        } 
    
    for(int i=1; i<denklem.length;i++) {
       if(denklem[i].equals(degiskenler[3]+"'")) {
    	   for(int j=0;j<Tablo.length;j++ )
    	   if(Tablo[j][2]==0) {
    		   Tablo[j][4]=1;
    	   }
       }
       
        }  
    
    for(int i=1; i<denklem.length;i++) {
       if(denklem[i].equals(degiskenler[4]+"'")) {
    	   for(int j=0;j<Tablo.length;j++ )
    	   if(Tablo[j][3]==0) {
    		   Tablo[j][4]=1;
    	   }
       }
       
        }  
   
      
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[3])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][2]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][1]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[3]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][2]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[3]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][2]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        } 
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+"'"+degiskenler[3])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==0 && Tablo[j][2]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        } 
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+degiskenler[3]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==1 && Tablo[j][2]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }  
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        } 
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+"'"+degiskenler[3]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==0 && Tablo[j][2]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        } 
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        } 
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[3]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][2]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        } 
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[3]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][2]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[3]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][2]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
  
     
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==1 && Tablo[j][2]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==0 && Tablo[j][2]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==1 && Tablo[j][2]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==0 && Tablo[j][2]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][1]==0 && Tablo[j][2]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[2]+degiskenler[3]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][1]==1 && Tablo[j][2]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][1]==0 && Tablo[j][2]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[3]+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][2]==1 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[3]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][2]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[3]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][2]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[3]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][2]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[3]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][2]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[3]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][2]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[3]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][2]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==1 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][1]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[2]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][1]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==1 && Tablo[j][1]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+"'"+degiskenler[3]+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==0 && Tablo[j][2]==1 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==0 && Tablo[j][2]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+"'"+degiskenler[3]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==0 && Tablo[j][2]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==0 && Tablo[j][2]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+degiskenler[3]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==1 && Tablo[j][2]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+degiskenler[3]+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==1 && Tablo[j][2]==1 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[2]+degiskenler[3]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][1]==1 && Tablo[j][2]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
    
     
     
    
     for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4]+"'")) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==0 && Tablo[j][2]==0 && Tablo[j][3]==0) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
     
      for(int i=1; i<denklem.length;i++) {
         if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4])) {
      	   for(int j=0;j<Tablo.length;j++ )
      	   if(Tablo[j][0]==0 && Tablo[j][1]==0 && Tablo[j][2]==0 && Tablo[j][3]==1) {
      		   Tablo[j][4]=1;
      	   }
         }
	       
	        }
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+degiskenler[4]+"'")) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==0 && Tablo[j][1]==0 && Tablo[j][2]==1 && Tablo[j][3]==0) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+"'"+degiskenler[3]+degiskenler[4])) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==0 && Tablo[j][1]==0 && Tablo[j][2]==1 && Tablo[j][3]==1) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+"'"+degiskenler[4]+"'")) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==0 && Tablo[j][1]==1 && Tablo[j][2]==0 && Tablo[j][3]==0) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
     
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+"'"+degiskenler[4])) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==0 && Tablo[j][1]==1 && Tablo[j][2]==0 && Tablo[j][3]==1) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+degiskenler[4]+"'")) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==0 && Tablo[j][1]==1 && Tablo[j][2]==1 && Tablo[j][3]==0) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+"'"+degiskenler[2]+degiskenler[3]+degiskenler[4])) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==0 && Tablo[j][1]==1 && Tablo[j][2]==1 && Tablo[j][3]==1) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4]+"'")) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==1 && Tablo[j][1]==0 && Tablo[j][2]==0 && Tablo[j][3]==0) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+"'"+degiskenler[4])) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==1 && Tablo[j][1]==0 && Tablo[j][2]==0 && Tablo[j][3]==1) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+degiskenler[4]+"'")) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==1 && Tablo[j][1]==0 && Tablo[j][2]==1 && Tablo[j][3]==0) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+degiskenler[2]+"'"+degiskenler[3]+degiskenler[4])) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==1 && Tablo[j][1]==0 && Tablo[j][2]==1 && Tablo[j][3]==1) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
     
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+degiskenler[2]+degiskenler[3]+"'"+degiskenler[4]+"'")) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==1 && Tablo[j][1]==1 && Tablo[j][2]==0 && Tablo[j][3]==0) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
      
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+degiskenler[2]+degiskenler[3]+"'"+degiskenler[4])) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==1 && Tablo[j][1]==1 && Tablo[j][2]==0 && Tablo[j][3]==1) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
      
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+degiskenler[2]+degiskenler[3]+degiskenler[4]+"'")) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==1 && Tablo[j][1]==1 && Tablo[j][2]==1 && Tablo[j][3]==0) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
      
      for(int i=1; i<denklem.length;i++) {
          if(denklem[i].equals(degiskenler[1]+degiskenler[2]+degiskenler[3]+degiskenler[4])) {
       	   for(int j=0;j<Tablo.length;j++ )
       	   if(Tablo[j][0]==1 && Tablo[j][1]==1 && Tablo[j][2]==1 && Tablo[j][3]==1) {
       		   Tablo[j][4]=1;
       	   }
          }
	       
	        }
      
   
      
      
      
        for (int i = 0; i < Tablo.length; i++) {
            for (int j = 0; j < Tablo[i].length; j++) {
                System.out.print(Tablo[i][j] + " ");
            }
            System.out.println();
        }
        
       
       
        System.out.println("Fonksiyon Ýfadeleri:");
        
    
    }

}
