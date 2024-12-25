SELECT
    retailers.name AS ret_name,
    sup.name AS sup_name,
    country AS sup_country
FROM top_retailers AS retailers, suppliers AS sup