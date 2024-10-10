--query1
select partnerid,partnername,phoneno from deliverypartners where rating between 3 and 5

--query2
update customers set phoneno=9845186867 where customerid='cust4'

--query3
select customerid,customername,address, phoneno from customers where email like '%@gmail.com' order by customerid

--query4
alter table customers modify customerid int

--query5
alter table hoteldetails rename rating to hotel_rating

--query6
select hotelname || ' is a '|| hoteltype || ' hotel' as Hotel_Info from hoteldetails order by hotelname

--query7

select h.hotelname, h.hotelid, count(o.orderid) as  "no of orders" from hoteldetails h
join orders o on  o.hotelid = h.hotelid group by  h.hotelname, h.hotelid having count(o.orderid)>1

--gives hotelname which is ordered many times
select h.hotelname, count(o.orderid)from hoteldetails h
join orders o on  o.hotelid = h.hotelid group by  h.hotelname having count(o.orderid)>1

--query8
Q8
SELECT hotel_id, hotel_name, hotel_type FROM hotel_details
WHERE hotel_id NOT IN ( SELECT hotel_id FROM orders WHERE order_date BETWEEN '2019-05-01' AND '2019-05-31' );
 
-- Q9
SELECT o.order_id, c.customer_name, h.hotel_name, o.order_amount FROM orders o
JOIN customers c ON c.customer_id = o.customer_id
JOIN hotel_details h ON o.hotel_id = h.hotel_id
order BY o.order_id asc;














