
package com.mycompany.temp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Temp")
public class TempServlet extends HttpServlet {

   @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
            PrintWriter out = resp.getWriter();
                   
         //ENTRADAS
        
        float CelsiusToFah = Float.parseFloat(req.getParameter("CelsiusToFah"));  
        
         //PROCESSAMENTO
        TemperaturaConversor temperaturaconversor  = new TemperaturaConversor();
        float temp = temperaturaconversor.geTemp();
        
        //SAÍDA
        out.println("Tempearatura: " + temp);
        
      }
} 

