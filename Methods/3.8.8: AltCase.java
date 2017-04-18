public String altCase(String text)
{
    String result = "";
    for(int i = 0; i <= text.length() - 1; i++)
    {
        if(i % 2 == 0)
        {
            if(Character.isLowerCase(text.charAt(i)))
            {
                result += Character.toUpperCase(text.charAt(i));
            }
            else
            {
                result += text.charAt(i);
            }
        }
    else
    {
        result += Character.toLowerCase(text.charAt(i));
    }
    }
    return result;
}


