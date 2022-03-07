-- создание таблиц
create table product(
                        id serial primary key,
                        description varchar(20),
                        price integer check (price>0),
                        amount integer check (amount>=0)
);

create table customer(
                         id serial primary key,
                         name varchar(20)
);

create table booking(
                        id serial primary key,
                        date DATE,
                        amount integer check (amount>0),
                        customer_id integer,
                        foreign key (customer_id) references customer(id),
                        product_id integer,
                        foreign key (product_id) references product(id)
);
--заполняем таблицы
insert into customer(name) values ('Рустем');
insert into customer(name) values ('Наиль');
insert into customer(name) values ('Марсель');
insert into customer(name) values ('Айдар');

insert into product(description, price, amount) values ('SSD',69,58);
insert into product(description, price, amount) values ('RAM',69,211);
insert into product(description, price, amount) values ('GPU',969,8);
insert into product(description, price, amount) values ('GPU',1469,38);
insert into product(description, price, amount) values ('CPU',325,178);
insert into product(description, price, amount) values ('CPU',255,548);

insert into booking(date, amount, customer_id, product_id) values ('2021-11-20',2,2,2);
insert into booking(date, amount, customer_id, product_id) values ('2021-10-20',10,1,1);
insert into booking(date, amount, customer_id, product_id) values ('2021-11-12',3,4,4);
insert into booking(date, amount, customer_id, product_id) values ('2021-10-20',1,3,1);
insert into booking(date, amount, customer_id, product_id) values ('2021-11-20',1,2,6);
insert into booking(date, amount, customer_id, product_id) values ('2021-11-25',12,2,4);
insert into booking(date, amount, customer_id, product_id) values ('2021-11-26',5,4,3);

-- получить имя того, кто сделал самый большой заказ (по количеству)
select name
from customer
where customer.id=
      (select customer_id
       from booking
       where amount in
             (select max(amount)
              from booking));
-- дата на самый ранний заказ на SSD
select date
from booking
where booking.date=
    (select min(date)
    from booking
    where customer_id=1);
--получить имена и количество заказов
select name, (select count(*) from booking where customer_id=customer.id)
from customer;
--получить имена тех, кто заказал самую дорогую видеокарту
-- имена с минимальными заказами на техику(количество*цену)
-- select name
-- from customer
-- where customer.id=
--           (select customer_id
--           from booking
--           where product_id=
--                 (select id
--                 from product
--                 where price =
--                       (select max(price)
--                       from product)));
