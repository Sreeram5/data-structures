public class Pair 
{
    public int row;
    public int column;

    public Pair(int r, int c)
    {
        row = r;
        column = c;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return column;
    }

    public String toString()
    {
        return "(" + row + ", " + column + ")";
    }
    
}
