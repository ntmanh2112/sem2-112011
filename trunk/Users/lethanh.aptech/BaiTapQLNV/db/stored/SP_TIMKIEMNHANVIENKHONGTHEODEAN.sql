IF EXISTS ( SELECT * FROM dbo.sysobjects WHERE NAME = 'SP_TIMKIEMNHANVIENKHONGTHEODEAN')
BEGIN
	DROP PROC SP_TIMKIEMNHANVIENKHONGTHEODEAN
END
GO
CREATE PROC SP_TIMKIEMNHANVIENKHONGTHEODEAN
	@MADEAN INT
AS 
BEGIN
	IF EXISTS (SELECT * FROM DEAN WHERE MADA = @MADEAN)
	BEGIN
		SELECT * FROM NHANVIEN
		WHERE MANV NOT IN (
			SELECT A.MANV
			FROM NHANVIEN AS A 
			INNER JOIN PHANCONG AS B ON A.MANV = B.MA_NVIEN
			WHERE B.SODA = @MADEAN
			)
	END
END
	