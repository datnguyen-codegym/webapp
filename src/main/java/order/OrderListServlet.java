package order;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/orders")
public class OrderListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html");
//
//        PrintWriter writer = response.getWriter();
//
//        writer.println("Order List Servlet");
//
//        writer.close();
        request.getRequestDispatcher("/view/order/list-order.jsp")
                .forward(request, response);

    }
}