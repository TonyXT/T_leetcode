public class TicTacToe {
    int[][] table;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        this.table=new int[n][n];
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int symbol=0;
        int length=table.length;
        if(player==1) symbol=1;
        if(player==2) symbol=2;
        if(table[row][col]==0) table[row][col]=symbol;
        //horizontal
        int sum1=0;
        for(int i=0;i<length-1;i++){
            if(table[row][i]!=0&&table[row][i]==table[row][i+1]) sum1++;
            else sum1=0;
            if(sum1==2) return player;
        }
        //vertical
        int sum2=0;
        for(int i=0;i<length-1;i++){
            if(table[i][col]!=0&&table[i][col]==table[i+1][col]) sum2++;
            else sum2=0;
            if(sum2==2) return player;
        }
        //leftdia
        int sum3=0;
        int r=row;
        int c=col;
        if(row>=col) {
            r=r-c;
            c=0;
        }
        else {
            c=c-r;
            r=0;
        }
        while(r<=length-2&&c<=length-2){
            if(table[r][c]!=0&&table[r][c]==table[r+1][c+1]) sum3++;
            else sum3=0;
            if(sum3==2) return player;
            r++;
            c++;
        }
        //rigthdia
        int sum4=0;
        r=row;
        c=col;
        if(r+c>=length){
            r=r-(length-1-c);
            c=length-1;
        }else{
            c=r+c;
            r=0;
        }
        while(r<=length-2&&c>=1){
            if(table[r][c]!=0&&table[r][c]==table[r+1][c-1]) sum4++;
            else sum4=0;
            if(sum4==0) return player;
            r++;
            c--;
        }
        return 0;
    }

}
