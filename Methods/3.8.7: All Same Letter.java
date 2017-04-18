public boolean allSameLetter(String str)
{
      for(int i = 0; i <= str.length() - 2; i++)
      {
          if(str.charAt(i) == str.charAt(i + 1))
          {
          }
          else
          {
              return false;
          }
      }
      return true;
}

