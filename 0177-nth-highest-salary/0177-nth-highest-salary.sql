CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N=N-1; #offset is pointed to 0-based indexing set first we will set to n-1
  RETURN (
      # Write your MySQL query statement below.
        select distinct  salary from Employee order by salary desc limit 1 offset N
  );
  # limit is used to display no. of records offset means to skip no.of records
END