import java.util.*;
 class Main{
    public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    int a,b,c;
    a=obj.nextInt();
        b=obj.nextInt();
            c=obj.nextInt();
            if((a>b) && (a>c)){
                System.out.println(a+" is larger");}
                else if((a<b)&&(b>c)){
                    System.out.println(b+ "is larger");}
                    else{
                        System.out.println(c+" is larger");
                    }
                
            }
}

    
