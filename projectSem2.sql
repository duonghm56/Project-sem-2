create database eproject
go

use eproject
go

create table location(
	locationID int primary key identity,
	locationName nvarchar(200) unique
)

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
drop table employee
create table employee(
	employeeID int primary key identity,
	employeeNumber varchar(20) unique not null,
	employeeName nvarchar(200) not null,
	email varchar(100) unique not null,
	password varchar(50) not null,
	confirmPassword varchar(50)not null,
	role nvarchar(100), 
	workExperience int,
	gender bit,
	departmentID int references department(departmentID),
	projectID int references project(projectID)
)

create table transferType(
	transferTypeID int primary key identity,
	transferTypeName nvarchar(200) not null unique
)
create table [transfer](
	transferID int primary key identity,
	transferTypeID int references transferType(transferTypeID),
	employeeID int references employee(employeeID),
	transferRelievingDate date,
	transferJoiningDate date,
	requestDate date,
	reason text,
	approve bit,
	approveDate date,
	fromProjectID int references project(projectID),
	toProjectID int references project(projectID),
	fromDepartmentID int references department(departmentID),
	toDepartmentID int references department(departmentID),
	fromLocation int references location(locationID),
	toLocation int references location(locationID)
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
create procedure addEmployee(@emplNum varchar(20), @emplName nvarchar(200),@email varchar(100), @pass varchar(50),@confirmpass varchar(100), @role nvarchar(100), @workExperience int, @gender bit, @departmentID int, @projectID int)
as begin
	insert into employee(employeeNumber ,employeeName,email, [password],confirmPassword, [role], workExperience, gender, departmentID, projectID)
		values(@emplNum, @emplName,@email, @pass,@confirmpass, @role, @workExperience, @gender, @departmentID, @projectID)
end
go

create procedure updateEmployee(@emplNum varchar(20), @emplName nvarchar(200),@email varchar(100), @pass varchar(50),@confirmPassword varchar(100), @role nvarchar(100), @workExperience int, @gender bit)
as begin
	update employee set employeeName = @emplName,email=@email, [password] = @pass,confirmPassword=@confirmPassword, [role] = @role,
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
create procedure addTransfer(@transferTypeID int,@employeeID int, @transferRelievingDate Date, @transferJoiningDate Date, @requestDate Date, @reason text, @approve bit, @approveDate Date, @fromProjectID int, @toProjectID int, @fromDepartmentID int, @toDepartmentID int, @fromLocationID int, @toLocationID int)
as
begin
	insert into [transfer] values(@transferTypeID,@employeeID, @transferRelievingDate, @transferJoiningDate, @requestDate, @reason, @approve , @approveDate , @fromProjectID, @toProjectID, @fromDepartmentID, @toDepartmentID, @fromLocationID, @toLocationID)
end
go
create procedure updateTransferType(@transferID int,@transferTypeID int,@employeeID int, @transferRelievingDate Date, @transferJoiningDate Date, @requestDate Date, @reason text, @approve bit, @approveDate Date, @fromProjectID int, @toProjectID int, @fromDepartmentID int, @toDepartmentID int, @fromLocationID int, @toLocationID int)
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