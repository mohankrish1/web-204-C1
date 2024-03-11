/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		int p=40,k=4;
		ArrayList<Integer> arr=new ArrayList<>();
		rec(1,p,arr,k);
		for(int i=0;i<ans.size();i++)
		{
		    ArrayList<Integer> a=new ArrayList<>(ans.get(i));
		    for(int j=0;j<a.size();j++)
		    System.out.print(" "+a.get(j));
		    if(i+1<ans.size())
		    System.out.println();
		}
	}
	public static int rec(int i,int p,ArrayList<Integer> arr,int k)
	{
	    if(p==0&&k==0)
	    {
	        ans.add(new ArrayList<>(arr));
	        return 1;
	    }
	    if(p<=0||k==0||i==p+1||p<i)
	    return 0;
	    int cnt=0;
	    arr.add(i);
	    cnt+=rec(i+1,p-i,arr,k-1);
	    arr.remove(arr.size()-1);
	    cnt+=rec(i+1,p,arr,k);
	    return cnt;
	}
}
