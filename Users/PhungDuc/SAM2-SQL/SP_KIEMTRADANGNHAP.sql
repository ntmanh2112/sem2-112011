--  PROCEDURE KIEMTRADANGNHAP
IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME ='KIEMTRADANGNHAP')
BEGIN
	DROP PROCEDURE KIEMTRADANGNHAP		
END
GO
CREATE PROCEDURE KIEMTRADANGNHAP
	@TENDN NVARCHAR(15), @MATKHAU NVARCHAR(15) , @KETQUA INT OUT
AS
BEGIN
	IF EXISTS (SELECT * FROM THANHVIEN WHERE TENDN=@TENDN AND MATKHAU=@MATKHAU)
	BEGIN
		SET @KETQUA = 1 
		PRINT 'TON TAI THANH VIEN NAY'
	END
	ELSE
	BEGIN
		SET @KETQUA = 0
		PRINT 'KHONG TON TAI'
	END
END

DECLARE @SUM INT
EXEC KIEMTRADANGNHAP 'THIENVD','THIENVD', @SUM OUT
SELECT @SUM AS 'KET QUA DANG NHAP'




-- DROP PROCEDURE SP_TONG
CREATE PROCEDURE SP_TONG
	@SO1 INT, @SO2 INT, @TONG INT OUT
AS
BEGIN 
	SET @TONG = @SO1 +@SO2;
END

ALTER PROCEDURE SP_TONG
	@SO1 INT, @SO2 INT , @TICH INT OUT
AS
BEGIN
	SET @TICH = @SO1 *@SO2;
END


DECLARE @SUM INT
EXEC SP_TONG 4 , 2 , @SUM OUT
SELECT @SUM
