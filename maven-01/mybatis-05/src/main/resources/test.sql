create table `teacher` (
    `id` int(10) not null,
    `name` varchar(30) default null,
    primary key (id)
)engine=innodb default charset=utf8;

insert into teacher(`id`, `name`) values (1, '刘老师');

create table `student` (
    `id` int(10) not null,
    `name` varchar(30) default null,
    `tid` int(10) default null,
    primary key (id),
    key `fktid` (`tid`),
    constraint `fktid` foreign key (`tid`) references `teacher` (`id`)
)engine=innodb default charset=utf8;

insert into student (id, name, tid) values (1, '小明', 1);
insert into student (id, name, tid) values (2, '小红', 1);
insert into student (id, name, tid) values (3, '小花', 1);
insert into student (id, name, tid) values (4, '小李', 1);
insert into student (id, name, tid) values (5, '小刚', 1);