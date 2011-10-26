﻿/*
2/  Tìm kiếm đề án theo nhân viên.
•	Input : MaNV
•	Output:  Danh sách các đề án mà nhân viên đó đã tham gia. Nếu chưa tham gia đề án nào thì thong báo là “Nhân viên này đang ngồi chơi”
•	Process: 
o	Nếu nhân viên đó đã tham gia ít nhất 1 đề án  
	Nếu chưa có table “KetQuaTimKiem” thì tạo mới gồm các field (MaNV,TenNV,MaDA,TenDA,ThoiGian) sau đó insert dữ liệu tìm kiếm được vào table.
	Nếu có rồi thì added them vào cuối giá trị select được.
o	Nếu nhân viên ko tham gia đề án nào thì thong báo kết quả



*/
IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='SP_TIMKIEMNVTHEODA')
BEGIN
	DROP PROCEDURE SP_TIMKIEMNVTHEODA
END
GO
CREATE PROCEDURE SP_TIMKIEMNVTHEODA
	@MANV BIGINT, @KETQUA VARCHAR(50) OUT
AS
BEGIN
	DECLARE @MANVIEN BIGINT,@TENNV NVARCHAR(5),@MADA INT,@MADA2 INT,@MADA3 INT,@TENDA NVARCHAR(20),@TENDA2 NVARCHAR(20),
	@TENDA3 NVARCHAR(20),@THOIGIAN INT,@THOIGIAN2 INT,@THOIGIAN3 INT, @DEM INT, @TONGSODA INT
	IF EXISTS (SELECT A.MANV FROM NHANVIEN AS A INNER JOIN PHANCONG AS B ON A.MANV=B.MA_NVIEN WHERE A.MANV=@MANV)
	BEGIN
		SELECT @DEM=COUNT(*) FROM DBO.SYSOBJECTS WHERE NAME='KETQUATIMKIEM'
		IF @DEM=0
			BEGIN
					CREATE TABLE KETQUATIMKIEM
			(
					MANV		BIGINT,
					TENNV		NVARCHAR(5),
					MADA		INT,
					TENDA		NVARCHAR(20),
					THOIGIAN	INT
					PRIMARY KEY (MANV,MADA)
			)
			END

			SELECT	@TONGSODA=COUNT(*) FROM NHANVIEN AS A
			INNER JOIN PHANCONG AS B ON A.MANV=B.MA_NVIEN
			INNER JOIN DEAN AS C ON C.MADA=B.SODA
			WHERE A.MANV=@MANV
			
					SELECT	@MANVIEN=A.MANV,
					@TENNV=A.TENNV,
					@MADA=C.MADA,
					@TENDA=C.TENDA,
					@THOIGIAN=B.THOIGIAN
				FROM NHANVIEN AS A
				INNER JOIN PHANCONG AS B ON A.MANV=B.MA_NVIEN
				INNER JOIN DEAN AS C ON C.MADA=B.SODA
				WHERE A.MANV=@MANV
			IF @TONGSODA>0
				BEGIN
				INSERT INTO KETQUATIMKIEM(MANV,TENNV,MADA,TENDA,THOIGIAN)
					VALUES(@MANVIEN,@TENNV,@MADA,@TENDA,@THOIGIAN)
				PRINT 'DE AN '+@TENDA+' CO '+@TENNV+' PHU TRACH'
				END
			IF @TONGSODA>1
				BEGIN
				SELECT	@MANVIEN=A.MANV,
					@TENNV=A.TENNV,
					@MADA2=C.MADA,
					@TENDA2=C.TENDA,
					@THOIGIAN2=B.THOIGIAN
				FROM NHANVIEN AS A
				INNER JOIN PHANCONG AS B ON A.MANV=B.MA_NVIEN
				INNER JOIN DEAN AS C ON C.MADA=B.SODA
				WHERE A.MANV=@MANV AND C.MADA<>@MADA
				
				INSERT INTO KETQUATIMKIEM(MANV,TENNV,MADA,TENDA,THOIGIAN)
					VALUES(@MANVIEN,@TENNV,@MADA2,@TENDA2,@THOIGIAN2)
				PRINT 'DE AN '+@TENDA2+' CO '+@TENNV+' PHU TRACH'
				END
			IF @TONGSODA>2
				BEGIN
				SELECT	@MANVIEN=A.MANV,
					@TENNV=A.TENNV,
					@MADA3=C.MADA,
					@TENDA3=C.TENDA,
					@THOIGIAN3=B.THOIGIAN
				FROM NHANVIEN AS A
				INNER JOIN PHANCONG AS B ON A.MANV=B.MA_NVIEN
				INNER JOIN DEAN AS C ON C.MADA=B.SODA
				WHERE A.MANV=@MANV AND C.MADA<>@MADA AND C.MADA<>@MADA2
				
				INSERT INTO KETQUATIMKIEM(MANV,TENNV,MADA,TENDA,THOIGIAN)
					VALUES(@MANVIEN,@TENNV,@MADA3,@TENDA3,@THOIGIAN3)

				PRINT 'DE AN '+@TENDA3+' CO '+@TENNV+' PHU TRACH'
				END
			
			SET @KETQUA=1

		/* VOI DIEU KIEN CUNG FIELD VA KIEU GIU LIEU
			INSERT INTO KETQUATIMKIEM
			SELECT	A.MANV,
					A.TENNV,
					C.MADA,
					C.TENDA,
					B.THOIGIAN
			FROM NHANVIEN AS A
			INNER JOIN PHANCONG AS B ON A.MANV=B.MA_NVIEN
			INNER JOIN DEAN AS C ON C.MADA=B.SODA
			WHERE A.MANV=@MANV
		*/
	END
	ELSE
		BEGIN
			SET @KETQUA=0
			PRINT 'NHAN VIEN NAY DANG NGOI CHOI'
		END
END

DECLARE @HIENTHI VARCHAR
EXEC SP_TIMKIEMNVTHEODA 123123456, @HIENTHI OUT
SELECT @HIENTHI


DROP TABLE KETQUATIMKIEM
SELECT * FROM KETQUATIMKIEM
SELECT * FROM NHANVIEN
SELECT * FROM DEAN
SELECT * FROM PHANCONG

