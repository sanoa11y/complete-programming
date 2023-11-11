import java.util.*;
public class Pattern {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to Pattern Progamming...");
    System.out.println("Enter a number...");
    int n=sc.nextInt();
/*No:1  *
        * 
        * 
        * 
        * 

  for(int i=1;i<=n;i++) {                   //n=5
	  System.out.println("*");
  } 
  
  N0:2 *-
  
    for(int i=1;i<=n;i++) {
  	  System.out.print("*");
    } 
    
  No:3 *****-
  
    for(int i=1;i<=n;i++) {
    	  System.out.print("*");
      } 
      
   No:4 *****
        -
        
    for(int i=1;i<=n;i++) {         //n=1
  	  System.out.print("*");
    } 
    System.out.println( );
	}
	
   No:5  *****
         *****
         *****
         *****
         ***** 
         
    for(int i=1;i<=n;i++) {              //n=5
    	for(int j=1;j<=n;j++) {
    	  System.out.print("*");
      } 
      System.out.println( );
  	}
  	
  No:6 *
       **
       ***
       ****
       ***** 
       
    for(int i=1;i<=n;i++) {              //n=5  ; i for lines
    	for(int j=1;j<=i;j++) {
    	  System.out.print("*"+" ");
      } 
      System.out.println( );
  	}
  	
    No:7 -----***** 
    
    for(int k=1;k<=n;k++) {              //n=5 ; k for space
    	System.out.print(" ");
    }for(int j=1;j<=n;j++) {
  	  System.out.print("*");
    } System.out.println( );
    
    No:8 -----*****
         -----*****
         -----*****
         -----*****
         -----*****  
         
    for(int i=1;i<=n;i++) {            //n=5  ; i for lines ; k for space; j for * printing
    	for(int k=1;k<=n;k++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n;j++) {
    		System.out.print("*");
        } System.out.println( );
    	}
    	
    No:9 $*
         $$**
         $$$***
         $$$$****
         $$$$$*****  
         
    for(int i=1;i<=n;i++) {           
    	for(int k=1;k<=i;k++) {
    		System.out.print("$");
    	}
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
        } System.out.println( );
    	}
 
 No:10  *****$
        *****$$
        *****$$$
        *****$$$$
        *****$$$$$ 
        
        for(int i=1;i<=n;i++) {           
        	for(int k=1;k<=n;k++) {
        		System.out.print("*");
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print("$");
            }
             System.out.println( );}
             
 No:11   $$$$$
         $$$$
         $$$
         $$
         $    
             
    for(int i=1;i<=n;i++) { 
    for(int j=n;j>=i;j--) {
		System.out.print("$");
    }
    System.out.println( );
}
    No:12 -*****
         --*****
         ---*****
         ----*****
         -----***** 
             
    for(int i=1;i<=n;i++) {           
    	for(int k=1;k<=i;k++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         } 
         
   No:13 -----*****
         -----*****
         -----*****
         -----*****
         -----*****
          
    for(int i=1;i<=n;i++) {           
    	for(int k=1;k<=n;k++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         } 
         
  No:14 -*****
        --*****
        ---*****
        ----*****
        -----***** 
        
    for(int i=1;i<=n;i++) {           
    	for(int k=1;k<=i;k++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         } 
         
    No:15 -----*****
          ----*****
          ---*****
          --*****
          -***** 
          
for(int i=1;i<=n;i++) {           
	for(int k=n;k>=i;k--) {
		System.out.print(" ");
	}
	for(int j=1;j<=n;j++) {
		System.out.print("*");
    }
     System.out.println( ); 
     }
      
  No:16 -*****
        --*****
        ---*****
        ----*****
        -----***** 
        -----*****
        ----*****
        ---*****
        --*****
        -*****  
        
    for(int i=1;i<=n;i++) {           
    	for(int k=1;k<=i;k++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         } 
    for(int i=1;i<=n;i++) {           
    	for(int k=n;k>=i;k--) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         }
    No:17 -----*****
          ----*****
          ---*****
          --*****
          -***** 
          -*****
          --*****
          ---*****
          ----*****
          -----***** 
          
    for(int i=1;i<=n;i++) {           
    	for(int k=n;k>=i;k--) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         } 
    for(int i=1;i<=n;i++) {           
    	for(int k=1;k<=i;k++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         }
    No:18 -----*
          ----***
          ---*****
          --*******
          -*********
               
    for(int i=1;i<=n;i++) {           
    	for(int k=n;k>=i;k--) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=2*i-1;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         }
    
    No:19 -*********
          --*******
          ---*****
          ----***
          -----*
               
   for(int i=1;i<=n;i++) {           
	for(int k=1;k<=i;k++) {
		System.out.print(" ");
	}
	for(int j=9;j>=2*i-1;j--) {
		System.out.print("*");
  }
      System.out.println( ); 
   }  
   
   No:20 -----*
         ----***
         ---*****
         --*******
         -*********     
         -*********
         --*******
         ---*****
         ----***
         -----*                  
    for(int i=1;i<=n;i++) {           
    	for(int k=n;k>=i;k--) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=2*i-1;j++) {
    		System.out.print("*");
        }
         System.out.println( ); 
         }
    for(int i=1;i<=n;i++) {           
    	for(int k=1;k<=i;k++) {
    		System.out.print(" ");
    	}
    	for(int j=9;j>=2*i-1;j--) {
    		System.out.print("*");
      }
          System.out.println( ); 
       }
    No:21 *******
          *     *
          *     *
          *     *
          *******             
    
    for(int i=1;i<=n;i++) {
    	for(int j=1;j<=n;j++) {
    		if(j==1||j==n||i==1||i==n) {
    			System.out.print("*");
    		}
    		else {
        		System.out.print("");

    		}
    	}
     System.out.println( ); 
    }*
    
    No:22    *******
             * ### *
             * ### *
             * ### *   
             *******            
    

             for(int i=1;i<=n;i++) {
             	for(int j=1;j<=n;j++) {
             		if(j==1||j==n||i==1||i==n) {
             			System.out.print("*");
             		}
             		else {
                 		System.out.print("#");

             		}
             	}
              System.out.println( ); 
             }*/
    
    
    
    
    
    
    
    
    
	}
	}