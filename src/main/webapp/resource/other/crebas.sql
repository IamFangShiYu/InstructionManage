/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/3/20 13:02:18                           */
/*==============================================================*/


drop table if exists CustomerTable;

drop table if exists DeliveryTable;

drop table if exists EvaluateTable;

drop table if exists GoodsTable;

drop table if exists NoticeTable;

drop table if exists OrderTable;

drop table if exists SaleTable;

/*==============================================================*/
/* Table: CustomerTable                                         */
/*==============================================================*/
create table CustomerTable
(
   CustomerId           int(10) not null auto_increment,
   CustomerName         varchar(20),
   CustomerAddr         varchar(20),
   CustomerOther        varchar(1000),
   CustomerTel          int(15),
   CustomerPwd          varchar(20),
   primary key (CustomerId)
);

/*==============================================================*/
/* Table: DeliveryTable                                         */
/*==============================================================*/
create table DeliveryTable
(
   DeliveryId           int(10) not null auto_increment,
   DeliveryName         varchar(20),
   DeliveryTel          int(15),
   DeliveryAddr         varchar(20),
   DeliveryAge          int(3),
   Deliverysex          int(1),
   primary key (DeliveryId)
);

/*==============================================================*/
/* Table: EvaluateTable                                         */
/*==============================================================*/
create table EvaluateTable
(
   EvaluateId           int(10) not null auto_increment,
   OrderId              int(10),
   Evaluateother        varchar(1000),
   EvaluateTime         date,
   primary key (EvaluateId)
);

/*==============================================================*/
/* Table: GoodsTable                                            */
/*==============================================================*/
create table GoodsTable
(
   GoodsId              int(10) not null auto_increment,
   GoodsName            varchar(20),
   GoodsPrice           double(10),
   GoodsOther           varchar(1000),
   primary key (GoodsId)
);

/*==============================================================*/
/* Table: NoticeTable                                           */
/*==============================================================*/
create table NoticeTable
(
   NoticeId             int(10) not null auto_increment,
   SaleId               int(10),
   NoticeName           varchar(50),
   NoticeOther          varchar(100),
   NoticeState          int(2),
   NoticeStartTime      date,
   NoticeEndTime        date,
   primary key (NoticeId)
);

/*==============================================================*/
/* Table: OrderTable                                            */
/*==============================================================*/
create table OrderTable
(
   OrderId              int(10) not null auto_increment,
   SaleId               int(10),
   GoodsId              int(10),
   CustomerId           int(10),
   DeliveryId           int(10),
   Taste                int(10),
   Number               int(10),
   Other                varchar(100),
   money                double(100),
   OrderState           int(2),
   primary key (OrderId)
);

/*==============================================================*/
/* Table: SaleTable                                             */
/*==============================================================*/
create table SaleTable
(
   SaleId               int(10) not null auto_increment,
   SaleName             varchar(20),
   SaleAddr             varchar(50),
   SaleTel              int(20),
   SaleOther            varchar(1000),
   SalePwd              varchar(20),
   primary key (SaleId)
);

alter table EvaluateTable add constraint FK_Reference_7 foreign key (OrderId)
      references OrderTable (OrderId) on delete restrict on update restrict;

alter table NoticeTable add constraint FK_Reference_4 foreign key (SaleId)
      references SaleTable (SaleId) on delete restrict on update restrict;

alter table OrderTable add constraint FK_Reference_1 foreign key (SaleId)
      references SaleTable (SaleId) on delete restrict on update restrict;

alter table OrderTable add constraint FK_Reference_2 foreign key (GoodsId)
      references GoodsTable (GoodsId) on delete restrict on update restrict;

alter table OrderTable add constraint FK_Reference_3 foreign key (CustomerId)
      references CustomerTable (CustomerId) on delete restrict on update restrict;

alter table OrderTable add constraint FK_Reference_6 foreign key (DeliveryId)
      references DeliveryTable (DeliveryId) on delete restrict on update restrict;

