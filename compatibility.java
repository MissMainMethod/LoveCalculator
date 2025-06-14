import java.util.*;
class compatibility
{
    public static void main()
{
    Scanner ob = new Scanner(System.in);
    System.out.println("enter your name");
    String a = ob.nextLine().toLowerCase();
    System.out.println("enter your crush's name");
    String b = ob.nextLine().toLowerCase(); 
    int match=0;
for(int i=0; i<a.length();i++)
{
    char ch= a.charAt(i);
for(int j=0; j<b.length();j++)
{
    char ch2=b.charAt(j);
if(ch==ch2 && ch!= ' ')
match++;
}
}
int total= a.length()+b.length();
int d= (match*100)/(total);
System.out.println("YOUR LOVE COMPATIBILITY % IS" + d+"%");
if (d>=80)
System.out.println("you are the classic couple just kiss already!!");
if(d<80&&d>=60)
System.out.println("ohhh i smell something brewing..");
if(d<60&&d>=40)
System.out.println("there's still some hope darling");
if (d<40)
System.out.println("uhm..maybe find someone else..?");
}
}