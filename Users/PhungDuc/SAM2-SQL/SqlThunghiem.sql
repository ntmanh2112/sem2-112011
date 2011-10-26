USE QLNV_SCRIPT
--I.Các câu đơn giản:
--1.	Tim nhung nhan vien lam viec o phong so 4
SELECT * FROM NHANVIEN	WHERE PHG=4
--2.	Tim nhung nhan vien muc luong tren 30000
SELECT * FROM NHANVIEN WHERE luong >=30000
--3.	Tim cac nhan vien co muc luong tren 25000 o phong 4 hoac cac nhan vien tren 30000 o phong 5
select * from nhanvien where luong >25000 and phg=4
select * from nhanvien where luong >30000 and phg=5
--4.	Cho biet ho ten day du cua cac nhan vien o thanh pho ho chi minh
select honv,tenlot,tennv,dchi from nhanvien where dchi like '%tphcm%'
--5.	Cho biet ngay sinh va dia chi cua nhan vien dinh ba tien
select ngsinh,dchi from nhanvien where honv='dinh' and tenlot='ba' and tennv='tien'

select cast(datepart (day, ngsinh) as varchar) +'/' + cast(datepart (month, ngsinh) as varchar) +'/'+ cast (datepart (year, ngsinh) as varchar) as 'ngaysinh' from nhanvien

select * from nhanvien where honv+' '+tenlot+' '+tennv='DINH BA TIEN'

--II . Phép kết :
--1.	Voi moi phong ban, cho biet ten phong ban va dia diem phong
select phongban.tenphg,diadiem_PHG.diadiem 
from diadiem_PHG inner join phongban 
on diadiem_PHG.maphg = phongban.maphg
--2.	Tim ten nhung nguoi truong phong cua tung phong ban
select phongban.tenphg,nhanvien.honv,nhanvien.tenlot,nhanvien.tennv 
from nhanvien inner join phongban 
on nhanvien.manv=phongban.trphg

select phongban.tenphg,nhanvien.honv+' '+nhanvien.tenlot+' '+nhanvien.tennv as 'Ten Truong Phong'
from phongban inner join nhanvien
on nhanvien.manv=phongban.trphg

--3.	Tim tenda, mada,ddiem_da,phong, tenphg, maphg, trphg,ng_nhanchuc
select dean.tenda,dean.mada,dean.ddiem_da,dean.phong,nhanvien.honv+' '+nhanvien.tenlot+' '+nhanvien.tennv as 'ten truong phong',phongban.ng_nhanchuc
from dean inner join phongban
on dean.phong=phongban.maphg
inner join nhanvien
on phongban.trphg=nhanvien.manv

--4.	Tim ten va dia chi cua tat ca cac nhan vien phong 'nghien  cuu'
select * from nhanvien where phg in(select maphg from phongban where tenphg='nghien cuu')

select honv+' '+tenlot+' '+tennv as 'ten nhan vien',dchi from nhanvien
inner join phongban
on nhanvien.phg=phongban.maphg
where phongban.tenphg='nghien cuu'

--5.	Tim ten nhung nu nhan vien va ten nguoi than cua ho
select nhanvien.tennv,thannhan.tentn
from nhanvien
inner join thannhan
on thannhan.ma_nvien=nhanvien.manv
where nhanvien.phai='nu'

--6.	Voi moi de an o ha noi , liet ke cac ma so de an(mada), maso phong ban chu tri de an (phong), ho ten truong phong(hovn,tenlot,tennv) cung nhu dchi va ngay sinh cua nguoi ay
select nhanvien.honv,nhanvien.tenlot,nhanvien.tennv,nhanvien.dchi,nhanvien.ngsinh
from nhanvien,(select mada,phong from dean where ddiemda='ha noi') as temp
where nhanvien.phg=temp.phong

select * from dean

select dean.mada,dean.phong,nhanvien.honv+' '+nhanvien.tenlot+' '+nhanvien.tennv as 'tentrphg',nhanvien.dchi,nhanvien.ngsinh
from dean inner join phongban
on phongban.maphg=dean.phong
inner join nhanvien
on nhanvien.manv=phongban.trphg
where dean.ddiem_da='ha noi'


--7.	Voi moi nhan vien, cho biet ho ten nhan vien va ho ten nguoi quan ly truc tiep cua nhan viendo
select * from nhanvien
select * from phongban

select nhanvien.tennv from nhanvien inner join phongban on nhanvien.ma_NQL=phongban.trphg

select a.tennv,b.tennv as 'nguoiquanli' from nhanvien as a
inner join nhanvien as b
on a.ma_nql = b.manv

-- 8.	Voi moi nhan vien cho biet ho ten nhan vien va ho ten truong phong cua phong ban ma nhan vien do lam viec
select * from nhanvien

select * from phongban

select phongban.trphg,nhanvien.honv,nhanvien.tennv from nhanvien,phongban where nhanvien.manv=phongban.trphg

select a.tennv,b.tennv as 'truongphong' from nhanvien as a inner join phongban
on a.phg = phongban.maphg
inner join nhanvien as b
on b.manv=phongban.trphg

select nhanvien.tennv, nhanvien.manv,phongban.trphg,b.tennv as 'truongphong' from nhanvien 
inner join phongban 
on nhanvien.phg=phongban.maphg
inner join nhanvien as b
on b.manv=phongban.trphg

--9.	Ten nhung nhan vien phong so 5 co tham gia vao de an "san pham y" 
select * from dean
select * from phancong
select honv+' '+tenlot+' '+tennv as 'ho ten nhanvien' from nhanvien 
inner join phancong on phancong.ma_nvien=nhanvien.manv
inner join dean on phancong.soda=dean.mada
where dean.tenda='san pham y' and nhanvien.phg =5

--III. Gom nhóm:
--1.	Cho biet ten nhan vien va ten cac de an ma nhan vien ay tham gia

select nhanvien.honv+' '+nhanvien.tenlot+' '+nhanvien.tennv as 'hoten',dean.tenda from nhanvien 
inner join phancong on phancong.ma_nvien=nhanvien.manv
inner join dean on phancong.soda=dean.mada
order by dean.tenda
--2.	Voi moi de an liet ke ten de an va tong so gio lam viec mot tuan cua tat ca cac nhan vien  tham du de an do
select soda,sum(thoigian) from phancong group by soda

select dean.tenda,sum(phancong.thoigian) as 'tongthoigian' from dean 
inner join phancong on dean.mada=phancong.soda
group by dean.tenda

--3.	Voi moi nhan vien cho biet ho va ten nhan vien va nhan vien do co bao nhieu than nhan
/*
count,min,max,sum,avg
*/
select * from thannhan

select nhanvien.tennv,count(thannhan.ma_nvien) as 'sothannhan' from nhanvien
left join thannhan on nhanvien.manv=thannhan.ma_nvien 
group by nhanvien.tennv order by sothannhan desc

--4.	Voi moi phong ban liet ke ten phong ban( tenphg) va luong trung binh cua nhung nhan vien lam viec cho phong ban do
-- ISNULL (TENNHOM, 'GIA TRI TRA VE')
select * from phongban

select phongban.tenphg,ISNULL (avg(nhanvien.luong),0) as 'luongtrungbinh' from phongban
LEFT join nhanvien on phongban.maphg= nhanvien.phg
group by phongban.tenphg
order by luongtrungbinh desc
--5.	Luong trung binh cua tat ca cac nu nhan vien

select avg(nhanvien.luong)as 'luongnhanviennu' from nhanvien
where phai='nu'

--6.	Voi cac phong ban co muc luong trung binh tren 30000, liet ke ten phong ban va so luong nhan vien
select phongban.tenphg,count(nhanvien.manv) as 'tongnhanvien' from phongban
inner join nhanvien
on nhanvien.phg=phongban.maphg
where phongban.maphg in(
select phongban.maphg from phongban
inner join nhanvien on phongban.maphg=nhanvien.phg
group by phongban.maphg
having  avg(nhanvien.luong)>30000)
group by phongban.tenphg



SELECT A.TENPHG,COUNT(B.MANV) AS 'TONGNHANVIEN'
FROM PHONGBAN AS A 
INNER JOIN NHANVIEN AS B ON A.MAPHG=B.PHG
GROUP BY A.TENPHG
HAVING AVG(B.LUONG) >30000
--IV . Truy vấn lồng nhau :
--1.	Cho biet danh sach cac de an (MaDa) co:+ nhan cong voi voi ( HoNV) la 'Dinh' hoac + co nguoi truong phong chu tri de an voi ho (honv) la 'dinh'
select dean.mada
from dean
inner join phancong on dean.mada=phancong.soda
inner join nhanvien on nhanvien.manv=phancong.ma_nvien
where nhanvien.honv ='dinh' or nhanvien.manv in 
(select manv from nhanvien inner join phongban on phongban.trphg=nhanvien.manv where nhanvien.honv='dinh')
--2.	Danh sach nhung nhan vien ( honv, tenlot, tennv) co tren 2 than nhan
select honv,tenlot,tennv from nhanvien
where manv in(
select nhanvien.manv from nhanvien
inner join thannhan on nhanvien.manv=thannhan.ma_nvien 
group by nhanvien.manv
having count(thannhan.tentn)>2)

--3.	Danh sach nhung nhan vien ( honv, tenlot, tennv) khong co than nhan nao
select honv,tenlot,tennv from nhanvien
where manv in(
select nhanvien.manv from nhanvien
except
select nhanvien.manv from nhanvien
inner join thannhan on nhanvien.manv=thannhan.ma_nvien 
group by nhanvien.manv)

--4.	Danh sach truong phong co toi thieu 1 than nhan

select nhanvien.tennv from nhanvien
inner join phongban
on nhanvien.manv=phongban.trphg
inner join thannhan
on nhanvien.manv=thannhan.ma_nvien
group by nhanvien.tennv
--5.	Tim ho (HONV) cua nhung truong phong chua co gia dinh
select * from nhanvien
where manv in (
select trphg from phongban
except
select nhanvien.manv from nhanvien
inner join phongban
on nhanvien.manv=phongban.trphg
inner join thannhan
on nhanvien.manv=thannhan.ma_nvien
group by nhanvien.manv)
