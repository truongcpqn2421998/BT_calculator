import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet ", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float num1 =Float.parseFloat(request.getParameter("num1"));
        float num2 =Float.parseFloat(request.getParameter("num2"));
        String operator=request.getParameter("operator");
        float result=Calculator.calculator(num1,num2,operator);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Result:</h2>");
        writer.println(num1+operator+num2+"="+result);
        writer.println("</html>");
    }
}
