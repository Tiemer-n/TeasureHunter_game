/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure.hunt;

/**
 *
 * @author ir191258
 */
public class TreasureHunt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] board = new String[10][8];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[]";
                System.out.print(board[i][j]);
            }
            System.out.println("");
            
        }
    }
    
}
