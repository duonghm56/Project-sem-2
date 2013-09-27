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
	departmentName nvarchar(200) unique,
	locationID int references location(locationID)
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
	confirmPassword varchar(50)not null,
	[role] nvarchar(100), 
	workExperience int,
	gender bit,
	departmentID int references department(departmentID),
	projectID int references project(projectID)
)

create table transferType(
	transferTypeID int primary key identity,
	transferTypeName nvarchar(200) not null unique
)
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
create table [admin]
(
	id int identity primary key,
	email varchar(100) unique not null,
	[password] varchar(100)not null
)
go
-----------------------------------------------------------
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
create procedure addEmployee(@emplNum varchar(20), @emplName nvarchar(200),@email varchar(100),@salary float,@birthday date,@address nvarchar(200), @pass varchar(50),@confirmpass varchar(100), @role nvarchar(100), @workExperience int, @gender bit, @departmentID int, @projectID int)
as begin
	insert into employee(employeeNumber ,employeeName,email,salary,birthday,[address], [password],confirmPassword, [role], workExperience, gender, departmentID, projectID)
		values(@emplNum, @emplName,@email,@salary,@birthday,@address, @pass,@confirmpass, @role, @workExperience, @gender, @departmentID, @projectID)
end
go
create procedure updateEmployeeTransfer(@employeeID int ,@deparmentID int,@projectID int)
as begin
Update employee set departmentID = @deparmentID,projectID=@projectID
where employeeID =@employeeID
end
go
create procedure updateEmployee(@emplNum varchar(20), @emplName nvarchar(200),@email varchar(100),@salary float,@birthday date,@address nvarchar(200), @pass varchar(50),@confirmPassword varchar(100), @role nvarchar(100), @workExperience int, @gender bit)
as begin
	update employee set employeeName = @emplName,email=@email,salary=@salary,birthday=@birthday,[address]=@address, [password] = @pass,confirmPassword=@confirmPassword, [role] = @role,
						workExperience = @workExperience, gender = @gender
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

-----------------------------------------------------------


go
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
--------------------------------------------------------
go
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
-----------------------------------------------------------------
go
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
------------------------------------------------------------------------
go
create procedure addTransfer(@transferTypeID int,@employeeID int, @requestDate Date, @reason text, @approve bit, @fromProjectID int, @toProjectID int, @fromDepartmentID int, @toDepartmentID int, @fromLocationID int, @toLocationID int)
as
begin
	insert into [transfer](transferTypeID,employeeID,requestDate,reason,approve,fromProjectID,toProjectID,fromDepartmentID,toDepartmentID,fromLocationID,toLocationID) values(@transferTypeID,@employeeID, @requestDate, @reason, @approve , @fromProjectID, @toProjectID, @fromDepartmentID, @toDepartmentID, @fromLocationID, @toLocationID)
end
go
create procedure updateTransfer(@transferID int,@transferTypeID int,@employeeID int, @transferRelievingDate Date, @transferJoiningDate Date, @requestDate Date, @reason text, @approve bit, @approveDate Date, @fromProjectID int, @toProjectID int, @fromDepartmentID int, @toDepartmentID int, @fromLocationID int, @toLocationID int)
as begin
	update [transfer] set transferTypeID = @transferTypeID,employeeID = @employeeID, transferRelievingDate = @transferRelievingDate,transferJoiningDate = @transferJoiningDate, requestDate = @requestDate,reason = @reason ,approve = @approve, approveDate = @approveDate, fromProjectID = @fromProjectID,toProjectID = @toProjectID, fromDepartmentID = @fromDepartmentID,toDepartmentID = @toDepartmentID,fromLocationID = @fromLocationID,toLocationID = @toLocationID
	where transferID=@transferID
end
go
create procedure deleteTransfer(@id int)
as begin
	delete from [transfer] 
	where transferID = @id
end
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

CREATE VIEW viewtranempl AS
SELECT [transfer].transferID, employeeName,employeeNumber,fromProjectID,toProjectID,fromDepartmentID,toDepartmentID,fromLocationID,toLocationID FROM [transfer] 
Inner Join employee On employee.employeeID = transfer.employeeID
 

      
