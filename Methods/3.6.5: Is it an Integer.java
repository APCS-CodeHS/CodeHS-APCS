public boolean isInteger(String str)
{
	if (str.length() != 0)
	{
	    for (int i = 0; i<str.length(); i++)
	    {
	        if (Character.isDigit(str.charAt(i)) == false)
	        {
	            return false;
	        }
	    }
	    return true;
	}
	
	return false;
	
	
}

