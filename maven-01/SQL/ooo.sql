CREATE TABLE  T_LX_PRODUCT_CONFIG (
     ID NUMBER primary key NOT NULL,
     PRODUCT_ID VARCHAR2(255) ,
     PRODUCT_NAME VARCHAR2(255),
     SEND_START_TIME VARCHAR2(50),
     SAVE_START_TIME VARCHAR2(50),
     SOURCE_TYPE NUMBER DEFAULT 1,
     CREATE_TIME TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP,
     UPDATE_TIME TIMESTAMP(6) DEFAULT current_timestamp
)


comment on table T_LX_PRODUCT_CONFIG is '险种配置表';
comment on column T_LX_PRODUCT_CONFIG.ID is '自增ID';
comment on column T_LX_PRODUCT_CONFIG.PRODUCT_ID  is '险种代码';
comment on column T_LX_PRODUCT_CONFIG.PRODUCT_NAME  is '险种名称';
comment on column T_LX_PRODUCT_CONFIG.SEND_START_TIME  is '开始推送时间';
comment on column T_LX_PRODUCT_CONFIG.SAVE_START_TIME  is '开始保存时间';
comment on column T_LX_PRODUCT_CONFIG.SOURCE_TYPE  is '来源类型 1：MQ';


create sequence SEQ_product_config
increment by 1
start with 1
minvalue 1
maxvalue 999999999999
order
cache 20
cycle;


SELECT * FROM ( SELECT ROWNUM rowno, p.* FROM T_LX_PRODUCT_CONFIG P WHERE PRODUCT_ID = '1' AND PRODUCT_NAME = '1' AND ROWNUM <= 10 ) t WHERE t.rowno >= 1




INSERT INTO T_LX_PRODUCT_CONFIG
(ID, PRODUCT_ID, PRODUCT_NAME, SEND_START_TIME, SAVE_START_TIME, SOURCE_TYPE)
VALUES
(2, 12, '发的说法', '292012', '21323213', 1)