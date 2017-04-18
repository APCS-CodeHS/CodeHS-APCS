public class Multiply extends ConsoleProgram
{
    public void run()
    {
        multiply(2, 20);
        multiply(5, 19);
        multiply(100, 15);
        
    }
    
    private void multiply(int a, int b)
    {
        int total = a * b;
        System.out.println(total);
    }
}

