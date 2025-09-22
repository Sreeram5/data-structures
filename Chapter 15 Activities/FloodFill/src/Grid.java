import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    //. . .

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(row, column));
        int counter = 1;

        while (!stack.isEmpty()) {
            Pair current = stack.pop();
            int r = current.getRow();
            int c = current.getCol();

            if (pixels[r][c] == 0) {
                pixels[r][c] = counter++;

                if (r > 0 && pixels[r - 1][c] == 0) 
                    stack.push(new Pair(r - 1, c));

                if (c < SIZE - 1 && pixels[r][c + 1] == 0) 
                    stack.push(new Pair(r, c + 1));

                if (r < SIZE - 1 && pixels[r + 1][c] == 0) 
                    stack.push(new Pair(r + 1, c));

                if (c > 0 && pixels[r][c - 1] == 0) 
                    stack.push(new Pair(r, c - 1));
            }
        }    
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
