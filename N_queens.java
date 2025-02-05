public class N_queens {

    public static void nqueens(char board[][],int row){
        if(row == board.length){
            printboard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = 'x';
            }
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        // verticalup
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonalleftup
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonalrightup
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printboard(char board[][]){
        System.out.println("---chess board----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
               System.out.print(board[i][j]+" "); 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x';
            }
        }
        nqueens(board,0);
    }
}
