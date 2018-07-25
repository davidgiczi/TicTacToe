<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tic-Tac-Toe</title>
        <style>input {background: greenyellow}</style>
    </head>
    <body style="background-color: tomato">
        <br>
        <br>
        <br>
        
        <center> 
           
           <form action="TicTacToeServlet" method="post">
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="0" name="button">
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="1" name="button">
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="2" name="button"><br>
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="3" name="button">
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="4" name="button">
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="5" name="button"><br>
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="6" name="button">
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="7" name="button">
           <input style="height: 80px;width: 80px;color: greenyellow" type="submit" value="8" name="button"><br>
            </form>
            
           </center>
        <hr>
     <center><h2 style="color: white">Please, press one of the buttons.</h2></center>
     
     <input style="color: black" type="submit" value="Close" name="close" onclick="closewindow()">
     
   <c:if test="${result==true}">  
        <center> 
            <h2 style="color: white">X player:</h2>
            <h2 style="color: greenyellow">${xPlayer}</h2>
            <h2 style="color: white">O player:</h2>
            <h2 style="color: greenyellow">${oPlayer}</h2>
        </center>
   </c:if>
        
        <script>
               function closewindow(){
                    if(confirm("Would you like to close the game?"))
                        close();
                }  
       </script>   
        
    </body>
</html>
