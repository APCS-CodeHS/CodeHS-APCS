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


