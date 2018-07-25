
package com.david.giczi.tictactoe.model;

/**
 *
 * @author giczid
 */
public interface TicTacToeService {
    
    Boolean tableManager(String[] table, Boolean who) ;
    String[] getTable();
    void newGame();
    void setTable(String player, int index);
}
