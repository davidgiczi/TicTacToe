
package com.david.giczi.tictactoe.model;

import javax.ejb.Stateless;

/**
 *
 * @author giczid
 */

@Stateless
public class TicTacToeLogic implements TicTacToeService{

    private static String[] table;
    
    public TicTacToeLogic() {
        
        table=new String[9];
        
        for (int i = 0; i < table.length; i++) {
            table[i]="0";
        }
        
    }
    
    
    @Override
    public Boolean tableManager(String[] table, Boolean who) {
        
    if(who){    
        
        if("X".equals(table[0]) && "X".equals(table[1]) && "X".equals(table[2])){
            return true;
        }
        if("X".equals(table[0]) && "X".equals(table[4]) && "X".equals(table[8])){
            return true;
        }
        if("X".equals(table[0]) && "X".equals(table[3]) && "X".equals(table[6])){
            return true;
        }
        if("X".equals(table[1]) && "X".equals(table[4]) && "X".equals(table[7])){
            return true;
        }
        if("X".equals(table[2]) && "X".equals(table[5]) && "X".equals(table[8])){
            return true;
        }
        if("X".equals(table[3]) && "X".equals(table[4]) && "X".equals(table[5])){
            return true;
        }
        if("X".equals(table[6]) && "X".equals(table[7]) && "X".equals(table[8])){
            return true;
        }
        if("X".equals(table[2]) && "X".equals(table[4]) && "X".equals(table[6])){
            return true;
        }
        
  }
    
    else {
        
        if("O".equals(table[0]) && "O".equals(table[1]) && "O".equals(table[2])){
            return true;
        }
        if("O".equals(table[0]) && "O".equals(table[4]) && "O".equals(table[8])){
            return true;
        }
        if("O".equals(table[0]) && "O".equals(table[3]) && "O".equals(table[6])){
            return true;
        }
        if("O".equals(table[1]) && "O".equals(table[4]) && "O".equals(table[7])){
            return true;
        }
        if("O".equals(table[2]) && "O".equals(table[5]) && "O".equals(table[8])){
            return true;
        }
        if("O".equals(table[3]) && "O".equals(table[4]) && "O".equals(table[5])){
            return true;
        }
        if("O".equals(table[6]) && "O".equals(table[7]) && "O".equals(table[8])){
            return true;
        }
        if("O".equals(table[2]) && "O".equals(table[4]) && "O".equals(table[6])){
            return true;
        }
 
    }
      
        return false; 
    }
   

    @Override
    public void newGame() {
        for (int i = 0; i < table.length; i++) {
            table[i]="0";
        }
    }

    @Override
    public String[] getTable() {
        return table;
    }

    @Override
    public void setTable(String player, int index) {
        table[index]=player;
    }

   

    
    
}
