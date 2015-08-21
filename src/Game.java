
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauricio
 */
public class Game {
    
    private int board[][];
    private int rows;
    private int cols;

    public Game (int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new int[rows][cols];
        this.init();
    }

    private void init() {
        int i, j, value = 0;
        for (i = 0; i < this.rows; i++) {
            for (j = 0; j < this.cols; j++) {
                this.board[i][j] = value++;
            }
        }
        this.board[this.rows-1][this.cols-1] = -1;
    }
    
    public void printBoard() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public boolean isFinished() {
        // blank piece in the right position
        if (this.board[this.rows-1][this.cols-1] != -1) {
            return false;
        }
        
        int value = 0;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (this.board[i][j] != value && (i != this.rows-1 && j != this.cols-1)) {
                    System.out.println("false in piece " + i + " , " + j);
                    return false;
                }
                value++;
            }
        }
        
        // all pieces in the right position
        return true;
    }
    
    /**
     * 
     * @param pieceNumber
     * @return the position of the piece in the board (row, column)
     */
    public Point getPosition(int pieceNumber) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (this.board[i][j] == pieceNumber) {
                    return new Point(i, j);
                }
            }
        }
        return new Point(-1, -1);
    }
    
    
    
}
