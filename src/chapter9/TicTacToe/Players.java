package chapter9.TicTacToe;

import static chapter9.TicTacToe.Mark.E;

public class Players {
    private Mark mark;
    public Players(Mark mark) {
        this.mark = mark;
    }
    public Mark getMark() {
        return mark;
    }

    public void playGame(int position, Board board) {
        Mark[][]boardSurface = board.getBoardSurface();
        if(position < 1 || position > 9)throw new ArrayIndexOutOfBoundsException("Enter valid position");
        else{
            int row = 0;
            int col = position - 1;
            if(position > 3) {row = 1; col = position - 4;}
            if(position > 6) {row = 2;col = position - 7;}
            if (boardSurface[row][col] == E){
                boardSurface[row][col] = mark;
            } else{
                throw new TicTacToeException("play to a different position");
            }
        }

    }
}

