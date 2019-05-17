
create database if not exists qlythuvien;
use qlythuvien;
create table if not exists sach(
	masach nvarchar(7) not null primary key,
    ten nvarchar(7),
    tacgia nvarchar(7),
    nxb nvarchar(7),
    soluong INT(7)
);
create table if not exists docgia(
	sothe nvarchar(7) not null primary key,
    ten nvarchar(25),
    khoa nvarchar(7),
    khoahoc nvarchar(7),
    thoihanthe date
);

create table if not exists phieumuon(
	masach nvarchar(7),
    sothe nvarchar(7),
    ngaymuon date,
    ngaytra date,
	ghichu text,
    foreign key(masach) references sach(masach)
    on delete cascade,
    foreign key(sothe) references docgia(sothe) 
    on delete cascade,
    constraint phieumuon_pk primary key(masach, sothe)
);


insert into sach
value ('sd01', 'NKTT','TDK','',7),
	  ('sd02', 'NT','HCM','',7),
      ('sd03', 'VN','HCM','',7),
      ('sd04', 'TN','HCM','',7),
      ('sd05', 'DM','HCM','',7);

insert into docgia
value ('sv01','a','ct','','1-21-2018'),
	  ('sv02','b','ct','','1-21-2018'),
      ('sv03','c','ct','','1-21-2018'),
      ('sv04','d','ct','','1-21-2018'),
      ('sv05','e','ct','','1-21-2018');
 
insert into phieumuon
value ('sd01','sv01','ct','','1-21-2018'),
	  ('sd02','sv01','ct','','1-21-2018'),
      ('sd03','sv02','ct','','1-21-2018'),
      ('sd04','sv04','ct','','1-21-2018'),
      ('sd01','sv02','ct','','1-21-2018');