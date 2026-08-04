package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/life")
public class ServletLifeCircle extends HttpServlet {

    public ServletLifeCircle() {
        System.out.println("This is default constructor ---------");
    }

    @Override
    public void init() throws ServletException {
        // có thể khởi tạo kết nối csdl / mở kết nối đến file
        System.out.println("Init main.java.servlet ----------");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("ServletLifCircle doGet method");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("ServletLifCircle doPost method");
        writer.close();
    }

    @Override
    public void destroy() {
        // có thể đóng kết nối csdl / mở kết nối đến file
        System.out.println("Destroy main.java.servlet ---------");
    }
}
