import java.util.*;
class Main {
    public static void main(String args[]){
        int a,b,i;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        i=2;
        while(a>i){
            if(a%i==0)
            break;
            else 
            i++;}
            if(a==i){
                System.out.println("yes");
            }
            else {
                            System.out.println("no");}

            
    }     
        }
        
