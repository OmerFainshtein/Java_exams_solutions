

public class TesterB2022Moed86 extends b2022Moed86
{
    public static void main(String [] args)
    {
        int [][] mat = {{12,22,23,54,11},{43,35,21,20,30},{34,23,43,22,30},{25,31,2,20,34},{10,22,10,11,10},{40,13,3,1,23}};
        System.out.println("*********question number 1");
        System.out.println("should be 86 and was: " + maxPath(mat));
        
        int [] a = {35,17,13,252,4,128,7,3,81};
        System.out.println("*********question number 2");
        sortmod(a,10);
    }
}
