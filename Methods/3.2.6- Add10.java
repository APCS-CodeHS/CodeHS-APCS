
public class Add10 extends ConsoleProgram
{
    public void run()
    {
        add10(1);
        add10(100);
        add10(-50);
    }
    
    private void add10(int a)
    {
        int total = a + 10;
        System.out.println(total);
    }
}

}
