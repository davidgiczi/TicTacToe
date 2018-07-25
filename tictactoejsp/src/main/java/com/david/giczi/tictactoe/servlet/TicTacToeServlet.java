
package com.david.giczi.tictactoe.servlet;

import com.david.giczi.tictactoe.model.TicTacToeService;
import java.io.IOException;
import java.util.Random;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author giczid
 */
@WebServlet(name = "TicTacToeServlet", urlPatterns = {"/TicTacToeServlet"})
public class TicTacToeServlet extends HttpServlet {

    @Inject
    TicTacToeService service;
    private final Random RND=new Random();
    private Boolean player=RND.nextBoolean();
    private static int X_PLAYER=0;
    private static int O_PLAYER=0;
    private static int COUNTER=0;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        COUNTER++;
        String button=request.getParameter("button");
        String newGame=request.getParameter("newGame");
        String close=request.getParameter("close");
        
        if(newGame!=null){
            service.newGame();
            COUNTER=0;
            RequestDispatcher r=request.getServletContext().getRequestDispatcher("/TicTacToeBegining.jsp");
            request.setAttribute("result", true);
            request.setAttribute("xPlayer", X_PLAYER);
            request.setAttribute("oPlayer", O_PLAYER);
            r.include(request, response);
        }      
        else{
            
        if(player)
        service.setTable("X", Integer.parseInt(button));
        else
        service.setTable("O", Integer.parseInt(button));
        
        
        if(service.tableManager(service.getTable(), player) && player){
            
            X_PLAYER++;
           
            request.setAttribute("player", true);
            
            for (int i = 0; i < service.getTable().length; i++) {
                if(service.getTable()[i].equals("0"))
                    service.setTable("+", i);
            }
            
        }
        else if(service.tableManager(service.getTable(), player) && !player){
            
            O_PLAYER++;
            
            request.setAttribute("player", false);
            
            for (int i = 0; i < service.getTable().length; i++) {
                if(service.getTable()[i].equals("0"))
                    service.setTable("+", i);
            }
            
        }
        else if(COUNTER==9){
           
            request.setAttribute("equal", true);
            
        }
            
       
        RequestDispatcher r=request.getServletContext().getRequestDispatcher("/TicTacToeGame.jsp");
        request.setAttribute("table", service.getTable());
        request.setAttribute("xPlayer", X_PLAYER);
        request.setAttribute("oPlayer", O_PLAYER);
        r.include(request, response);
        
        player=!player;
      }   
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
