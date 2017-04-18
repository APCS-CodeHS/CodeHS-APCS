public String toUpperCase(String str)
{
	    String result = "";
        String s = "";
  
  for( int i = 0; i < str.length(); i++)
  {
      char c = str.charAt(i);
      if (Character.isLowerCase(c))
      {
          c = Character.toUpperCase(c);
          s = Character.toString(c);
      }
      else
      {
          s = Character.toString(c);
      }
      result += s;
  }
  
  return result;
	}

