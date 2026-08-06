package product.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.instancio.Instancio;
import product.model.response.ProductResponse;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@WebServlet("/product/get-all")
@Slf4j
public class ListProductServlet extends HttpServlet {

    public ListProductServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<ProductResponse> productList =
                IntStream.range(0, 10)
                        .mapToObj(i -> Instancio.create(ProductResponse.class))
                        .collect(Collectors.toList());

        req.setAttribute(
                "productList",
                productList
        );

        req.setAttribute(
                "content",
                "/WEB-INF/views/product/list-product.jsp"
        );

        req
                .getRequestDispatcher("/WEB-INF/views/home/main.jsp")
                .forward(req, resp);
    }
}
