import java.util.*;
class Main {
    public static void main(String args[]){
        int a,rev=0,c,temp;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        temp=a;
        while(a>0){
            int b=a%10;
            rev=rev*10+b;
            a=a/10;
        }
        if(rev==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
    
