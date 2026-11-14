public int sumFrom(int a, int b)
	{

int result = 0;
       if(a>b) //swap them
       {
          result=a;
          a=b;
          b=result;
          result=0;
       }
        while (a <=b) {
        result+=a;
        a++; 
  }
  return result;
}
// another way (does not check and swap if B is greater than A but uses less code. This is the code based on what test examples I got.)

public int sumFrom(int a, int b)
{
    int sum = 0;
    
    for(int i = a; i <= b; i++)
    {
        sum += i;
    }
    
    return (sum);
}
