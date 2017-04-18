

public class Echo extends ConsoleProgram\
{
    public void run()
    {
        echo("Anybody home?", readInt("Input how many times to echo."));
    }

    private void echo(String text, int numTimes)
    {
     for (int i = 0; i < numTimes; i++)
        {
            System.out.println("Anybody home?");
        }
    }
}

}
