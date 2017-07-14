package com.xss.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
/**
import static org.mockito.Mockito.*;

import java.io.IOException;

import junit.framework.TestCase;


 **/
/**
import com.xss.servlets.UrlTextExample;

import org.apache.commons.io.FileUtils;
import org.mockito.Mockito;
 **/

/**
 * Created by simurg on 25/04/2017.
 */
@SuppressWarnings("javadoc")
@WebServlet(name = "SanitizerServlet")
public class SanitizerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //@Test
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maltext = request.getParameter("maltext");
        PrintWriter out = response.getWriter();
        StringBuilder out2 = new StringBuilder();
        UrlTextExample.run(out2, maltext);
        //assertEquals(maltext, out2.toString());
        out.println (
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                        "http://www.w3.org/TR/html4/loose.dtd\">\n" +
                        "<html> \n" +
                        "<head> \n" +
                        "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                        "charset=ISO-8859-1\"> \n" +
                        "<title> XSS Filter Bypass Example  </title> \n" +
                        "</head> \n" +
                        "<body> <div align='center'> \n" +
                        "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
                        "Text: " + out2 + " <br> " +
                        "</font></body> \n" +
                        "</html>"
        );

    }
}
