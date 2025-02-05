public class Sudoku {

    public static boolean Sudokusolver(int sud[][],int row,int col){
        if(row == 9){
            return true;
        }

        int nextrow = row, nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }
        if(sud[row][col]!=0){
            return Sudokusolver(sud,nextrow,nextcol);
        }

        for(int digit =1;digit<=9;digit++){
            if(isSafee(sud,row,col,digit)){
                sud[row][col] = digit;
                if(Sudokusolver(sud,nextrow,nextcol)){
                    return true;
                }
                sud[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafee(int sud[][],int row,int col,int digit){
        // column
        for(int i=0;i<=8;i++){
            if(sud[i][col] == digit){
                return false;
            }
        }
        // row
        for(int j=0;j<=8;j++){
            if(sud[row][j] == digit){
                return false;
            }
        }

        // grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sud[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printsudoku(int sud[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sud[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int sud[][] = {{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};
    
    if(Sudokusolver(sud,0,0)){
        printsudoku(sud);
    }else{
        System.out.println("no sol");
    }
    }
}
