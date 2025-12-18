  //mini voting


    
	   import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	          int admk=0;
	          int dmk=0;
	          int tvk=0;
	          
	       System.out.printf("choose the vote::"+"\n");
	       System.out.printf("press:1---ADMK"+"\n");
	       System.out.printf("press:2---DMK"+"\n");
	       System.out.printf("press:3---TVK"+"\n");
	       System.out.printf("press: -1 voting end."+"\n");
	      

	       while(true){
	            System.out.print("Enter  vote::");
	          int vote=s.nextInt();
	           if(vote==-1)
	               break;
	  
	           switch(vote){
	               case 1:
	                   admk++;
	                   break;
	                   case 2:
	                       dmk++;
	                       break;
	                       case 3:
	                           tvk++;
	                           break;
	                       
	                   
	           }
	       }
	        System.out.println("vote result::");
	       System.out.println("---ADMK "+admk);
	       System.out.println("---DMK "+dmk);
	       System.out.println("---TVK "+tvk);
	       System.out.println("final voting list....");
	       
	       if(admk>dmk && admk>tvk){
	           System.out.println("Final list :::");
	            System.out.println("---ADMK winner:::");
	       }else if(dmk>admk && dmk>tvk){
	           System.out.println("Final list :::");
	            System.out.println("---DMK winner:::");
	   }else{
	           System.out.println("Final list :::");
	            System.out.println("---TVK winner:::");
	   }
	   }
	       
	   
	   
	    }
	   
	   
	   
	   
	   

	   
	  
	   
	   
	   
	   
	   
	  
	   
	   
	  
	
	   
	 
	   
	 
	   
	  
	   
	  
	   
	   
	   
	  
	