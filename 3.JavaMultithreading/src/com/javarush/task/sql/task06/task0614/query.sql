UPDATE employee
SET employee.salary = employee.salary + 1000
WHERE employee.id IN
    (SELECT employee_id FROM task WHERE exp_date > '2022-10-01')
