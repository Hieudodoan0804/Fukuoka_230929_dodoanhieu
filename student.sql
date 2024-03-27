create database student;
use student;
create table student(
	student_id int primary key,
	address varchar(255),
    brithday date,
    image_url varchar(255),
    phone_number varchar(15),
    sex bit(1),
    student_name varchar(100)
    
);
