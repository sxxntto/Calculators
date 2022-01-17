package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Arithmetic Calculator
 * @author Shinhyuk Hwang
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
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
        
        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        String message = "";
        
     if (firstInput != null && secondInput != null){
        try { 
            int firstnumber = Integer.parseInt(firstInput);
            int secondnumber = Integer.parseInt(secondInput);
            
            if(request.getParameter("add") != null) {
                        message = Integer.toString(firstnumber + secondnumber); 
            }
            else if(request.getParameter("subtract") != null) {
                        message = Integer.toString(firstnumber - secondnumber);
            }
            else if(request.getParameter("multiply") != null) {
                        message = Integer.toString(firstnumber * secondnumber);
            }
            else if(request.getParameter("divide") != null) {
                        message = String.format("%.2f", (firstnumber*1.0) / secondnumber);
            }
            
            } catch (Exception ex){
            // Number input exists but is not a number.
            message = "invalid";
            }
        
        } else {
         // number input is missing.
         message = "invalid";
     }        
     
        request.setAttribute("firstInput", firstInput);
        request.setAttribute("secondInput", secondInput);
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }
}
    
    
