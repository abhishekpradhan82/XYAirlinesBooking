--delete from FLIGHT;
delete from TICKET;
delete from route;
--delete from PLANE;



insert into route (routeId,from_loc_name,to_loc_name) values (1,'KOL','MUM');
insert into route (routeId,from_loc_name,to_loc_name) values (2,'MUM','DEL');
insert into route (routeId,from_loc_name,to_loc_name) values (3,'DEL','KOL');

--insert into PLANE (PLANEID ,CAREAR_NAME ,PLANE_NAME ,NO_OF_SEATS ) values (2000,'XY Airways','Airbus 300' , 300);

/*
insert into FLIGHT (FLIGHT_ID , PLANEID , ROUTE_ID  , FLIGHT_NAME, FLIGHT_START_DATE_TIME , FLIGHT_END_DATE_TIME  ,FLIGHT_PRICE )  
values (100, 2000, 1 ,  'XY1000', '2019-07-15 07:30' , '2019-07-15 11:00' , 1999.50);
insert into FLIGHT (FLIGHT_ID , PLANEID , ROUTE_ID  , FLIGHT_NAME, FLIGHT_START_DATE_TIME , FLIGHT_END_DATE_TIME  ,FLIGHT_PRICE )  
values (101, 2000, 2 ,  'XY1010', '2019-07-15 11:30' , '2019-07-15 14:00' , 3999.50);
insert into FLIGHT (FLIGHT_ID , PLANEID , ROUTE_ID  , FLIGHT_NAME, FLIGHT_START_DATE_TIME , FLIGHT_END_DATE_TIME  ,FLIGHT_PRICE )  
values (102, 2000, 3 ,  'XY1020', '2019-07-15 15:30' , '2019-07-15 19:00' , 2999.50);
*/

insert into TICKET (TICKET_ID , FLIGHT_ID ,PGR_FULL_NM ,TICKET_PRICE ,TICKET_STATUS ) values (700, 100,'Abhishek Pradhan',7000,'booked');