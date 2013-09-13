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

create table employee(
	employeeID int primary key identity,
	employeeNumber varchar(20) unique not null,
	employeeName nvarchar(200) not null,
	password varchar(50) not null,
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

go
-----------------------------------------------------------
-- procedure cho bang project
create procedure addProject(@name nvarchar(200), @createDate date, @endDate date)
as begin
	insert into project(projectName, createDate, endDate)
		values(@name, @createDate, @endDate)
end
go

create procedure editProject(@id int, @name nvarchar(200), @createDate data, @endDate date)
as begin
	update project set projectName=@name, createDate=@createDate, endDate=@endDate
	where projectID=@id
end
go

create procedure deleteProject(@id int)
as begin
	delete from project where projectID=@id
end

-----------------------------------------------------------
go
create procedure addLocation(@locationName nvarchar(200))
as
begin
	insert into location(locationName) values(@locationName)
end
go
create procedure editLocation(@id int,@name nvarchar(200))
as
begin
	update location set locationName = @name
	where locationID = @id
end
go
create procedure deleteLocation(@id int )
as
begin
	Delete location where locationID = @id
end
---------------------------------------------
go
create procedure addDepartment(@departmentID int,@name nvarchar(200),@locationID int)
as
begin
	insert into department(departmentID,departmentName,locationID) values(@departmentID,@name,@locationID)
end
go
create procedure editDepartment(@departmentID int,@name nvarchar(200),@locationID int)
as
begin
	update department set departmentName = @name,locationID=@locationID
	where departmentID = @departmentID
end
go
create procedure deleteDepartment(@departmentID int)
as
begin
	Delete department where departmentID = @departmentID	
end
---------------------------------------------------------------
go