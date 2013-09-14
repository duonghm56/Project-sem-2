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
create procedure addEmployee(@emplNum varchar(20), @emplName nvarchar(200), @pass varchar(50), @role nvarchar(100), @workExperience int, @gender bit, @departmentID int, @projectID int)
as begin
	insert into employee(employeeNumber ,employeeName, [password], [role], workExperience, gender, departmentID, projectID)
		values(@emplNum, @emplName, @pass, @role, @workExperience, @gender, @departmentID, @projectID)
end
go

create procedure updateEmployee(@emplNum varchar(20), @emplName nvarchar(200), @pass varchar(50), @role nvarchar(100), @workExperience int, @gender bit)
as begin
	update employee set employeeName = @emplName, [password] = @pass, [role] = @role,
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
