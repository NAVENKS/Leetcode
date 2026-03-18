# Write your MySQL query statement below
select name as Customers from Customers a where 0 = (select count(*) from Orders b where a.id=b.customerId);