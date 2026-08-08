package service;



import model.Order;


import java.util.List;

public class OrderService {

    private final OrderRepository orderRepository =
            new OrderRepository();

    public List<Order> findAll() {

        return orderRepository.findAll();
    }
}
