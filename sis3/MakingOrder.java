package sis3;

import sis3.Objects.Order;
import sis3.People.Executor;

public interface MakingOrder {
    public void sendOrder(Executor ex, Order o);
}
