SELECT department, COUNT(*)
FROM employee
WHERE position = 'backend developer'
GROUP BY department
