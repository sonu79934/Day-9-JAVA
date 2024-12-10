import java.util.*;
public class splittingastring{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //splitting a sentence
        String a=sc.nextLine();
        String sp[]=a.split(" ");
        System.out.println(Arrays.toString(sp));
    }
}