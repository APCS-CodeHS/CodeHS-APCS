public boolean bracketsMatch(String brackets)
{
    int count = 0;
    for (char ch : brackets.toCharArray()) {
        switch (ch) {
        case '{': count++; break;
        case '}': if (--count < 0) return false;
        }
    }
    return count == 0;
}

