import java.util.*;
class towersOfHanoi
{
    static void hanoi(int n,char s,char a, char d )
    {
        if(n==0)
        {
            return;
        }
        hanoi(n-1,s,d,a);
        System.out.println("Move disk "+n+" from "+s+" to "+d+" ");
        hanoi(n-1,a,s,d);
    }
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        hanoi(n,'A','B','C');
        sc.close();
    
	}
}