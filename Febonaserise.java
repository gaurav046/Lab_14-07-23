import java.util.Scanner;
class Febonaserise {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i;
        System.out.print("Enter The Number :");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        System.out.print(n1+" "+n2);   
        for(i=2;i<result;++i)   
        {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        } 
    }
}

