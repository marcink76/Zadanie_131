package pl.unitconverter.servlets;

import pl.unitconverter.calculator.LenghtCalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/servlets.ServletLenght")

public class ServletLenght extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String milimetrs = request.getParameter("milimetrs");
        String centimetrs = request.getParameter("centimetrs");
        String meters = request.getParameter("meters");

        PrintWriter writer = response.getWriter();

        if (meters != "") {
            writer.print(meters + " m to: \n");
            writer.print(LenghtCalculator.lenghtCalculating(meters, 1000) + " mm\n");
            writer.print(LenghtCalculator.lenghtCalculating(meters, 100) + " cm\n");
        }
        if (milimetrs != "") {
            writer.print(milimetrs + " mm to: \n");
            writer.print(LenghtCalculator.lenghtCalculating(milimetrs, 0.001) + " m\n");
            writer.print(LenghtCalculator.lenghtCalculating(milimetrs, 0.1) + " cm\n");
        }
        if (centimetrs != "") {
            writer.print(centimetrs + " cm to: \n");
            writer.print(LenghtCalculator.lenghtCalculating(centimetrs, 0.01) + " m \n");
            writer.print(LenghtCalculator.lenghtCalculating(centimetrs, 10) + " mm\n");
        }
    }
}