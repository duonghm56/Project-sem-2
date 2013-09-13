--create database eproject

--use eproject

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
	createDate datetime,
	endDate datetime
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
create procedure addLocation(@locationName nvarchar(200))
as
begin
	insert into location(locationName) values(@locationName)
end
