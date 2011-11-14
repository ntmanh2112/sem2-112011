IF EXISTS (SELECT * FROM DBO.SYSOBJECTS WHERE NAME='TR_INSERT_MENU')
BEGIN
	DROP TRIGGER TR_INSERT_MENU
END
GO
CREATE TRIGGER TR_INSERT_MENU ON MENU
FOR INSERT
AS
BEGIN
	-- LAY ID CUA MENU
	DECLARE @MENUID INT
	SELECT @MENUID=MENUID
	FROM INSERTED
	-- LAY ID CUA ROLL ADMIN
	DECLARE @ROLLID INT
	SELECT @ROLLID=ROLLID
	FROM ROLL
	WHERE ROLLNAME='ADMIN'
	-- CAP NHAP QUYEN CHO ADMIN
	INSERT INTO ROLLMENU(MENUID,ROLLID)
	VALUES (@MENUID,@ROLLID)
END

/*
INSERT INTO MENU(MENUID,MENUNAME,MENULINK)
	VALUES(4,'XOA',NULL)
SELECT * FROM MENU
SELECT * FROM ROLLMENU
*/