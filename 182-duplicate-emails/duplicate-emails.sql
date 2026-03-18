# Write your MySQL query statement below
select distinct a.email as Email from Person a
where 1<(select count(*) from Person b where a.email=b.email);