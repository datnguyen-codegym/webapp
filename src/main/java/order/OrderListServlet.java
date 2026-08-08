package order;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Order;
import service.OrderService;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/orders")
public class OrderListServlet extends HttpServlet {
    private final OrderService orderService =
            new OrderService();

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

//        List<Order> orders = orderService.findAll();
//        request.setAttribute("orders", orders);
        request.getRequestDispatcher("/view/order/list-order.jsp")
                .forward(request, response);

    }
}