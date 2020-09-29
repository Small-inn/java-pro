create table blog (
    id varchar(50) not null comment '博客ID',
    title varchar(100) not null comment '博客标题',
    author varchar(20) not null comment '博客作者',
    create_time datetime not null comment '创建时间',
    views int(30) not null comment '浏览量'
)engine=innodb default charset=utf8;