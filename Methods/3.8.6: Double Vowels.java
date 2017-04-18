public String doubleVowel(String str)
	{
	    String result = "";
	    String s = "";
	    
	 for(int i = 0; i < str.length(); i++)
	 {
	     char c = str.charAt(i);

	     if (c == 'a')
	     {
	         s = Character.toString(c);
	         result += s + s;
	     }
	     else if(c == 'e')
	     {
	        s = Character.toString(c);
	         result += s + s;
	     }
	     else if(c == 'i')
	     {
	        s = Character.toString(c);
	         result += s + s;
	     }
	     else if(c == 'o')
	     {
	        s = Character.toString(c);
	         result += s + s;
	     }
	     else if(c == 'u')
	     {
	        s = Character.toString(c);
	         result += s + s;
	     }
	     else
	     {
	        s = Character.toString(c);
	         result += s;
	     }
	 }
	     
	 
	 return result;

}

