SELECT department department_name, COUNT(*) AS count
FROM employee
WHERE position = 'frontend developer'
GROUP BY department