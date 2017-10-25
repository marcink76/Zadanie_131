package pl.unitconverter.servlets;

import pl.unitconverter.calculator.MassCalculator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ServletMass")

public class ServletMass extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        String miligrams = request.getParameter("miligrams");
        String grams = request.getParameter("grams");
        String kilograms = request.getParameter("kilograms");


        PrintWriter writer = response.getWriter();

        if (miligrams != "") {
            writer.print(miligrams + " mg to: \n");
            writer.print(MassCalculator.massCalculating(miligrams, 0.001) + " g \n");
            writer.print(MassCalculator.massCalculating(miligrams, 0.000001) + " kg \n");
        }
        if (grams != "") {
            writer.print(grams + " g to: \n");
            writer.print(MassCalculator.massCalculating(grams, 1000) + " mg\n");
            writer.print(MassCalculator.massCalculating(grams, 0.001) + " kg\n");
        }
        if (kilograms != "") {
            writer.print(kilograms + " kg to: \n");
            writer.print(MassCalculator.massCalculating(kilograms, 1000000) + " mg\n");
            writer.print(MassCalculator.massCalculating(kilograms, 1000) + " g\n");
        }
    }
}