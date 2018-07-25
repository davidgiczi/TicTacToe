<%-- 
    Document   : TicTacToeGame
    Created on : Mar 24, 2018, 5:00:23 PM
    Author     : User
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tic-Tac_toe</title>
        <style>input {background: greenyellow} </style>
    </head>
    <body style="background-color: tomato">
        <br>
        <br>
        <br>
       
    <center>
        <form action="TicTacToeServlet" method="post">
            
        <c:forEach items="${table}" var="item" varStatus="loop">
  
            <c:if test="${loop.index eq 2 || loop.index eq 5 || loop.index eq 8}">      
   
            <c:if test="${item eq '0'}">
                
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="${loop.index}" name="button"><br>
                
            </c:if>
           
           <c:if test="${item eq '+'}">
                
               <input style="height: 80px;width: 80px;color: greenyellow" type="submit" disabled><br>
                
            </c:if>
                 
             <c:if test="${item eq 'X'}">
                
                 <input style="height: 80px;width: 80px;color: tomato;font-size: 40px" type="submit" value="X" disabled><br>
                
            </c:if>
                
             <c:if test="${item eq 'O'}">
                
                 <input style="height: 80px;width: 80px;color: tomato;font-size: 40px" type="submit" value="O" disabled><br>
                
            </c:if>    
    </c:if>
                 
             <c:if test="${loop.index ne 2 && loop.index ne 5 && loop.index ne 8}">      
   
            <c:if test="${item eq '0'}">
                
                <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="${loop.index}" name="button"> 
                
            </c:if>
                
             <c:if test="${item eq '+'}">
                
             <input style="height: 80px;width: 80px;color: greenyellow" type="submit" disabled>
                
            </c:if>
                 
             <c:if test="${item eq 'X'}">
                
                 <input style="height: 80px;width: 80px;color: tomato;font-size: 40px" type="submit" value="X" disabled>   
                
            </c:if>
                
             <c:if test="${item eq 'O'}">
                
                 <input style="height: 80px;width: 80px;color: tomato;font-size: 40px" type="submit" value="O" disabled>  
                
            </c:if>    
    </c:if>    
                 
                         
             
        </c:forEach>
       
        </form>
        
   </center>      
    <hr>
 
     <form  action="TicTacToeServlet" method="post">
         <input style="color: black" type="submit" value="New Game" name="newGame">
     </form><br>
     <input style="color: black" type="submit" value="Close" name="close" onclick="closewindow()">
 
    <center>
       
            <h2 style="color: white">X player:</h2>
            <h2 style="color: greenyellow">${xPlayer}</h2>
            <h2 style="color: white">O player:</h2>
            <h2 style="color: greenyellow">${oPlayer}</h2>
       
    </center>
            
                <script>
               function closewindow(){
                    if(confirm("Would you like to close the game?"))
                        close();
                }  
                </script>   
            
             <c:if test="${player==true}">
                <script>
                    
                    alert("X is the winner!");
                    
                </script>   
            </c:if>
             <c:if test="${player==false}">
                <script>
                    
                    alert("O is the winner!");
                    
                </script>   
            </c:if>
             <c:if test="${equal==true}">
                <script>
                    
                    alert("The result is equal.");
                    
                </script>   
            </c:if>
    </body>
</html>
