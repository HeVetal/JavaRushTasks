SELECT
    hq_location AS ret_location,
    sup.annual_revenue_billions AS sup_revenue
FROM top_retailers AS ret, suppliers AS sup
WHERE hq_location != 'USA'