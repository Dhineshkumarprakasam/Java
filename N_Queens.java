import java.util.*;
public class queen
{
    public static boolean issafe(char board[][],int row, int col)
    {
        for(int i=0;i<row;i++)
        {
            if(board[i][col]=='Q' || (col-row+i>=0 && board[i][col-row+i]=='Q') || (col+row-i<board.length && board[i][col+row-i]=='Q'))
            {
                return false;
            }
        }
        return true;

    }

    public static boolean solve(char board[][], int row)
    {
        if(row==board.length)
        {
            for(char r[] : board)
            {
                System.out.println(Arrays.toString(r));
            }
            return true;
        }

        for(int col=0;col<board.length;col++)
        {
            if(issafe(board,row,col))
            {
                board[row][col]='Q';
                if(solve(board,row+1))
                    return true;
                board[row][col]='-';
            }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        char board[][] = new char[8][8];

        for(char r[] : board)
            Arrays.fill(r,'-');
        solve(board,0);
    }
}
