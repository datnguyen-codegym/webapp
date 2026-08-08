package customer.repository;

import core.DAO;
import customer.model.entity.Customer;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerDAO implements DAO<Customer, Long> {

    @Override
    public Customer findById(Long aLong) {
        return null;
    }

    @Override
    public Collection<Customer> findAll() {
        return new ArrayList<>();
    }

    @Override
    public int insert(Customer entity) {
        return 0;
    }

    @Override
    public int update(Customer entity) {
        return 0;
    }

    @Override
    public int delete(Long aLong) {
        return 0;
    }
}
