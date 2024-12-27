SELECT customers.last_name AS surmame,
       orders.order_id
FROM customers LEFT JOIN orders
    ON customers.customer_id = orders.customer_id