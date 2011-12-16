--quy tắc khóa ngoại :
--duy nhất 1 bên là khóa chính còn lại là khóa ngoại
--bên nào là khòa chính thì vai trò là 1 => nhiều

--quan hệ nhìu nhìu phải có 1 trung gian là động từ (phân công)
--qh nhìu nhìu tự tách ra qh 1 => nhìu || 
--động từ luôn là chức năng nhìu

--nhập liệu logic: 
--ưu tiên những table lẻ loi không có quan hệ với các bảng còn lại
--  +1 tăng 1 , vô cùng nhìu trừ 1
-- ưu tiên tiếp cho cộng số cao nhất
-- xóa bỏ các mối dây qh với các table vừa nhập
-- tính lại điễm số của các table có liên quan với table vừa nhập
-- tiếp tục cho các table còn lại

---CREATE DATABASE 

GO
----------------------------------------------------------------------------------------
--DROP ALL CONSTRAINT BETWEEN TABLES BE 4 CREATE TABLE
USE [QUANLYDEANCONGTY]
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_DIADIEMPGH_PHONGBAN]') AND parent_object_id = OBJECT_ID(N'[dbo].[DIADIEM_PHG]'))
ALTER TABLE [dbo].[DIADIEM_PHG] DROP CONSTRAINT [FK_DIADIEMPGH_PHONGBAN]
GO
USE [QUANLYDEANCONGTY]
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_PHANCONG_DEAN]') AND parent_object_id = OBJECT_ID(N'[dbo].[PHANCONG]'))
ALTER TABLE [dbo].[PHANCONG] DROP CONSTRAINT [FK_PHANCONG_DEAN]
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_PHANCONG_NHANVIEN]') AND parent_object_id = OBJECT_ID(N'[dbo].[PHANCONG]'))
ALTER TABLE [dbo].[PHANCONG] DROP CONSTRAINT [FK_PHANCONG_NHANVIEN]
GO
USE [QUANLYDEANCONGTY]
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_PHONGBAN_NHANVIEN]') AND parent_object_id = OBJECT_ID(N'[dbo].[PHONGBAN]'))
ALTER TABLE [dbo].[PHONGBAN] DROP CONSTRAINT [FK_PHONGBAN_NHANVIEN]
GO
USE [QUANLYDEANCONGTY]
GO
IF  EXISTS (SELECT * FROM sys.foreign_keys WHERE object_id = OBJECT_ID(N'[dbo].[FK_THANNHAN_NHANVIEN]') AND parent_object_id = OBJECT_ID(N'[dbo].[THANNHAN]'))
ALTER TABLE [dbo].[THANNHAN] DROP CONSTRAINT [FK_THANNHAN_NHANVIEN]
GO

----------------------------------------------------------------------------------------
--NOW BEGIN CREATE EACH TABLE

USE [QUANLYDEANCONGTY]
GO
/****** Object:  Table [dbo].[DEAN]    Script Date: 04/06/2009 12:48:25 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[DEAN]') AND type in (N'U'))
DROP TABLE [dbo].[DEAN]

--
CREATE TABLE DEAN
(
	TENDA NVARCHAR(20) ,
	MADA INT primary key,
	DDIEM_DA NVARCHAR(20) ,
	PHONG INT ,
)

------------------------------------------------------------------------------------------

USE [QUANLYDEANCONGTY]
GO
/****** Object:  Table [dbo].[DIADIEM_PHG]    Script Date: 04/06/2009 12:46:22 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[DIADIEM_PHG]') AND type in (N'U'))
DROP TABLE [dbo].[DIADIEM_PHG]
--

CREATE TABLE DIADIEM_PHG
(
	MAPHG INT ,
	DIADIEM NVARCHAR(20) ,
)

-----------------------------------------------------------------------------------------

USE [QUANLYDEANCONGTY]
GO
/****** Object:  Table [dbo].[NHANVIEN]    Script Date: 04/06/2009 13:07:49 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[NHANVIEN]') AND type in (N'U'))
DROP TABLE [dbo].[NHANVIEN]
--
CREATE TABLE NHANVIEN
(
	HONV NVARCHAR(20) ,
	TENLOT NVARCHAR(20) ,
	TENNV NVARCHAR(20) ,
	MANV INT PRIMARY KEY,
	NGSINH DATETIME ,
	DCHI NVARCHAR(100) ,
	PHAI NVARCHAR(5),
	LUONG INT ,
	MA_NQL INT ,
	PHG INT,	
)

-------------------------------------------------------------------------------------------

USE [QUANLYDEANCONGTY]
GO
/****** Object:  Table [dbo].[THANHVIEN]    Script Date: 04/06/2009 12:54:21 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[THANHVIEN]') AND type in (N'U'))
DROP TABLE [dbo].[THANHVIEN]
--
CREATE TABLE THANHVIEN
(
	ID			INT IDENTITY(1,1) PRIMARY KEY,
	TENDN		NVARCHAR(30),
	MATKHAU		NVARCHAR(30) ,
	VAITRO		INT ,
	GHICHU		NVARCHAR(100)
)

-------------------------------------------------------------------------------------------

USE [QUANLYDEANCONGTY]
GO
/****** Object:  Table [dbo].[PHONGBAN]    Script Date: 04/06/2009 12:54:21 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[PHONGBAN]') AND type in (N'U'))
DROP TABLE [dbo].[PHONGBAN]
--
CREATE TABLE PHONGBAN
(
	TENPHG NVARCHAR(20),
	MAPHG INT PRIMARY KEY,
	TRPHG INT ,
	NG_NHANCHUC DATETIME ,
)

----------------------------------------------------------------------------------------
USE [QUANLYDEANCONGTY]
GO
/****** Object:  Table [dbo].[THANNHAN]    Script Date: 04/06/2009 13:14:03 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[THANNHAN]') AND type in (N'U'))
DROP TABLE [dbo].[THANNHAN]
--
CREATE TABLE THANNHAN
(
	MA_NVIEN INT ,
	TENTN NVARCHAR(20) ,
	PHAI NVARCHAR(5) ,
	NGSINH DATETIME ,
	QUANHE NVARCHAR(20),
)

----------------------------------------------------------------------------------------
USE [QUANLYDEANCONGTY]
GO
/****** Object:  Table [dbo].[PHANCONG]    Script Date: 04/06/2009 13:14:28 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[PHANCONG]') AND type in (N'U'))
DROP TABLE [dbo].[PHANCONG]
--
CREATE TABLE PHANCONG
(
	MA_NVIEN INT ,
	SODA INT ,
	THOIGIAN INT
)

--------------------------------------------------------------------------------------
--TOO MUCH FORE KEY NOW INSERT DATA FIRST SET FORE KEY LATER

--INSERT DATA THANHVIEN
INSERT INTO THANHVIEN VALUES('ThienVD','ThienVD',0,'')
INSERT INTO THANHVIEN VALUES('ToanTT','ToanTT',1,'')
INSERT INTO THANHVIEN VALUES('TuanHQ','TuanHQ',2,'')
INSERT INTO THANHVIEN VALUES('PhuongTQ','PhuongTQ',3,'')

--INSERT DATA DEAN

INSERT INTO DEAN VALUES
('SAN PHAM Y',2,'NHA TRANG',1)

INSERT INTO DEAN VALUES
('SAN PHAM Z',3,'TP HCM',5)

INSERT INTO DEAN VALUES
('SAN PHAM X',5,'VUNG TAU',1)

INSERT INTO DEAN VALUES
('TIN HOC HOA',10,'HA NOI',4)

INSERT INTO DEAN VALUES
('Hoa Hoc',40,'Bien Hoa',5)

--INSERT DATA DIADIEM_PHG


INSERT INTO DIADIEM_PHG VALUES  
(1,'VUNG TAU')

INSERT INTO DIADIEM_PHG VALUES
(2,'TP HCM')

INSERT INTO DIADIEM_PHG VALUES
(3,'NHA TRANG')

INSERT INTO DIADIEM_PHG VALUES
(4,'TP HCM')

INSERT INTO DIADIEM_PHG VALUES
(5,'HA NOI')

INSERT INTO DIADIEM_PHG VALUES
(5,'TP HCM')

--INSERT DATA NHANVIEN

INSERT INTO NHANVIEN
VALUES ('CAO','SI','KI',123123456,09/08/1986,'123 Le Loi Q1 TpHCM','Nam',15000,NULL,NULL)

INSERT INTO NHANVIEN VALUES 
('DINH','BA','TIEN',123456789,09/01/1955,'731 Tran Hung Dao Q1 TpHCM','Nam',30000,123456789,5)

INSERT INTO NHANVIEN VALUES 
('TRUONG','LE','DOAN',147852369,15/05/1986,'22/41/2 Le Van Tho F11 Go Vap','Nu',16500,147852369,1)

INSERT INTO NHANVIEN VALUES 
('NGUYEN','THANH','TUNG',333445555,08/12/1945,'638 Nguyen Van Cu Q5 TpHCM','Nam',40000,NULL,5)

INSERT INTO NHANVIEN VALUES 
('LE','HUYNH','DUC',666884444,01/06/1986,'126 Nguyen Van Cu Q5 TpHcm','Nam',27000,666884444,1)

INSERT INTO NHANVIEN VALUES 
('VUONG','NGOC','QUYEN',888665555,15/09/1965,'414 NO TRANG LONG Q BINH THANH TPHCM','Nam',29400,999887777,4)

INSERT INTO NHANVIEN VALUES 
('LE','THI','NHAN',987654321,20/06/1931,'291 Ho Van Hue Qphu Nhuan TpHCM','Nu',43000,NULL,5)

INSERT INTO NHANVIEN VALUES 
('VO','DUC','MINH',987987987,16/09/1985,'414 NO TRANG LONG Q BINH THANH TPHCM','Nam',30000,NULL,5)

INSERT INTO NHANVIEN VALUES 
('BUI','THUY','VU',999887777,19/07/1958,'332 Nguyen Thai Hoc Q1 TpHCM','Nam',25000,NULL,4)

--INSERT DATA PHONGBAN

INSERT INTO PHONGBAN VALUES
('Quan ly',1,666884444,19/06/1971)

INSERT INTO PHONGBAN VALUES
('Tổ Chức',2,987987987,15/01/2001)

INSERT INTO PHONGBAN VALUES 
('THIEU 1 PHONG',3,888665555,12/3/2002)

INSERT INTO PHONGBAN VALUES
('Dieu hanh',4,123456789,01/01/1985)

INSERT INTO PHONGBAN VALUES
('Nghien cuu',5,333445555,22/05/1978)

--INSERT DATA THANNHAN

INSERT INTO THANNHAN VALUES
(333445555,'Chau Long','Nam',02/01/2005,'CHONG')

INSERT INTO THANNHAN VALUES
(333445555,'KHANG','NAM',25/10/1973,'CON TRAI')

INSERT INTO THANNHAN VALUES
(333445555,'Ngoc Phi','NU',05/04/1976,'CON GAI')

INSERT INTO THANNHAN VALUES
(987654321,'DANG','NAM',29/02/1932,'VO CHONG')

INSERT INTO THANNHAN VALUES
(999887777,'Toan','NAM',02/01/1986,'CHONG')

--INSERT DATA PHANCONG

INSERT INTO PHANCONG VALUES
(123123456,2,NULL)
INSERT INTO PHANCONG VALUES
(123123456,40,NULL)
INSERT INTO PHANCONG VALUES
(123456789,40,10.00)
INSERT INTO PHANCONG VALUES
(147852369,40,NULL)
INSERT INTO PHANCONG VALUES
(333445555,2,NULL)
INSERT INTO PHANCONG VALUES
(333445555,40,NULL)
INSERT INTO PHANCONG VALUES
(666884444,40,NULL)
INSERT INTO PHANCONG VALUES
(888665555,2,NULL)
INSERT INTO PHANCONG VALUES
(987654321,40,NULL)
INSERT INTO PHANCONG VALUES
(987987987,40,NULL)
INSERT INTO PHANCONG VALUES
(999887777,40,NULL)


---------------------------------------
---------------------------------------
--NOW SET FORE KEY
--1.PHONGBAN
--2.NHANVIEN
--3.THANNHAN
--4.DEAN
--5.PHANCONG
--6.DIADIEM
--set khóa ngoại foreign key
--KHỞI NGUỒN (SO 1) : PHÒNG BAN

ALTER TABLE DEAN ADD CONSTRAINT FK_DEAN_PHONGBAN
FOREIGN KEY (PHONG) REFERENCES PHONGBAN(MAPHG)

--LƯU Ý SỐ NHIỀU LÀ FORE KEY : DEAN.PHONG
--SỐ 1 LÀ MÃ PHÒNG PRI KEY : PHONGBAN.MAPHG

ALTER TABLE DIADIEM_PHG ADD CONSTRAINT FK_DIADIEMPGH_PHONGBAN
FOREIGN KEY (MAPHG) REFERENCES PHONGBAN(MAPHG)

ALTER TABLE NHANVIEN ADD CONSTRAINT FK_NHANVIEN_PHONGBAN
FOREIGN KEY (PHG) REFERENCES PHONGBAN(MAPHG)

--KHỞI NGUỒN : NHÂN VIÊN

ALTER TABLE PHANCONG ADD CONSTRAINT FK_PHANCONG_NHANVIEN
FOREIGN KEY (MA_NVIEN) REFERENCES NHANVIEN(MANV) 

ALTER TABLE PHONGBAN ADD CONSTRAINT FK_PHONGBAN_NHANVIEN
FOREIGN KEY (TRPHG) REFERENCES NHANVIEN(MANV)

ALTER TABLE THANNHAN ADD CONSTRAINT FK_THANNHAN_NHANVIEN
FOREIGN KEY (MA_NVIEN) REFERENCES NHANVIEN(MANV)

ALTER TABLE NHANVIEN ADD CONSTRAINT FK_NHANVIEN_NHANVIEN_1
FOREIGN KEY (MA_NQL) REFERENCES NHANVIEN(MANV)

--LƯU Ý KHÔNG NGƯỢC CHIỀU VÌ MANV ĐÃ LÀ PRI KEY

--KHỞI NGUỒN : ĐỀ ÁN

ALTER TABLE PHANCONG ADD CONSTRAINT FK_PHANCONG_DEAN
FOREIGN KEY (SODA) REFERENCES DEAN(MADA)

-----------------------------------------------------------------------------------
-----------------------------------------------------------------------------------
--B/C HAVE TOO MUCH DATA RELATE TO FORE KEY
--MUST INSERT DATA RELATE TO FORE KEY 1ST (FIND PRIKEY AND FORE KEY)
-----------------------------------------------------------------------------------
-----------------------------------------------------------------------------------

/*

--1.1--	Tim nhung nhan vien lam viec o phong so 4
SELECT *
FROM NHANVIEN
WHERE PHG = 4

--1.2	Tim nhung nhan vien muc luong tren 30000
SELECT *
FROM NHANVIEN
WHERE LUONG > 30000

--1.3.	Tim cac nhan vien co muc luong tren 25000 o phong 4 
--hoac cac nhan vien tren 30000 o phong 5
SELECT *
FROM NHANVIEN
WHERE	LUONG > 25000 AND PHG = 4
		OR LUONG > 30000 AND PHG = 5

--1.4.	Cho biet ho ten day du cua cac nhan vien o thanh pho ho chi minh
SELECT HONV,TENLOT,TENNV
FROM NHANVIEN
WHERE	DCHI = '%TPHCM%'

--1.5.	Cho biet ngay sinh va dia chi cua nhan vien dinh ba tien

SELECT NGSINH,DCHI
FROM NHANVIEN
WHERE	HONV = 'DINH' AND
		TENLOT = 'BA' AND
		TENNV = 'TIEN'

--2.1.	Voi moi phong ban, cho biet ten phong ban va dia diem phong
--C2
SELECT	PHONGBAN.TENPHG,DIADIEM_PHG.DIADIEM
FROM	PHONGBAN,DIADIEM_PHG
WHERE	PHONGBAN.MAPHG = DIADIEM_PHG.MAPHG

--C2
SELECT	*
FROM	PHONGBAN AS  A,DIADIEM_PHG AS B
WHERE	A.MAPHG = B.MAPHG

--DATE 05-04-09 FIXED ! END HERE
-------------------------------------------------------------------------------

--2.2.	Tim ten nhung nguoi truong phong cua tung phong ban
SELECT HONV,TENLOT,TENNV,TRPHG
FROM PHONGBAN,NHANVIEN
WHERE	NHANVIEN.MA_NQL = PHONGBAN.TRPHG

--2.3.	Tim tenda, mada,ddiem_da,phong, tenphg, maphg, trphg,ng_nhanchuc
SELECT TENDA,MADA,DDIEM_DA,PHONG,TENPHG,MAPHG,TRPHG,NG_NHAMCHUC
FROM PHONGBAN,DEAN
WHERE DEAN.PHG = PHONGBAN.MAPHG

--2.4.	Tim ten va dia chi cua tat ca cac nhan vien phong 'nghien  cuu'
SELECT HONV,TENLOT,TENNV,DCHI
FROM NHANVIEN,PHONGBAN
WHERE	PHONGBAN.TENPHG = 'Nghien cuu' AND
		PHONGBAN.MAPHG = NHANVIEN.PHG

--2.5.	Tim ten nhung nu nhan vien va ten nguoi than cua ho
SELECT HONV,TENLOT,TENNV,TENTN
FROM NHANVIEN,THANNHAN
WHERE NHANVIEN.PHAI = 'Nu'


--2.6.	Voi moi de an o ha noi , liet ke cac ma so de an(mada)
--maso phong ban chu tri de an (phong)
--ho ten truong phong(hovn,tenlot,tennv) 
--cung nhu dchi va ngay sinh cua nguoi ay
SELECT MADA,MAPHG,HONV,TENLOT,TENNV,TRPHG,DCHI,NGSINH
FROM PHONGBAN,DEAN,NHANVIEN
WHERE	DEAN.DDIEM_DA = 'HA NOI' AND
		PHONGBAN.MAPHG = NHANVIEN.PHG AND
		PHONGBAN.MAPHG = DEAN.PHONG

--2.7.	Voi moi nhan vien, cho biet ho ten nhan vien 
--va ho ten nguoi quan ly truc tiep cua nhan vien do
SELECT HONV,TENLOT,TENNV,TRPHG,MANV
FROM PHONGBAN,NHANVIEN
WHERE MANV=TRPHG

--2.8.	Voi moi nhan vien cho biet ho ten nhan vien 
--va ho ten truong phong cua phong ban ma nhan vien do lam viec

SELECT HONV,TENLOT,TENNV,TRPHG,MANV
FROM PHONGBAN,NHANVIEN

--2.9.	Ten nhung nhan vien phong so 5 co tham gia vao de an "san pham x" 
--va nhan vien nay do " nguyen thanh tung " quan ly truc tiep

SELECT HONV,TENLOT,TENNV,TRPHG,MANV
FROM NHANVIEN,DEAN,PHONGBAN
WHERE	PHG = 5 AND
		TENDA = 'SAN PHAM X'
		
(SELECT MANV
		FROM NHANVIEN
			HONV = 'NGUYEN' AND
			TENLOT = 'THANH' AND
			TENNV = 'TUNG')
*/

--LUU Y 1 SO DIEU CAN HOI :
--1.MAPHG.PHONGBAN LA PRI : THIEU SO 3 DE BEN DIAFIEM_PHG CO FORE KEY LA DIEDIEMPHG.MAPHG =3
--2.KHI THAY DOI VALUE TREN THI PHAI ADD THEM PHONGBAN.TRPHG = 1 NGUOI TREN NHANVIEN.MANV .