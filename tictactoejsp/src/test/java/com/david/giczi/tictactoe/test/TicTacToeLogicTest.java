package com.david.giczi.tictactoe.test;



import com.david.giczi.tictactoe.model.TicTacToeLogic;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TicTacToeLogicTest {
  
    private TicTacToeLogic table;
  
    @Before
    public void createTicTacToeTable(){
        
        table=new TicTacToeLogic();
        
    }
    
    @Test
    public void createTableTest(){
        
        
        StringBuilder b=new StringBuilder();
        
        
        for (String value : table.getTable()) {
            b.append(value);
        }
        
        assertEquals("000000000",b.toString());
        
    }
    
    
    @Test
    public void tableManagerTest1(){
        
       table.setTable("X", 0);
       table.setTable("X", 1);
       table.setTable("X", 2);
       
       assertTrue(table.tableManager(table.getTable(), true));
    }
    
    @Test
     public void tableManagerTest2(){ 
         
       table.setTable("X", 0);
       table.setTable("X", 4);
       table.setTable("X", 8);
       
       assertTrue(table.tableManager(table.getTable(), true));
     }
     
     
     @Test
      public void tableManagerTest3(){
          
       table.setTable("X", 0);
       table.setTable("X", 3);
       table.setTable("X", 6);
       
       assertTrue(table.tableManager(table.getTable(), true));
  } 
      
      @Test
      public void tableManagerTest4(){
           
       table.setTable("X", 1);
       table.setTable("X", 4);
       table.setTable("X", 7);
       
       assertTrue(table.tableManager(table.getTable(), true));
  } 
       
       @Test
       public void tableManagerTest5(){
            
       table.setTable("X", 2);
       table.setTable("X", 5);
       table.setTable("X", 8);
       
       assertTrue(table.tableManager(table.getTable(), true));
  }    
        
     @Test
      public void tableManagerTest6(){
            
       table.setTable("X", 3);
       table.setTable("X", 4);
       table.setTable("X", 5);
       
       assertTrue(table.tableManager(table.getTable(), true));
  }    
      
      @Test
       public void tableManagerTest7(){
             
       table.setTable("X", 6);
       table.setTable("X", 7);
       table.setTable("X", 8);
       
       assertTrue(table.tableManager(table.getTable(), true));
   } 
       
       @Test
       public void tableManagerTest8(){
            
       table.setTable("X", 2);
       table.setTable("X", 4);
       table.setTable("X", 6);
       
       assertTrue(table.tableManager(table.getTable(), true));
    }
    
   @Test
    public void tableManagerTest9(){
        
       table.setTable("O", 0);
       table.setTable("O", 1);
       table.setTable("O", 2);
       
       assertTrue(table.tableManager(table.getTable(), false));
    }
    
    @Test
     public void tableManagerTest10(){ 
         
       table.setTable("O", 0);
       table.setTable("O", 4);
       table.setTable("O", 8);
       
       assertTrue(table.tableManager(table.getTable(), false));
     }
     
     
     @Test
      public void tableManagerTest11(){
          
       table.setTable("O", 0);
       table.setTable("O", 3);
       table.setTable("O", 6);
       
       assertTrue(table.tableManager(table.getTable(), false));
  } 
      
      @Test
      public void tableManagerTest12(){
           
       table.setTable("O", 1);
       table.setTable("O", 4);
       table.setTable("O", 7);
       
       assertTrue(table.tableManager(table.getTable(), false));
  } 
       
       @Test
       public void tableManagerTest13(){
            
       table.setTable("O", 2);
       table.setTable("O", 5);
       table.setTable("O", 8);
       
       assertTrue(table.tableManager(table.getTable(), false));
  }    
        
     @Test
      public void tableManagerTest14(){
            
       table.setTable("O", 3);
       table.setTable("O", 4);
       table.setTable("O", 5);
       
       assertTrue(table.tableManager(table.getTable(), false));
  }    
      
      @Test
       public void tableManagerTest15(){
             
       table.setTable("O", 6);
       table.setTable("O", 7);
       table.setTable("O", 8);
       
       assertTrue(table.tableManager(table.getTable(), false));
   } 
       
       @Test
       public void tableManagerTest16(){
            
       table.setTable("O", 2);
       table.setTable("O", 4);
       table.setTable("O", 6);
       
       assertTrue(table.tableManager(table.getTable(), false));
    }  
       
    
}
