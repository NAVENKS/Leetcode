# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers a
WHERE NOT EXISTS (
    SELECT 1 
    FROM Orders b 
    WHERE a.id = b.customerId
);