create database eproject
go

use eproject
go

create table location(
	locationID int primary key identity,
	locationName nvarchar(200) unique
)
--drop table location
create table department(
	departmentID int primary key identity,
	departmentName nvarchar(200),
	locationID int references location(locationID),
	unique(departmentName, locationID)
)

create table project(
	projectID int primary key identity,
	projectName nvarchar(200) unique,
	createDate date,
	endDate date
)

--drop table employee
create table employee(
	employeeID int primary key identity,
	employeeNumber varchar(20) unique not null,
	employeeName nvarchar(200) not null,
	email varchar(100) unique not null,
	salary float,
	birthday date ,
	[address] nvarchar(200),
	[password] varchar(50) not null,	
	[role] nvarchar(100), 
	workExperience int,
	gender bit,
	departmentID int references department(departmentID),
	projectID int references project(projectID)
)

create table transferType(
	transferTypeID int primary key,
	transferTypeName nvarchar(200) not null unique
)
insert into transferType(transferTypeID, transferTypeName) 
values(1, 'Project Transfer'), (2, 'Department Transfer'), (3, 'Location Transfer'), (4, 'Custom Transfer')

--drop table [transfer]
create table [transfer](
	transferID int primary key identity,
	transferTypeID int references transferType(transferTypeID),
	employeeID int references employee(employeeID),
	transferRelievingDate date,
	transferJoiningDate date,
	requestDate date,
	reason text,
	approve int,
	approveDate date,
	transferLetter text,
	fromProjectID int references project(projectID),
	toProjectID int references project(projectID),
	fromDepartmentID int references department(departmentID),
	toDepartmentID int references department(departmentID),
	fromLocationID int references location(locationID),
	toLocationID int references location(locationID)
)
go
create table [admin]
(
	id int identity primary key,
	email varchar(100) unique not null,
	[password] varchar(100)not null,
	[role] int not null
)
go
insert into [admin](email, [password], [role])
values  ('admin@admin.com', '1234', 1),
		('mod@mail.com','mod',2),
		('mod2@mail.com','mod2',2)
go
-----------------------------------------------------------
create procedure addAdmin(@email varchar(100), @password varchar(100), @role int)
as begin
	insert into [admin] values (@email, @password, @role)
end
go

create procedure updateAdmin(@email varchar(100), @password varchar(100),@role int)
as begin
	update [admin] set email = @email, [password]=@password,[role] =@role
	where email= @email 
end
go
create procedure deleteAdmin(@email varchar(100))
as begin
	delete from [admin] where email = @email
end
go
create procedure changePasswordAdmin(@email varchar(100),@oldPassword varchar(100),@newPassword varchar(100))
as
begin
	update [admin] set [password]=@newPassword
	where [password] = @oldPassword and email = @email
end
go
-- DuongHM write ------------------------------------------

-- procedure for project table
create procedure addProject(@name nvarchar(200), @createDate date, @endDate date)
as begin
	insert into project(projectName, createDate, endDate)
		values(@name, @createDate, @endDate)
end
go

create procedure updateProject(@id int, @name nvarchar(200), @createDate date, @endDate date)
as begin
	update project set projectName=@name, createDate=@createDate, endDate=@endDate
	where projectID=@id
end
go
create procedure deleteProject(@id int)
as begin
	delete from project where projectID=@id
end
go
-- procedure for employee table
create procedure addEmployee(@emplNum varchar(20), @emplName nvarchar(200),@email varchar(100),@salary float,@birthday date,@address nvarchar(200), @pass varchar(50), @role nvarchar(100), @workExperience int, @gender bit, @departmentID int, @projectID int)
as begin
	insert into employee(employeeNumber ,employeeName,email,salary,birthday,[address], [password], [role], workExperience, gender, departmentID, projectID)
		values(@emplNum, @emplName,@email,@salary,@birthday,@address, @pass, @role, @workExperience, @gender, @departmentID, @projectID)
end
go

create procedure updateEmployeeTransfer(@employeeID int ,@deparmentID int,@projectID int)
as begin
Update employee set departmentID = @deparmentID,projectID=@projectID
where employeeID =@employeeID
end
go

create procedure updateEmployee(@emplNum varchar(20), @emplName nvarchar(200),@email varchar(100),@salary float,@birthday date,@address nvarchar(200), @pass varchar(50), @role nvarchar(100), @workExperience int, @gender bit, @departmentID int, @projectID int)
as begin
	update employee set employeeName = @emplName,email=@email,salary=@salary,birthday=@birthday,[address]=@address, [password] = @pass, [role] = @role,
						workExperience = @workExperience, gender = @gender, departmentID = @departmentID, projectID = @projectID
	where employeeNumber = @emplNum
end
go

create procedure deleteEmployee(@emplNum varchar(20))
as begin
	delete from employee where employeeNumber = @emplNum
end
go

create procedure changeEmployeeDepartment(@emplNum varchar(20), @departmentID int)
as begin
	update employee set departmentID = @departmentID
	where employeeNumber = @emplNum
end
go

create procedure changeEmployeeProject(@emplNum varchar(20), @projectID int)
as begin
	update employee set projectID = @projectID
	where employeeNumber = @emplNum
end
go
create procedure changeEmployeePassword(@email varchar(100),@oldPassword varchar(100), @newPassword varchar(100))
as 
begin
	update employee set [password] = @newPassword
	where [password] = @oldPassword and email = @email
end
go

-----------------------------------------------------------

create procedure addLocation(@locationName nvarchar(200))
as
begin
	insert into location(locationName) values(@locationName)
end
go

create procedure updateLocation(@id int,@name nvarchar(200))
as begin
	update location set locationName=@name
	where locationID=@id
end
go

create procedure deleteLocation(@id int)
as begin
	delete from location 
	where locationID = @id
end
go
--------------------------------------------------------
create procedure addDepartment(@name nvarchar(200),@locationID nvarchar(200))
as
begin
	insert into department(departmentName,locationID) values(@name,@locationID)
end
go

create procedure updateDepartment(@id int,@name nvarchar(200),@locationID int)
as begin
	update department set departmentName=@name,locationID=@locationID
	where departmentID=@id
end
go

create procedure deleteDepartment(@id int)
as begin
	delete from department
	where departmentID = @id
end
go
-----------------------------------------------------------------
create procedure addTransferType(@transferTypeName nvarchar(200))
as
begin
	insert into transferType(transferTypeName) values(@transferTypeName)
end
go
create procedure updateTransferType(@id int,@name nvarchar(200))
as begin
	update transferType set transferTypeName=@name
	where transferTypeID=@id
end
go
create procedure deleteTransferType(@id int)
as begin
	delete from transferType 
	where transferTypeID = @id
end
go
------------------------------------------------------------------------
---Transfer Procedure
create procedure addTransfer(@emplID int, @transferTypeID int, @reason text, @fromProjectID int, @toProjectID int, @fromDepartmentID int, @toDepartmentID int, @fromLocationID int, @toLocationID int)
as
begin
	insert into [transfer](employeeID, transferTypeID, requestDate, reason, fromProjectID, toProjectID, fromDepartmentID, toDepartmentID, fromLocationID, toLocationID, approve)
					values(@emplID,    @transferTypeID, GETDATE(),  @reason, @fromProjectID, @toProjectID, @fromDepartmentID, @toDepartmentID, @fromLocationID, @toLocationID, 3)
end
go

--create procedure updateTransfer(@transferID int, @transferTypeID int, @transferRelievingDate Date, @transferJoiningDate Date, @approve int, @approveDate Date, @fromProjectID int, @toProjectID int, @fromDepartmentID int, @toDepartmentID int, @fromLocationID int, @toLocationID int)
--as begin	
--	update [transfer] set transferTypeID = @transferTypeID, transferRelievingDate = @transferRelievingDate, transferJoiningDate = @transferJoiningDate
--	where transferID = @transferID
--end
--go

create procedure updateForApprovedTransfer(@transferID int, @transferRelievingDate Date, @transferJoiningDate Date)
as begin
	update [transfer] set transferRelievingDate = @transferRelievingDate, transferJoiningDate = @transferJoiningDate
	where transferID = @transferID
end
go

create procedure updateForDisapproveTransfer(@transferID int, @transferRelievingDate Date, @transferJoiningDate Date)
as begin
	update [transfer] set transferRelievingDate = @transferRelievingDate, transferJoiningDate = @transferJoiningDate
	where transferID = @transferID
end
go

create procedure updateForWaitApproveTransfer(@transferID int, @transferTypeID int, @transferRelievingDate Date, @transferJoiningDate Date, @fromProjectID int, @toProjectID int, @fromDepartmentID int, @toDepartmentID int, @fromLocationID int, @toLocationID int)
as begin
	update [transfer] set transferRelievingDate = @transferRelievingDate, transferJoiningDate = @transferJoiningDate,
						 fromProjectID = @fromProjectID, toProjectID = @toProjectID, fromDepartmentID = @fromDepartmentID, toDepartmentID = @toDepartmentID, fromLocationID = @fromLocationID, toLocationID = @toLocationID
	where transferID = @transferID
end
go

create procedure approveTransfer(@transferID int)
as begin
	update [transfer] set approve = 1, approveDate = GETDATE()
	where transferID = @transferID
	
	declare @employeeID int
	declare @toProjectID int
	declare @toDepartmentID int
	select top 1 @employeeID = employeeID , @toProjectID = toProjectID , @toDepartmentID = toDepartmentID from [transfer]
	where transferID = @transferID
	
	update employee set departmentID = @toDepartmentID, projectID = @toProjectID
	where employeeID = @employeeID
end
go

create procedure disapproveTransfer(@transferID int)
as begin
	update [transfer] set approve = 2, approveDate = GETDATE()
	where transferID = @transferID
end
go

create procedure deleteTransfer(@id int)
as begin
	delete from [transfer] 
	where transferID = @id
end
go

CREATE VIEW viewtranempl AS
SELECT [transfer].transferID, employeeName,employeeNumber,fromProjectID,toProjectID,fromDepartmentID,toDepartmentID,fromLocationID,toLocationID FROM [transfer] 
Inner Join employee On employee.employeeID = transfer.employeeID
go


--select * from employee
--go
--exec addTransfer 2, 1, 'demo', 1, 2, 1, 1, 1, 1

----------------------------------------------------------------------------------------------

Select * from [admin]
Insert Into [admin] Values('luunguyenvan93@yahoo.com','12345')
Select * from [transfer]
Select * from employee
Select * from employee Inner Join department On 
	     employee.departmentID = department.departmentID 
         Inner Join location On department.locationID = location.locationID
         Inner Join project On project.projectID =employee.projectID
         Inner Join [transfer] On employee.employeeID = [transfer].employeeID
         Where employee.email = 'hung@gmail.com'
         
Select * from transfer
Select email,password from employee
union Select email,password from admin

go


 

      
select * from employee