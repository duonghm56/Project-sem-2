USE master
GO
IF EXISTS (SELECT NAME FROM sys.databases WHERE NAME =N'ETMDB')
DROP DATABASE ETMDB
GO
CREATE DATABASE ETMDB
GO
USE ETMDB
GO
--Table Location
CREATE TABLE Location
(
	LocationID int identity(1,1),
	LocationAddress nvarchar(150) not null
)
GO
ALTER TABLE Location
ADD CONSTRAINT pk_LocationID PRIMARY KEY (LocationID)
GO
CREATE TABLE Department
(
	DepartmentID int identity(1,1),
	DepartmentName nvarchar(100) not null,
	LocationID int not null
)
GO
ALTER TABLE Department
ADD CONSTRAINT pk_DepartmentID PRIMARY KEY (DepartmentID)
GO
ALTER TABLE Department
ADD CONSTRAINT fk_Department_Location FOREIGN KEY (LocationID) REFERENCES Location(LocationID)
GO
--Table Project
CREATE TABLE Project
(
	ProjectID int identity(1,1),
	ProjectName nvarchar(100) not null,
	CreateDateProject datetime not null,
	EndDateProject datetime not null
)
GO
ALTER TABLE Project
ADD CONSTRAINT pk_ProjectID PRIMARY KEY (ProjectID)

--Table Employee
GO
CREATE TABLE Employee
(
	EmployeeID int identity(1,1),
	EmployeeNumber int not null,
	EmployeeName nvarchar(50) not null,
	Email varchar(100) not null,
	Password nvarchar(50) not null,
	[Role] nvarchar(100) not null,
	WorkExperience int null,
	Address nvarchar(150) not null,	
	Birthday datetime not null,
	Gender int,
	Allowance money null,
	LocationID int not null,
	DepartmentID int not null,
	ProjectID int not null
)
GO
ALTER TABLE Employee
ADD	CONSTRAINT pk_Employee PRIMARY KEY (EmployeeID,LocationID,DepartmentID,ProjectID)
GO
ALTER TABLE Employee
ADD	CONSTRAINT fk_Employee_Location FOREIGN KEY (LocationID) REFERENCES Location(LocationID)
GO
ALTER TABLE Employee
ADD	CONSTRAINT fk_Employee_Department FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)
GO
ALTER TABLE Employee
ADD	CONSTRAINT fk_Employee_Project FOREIGN KEY (ProjectID) REFERENCES Project(ProjectID)	

--Table TransferType
GO
CREATE TABLE TransferType
(

	TransferTypeID int identity(1,1),
	TransferName nvarchar(50) not null
)
GO
ALTER TABLE TransferType
ADD CONSTRAINT pk_TransferTypeID PRIMARY KEY (TransferTypeID)
GO
INSERT INTO TransferType(TransferName)
VALUES ('Administrator')
INSERT INTO TransferType(TransferName)
VALUES ('Employee')
GO
--Table Transfer
CREATE TABLE Transfer
(
	TransferID int identity(1,1) not null,
	TransferTypeID int not null,
	EmployeeID int not null,
	FromProjectID int not null,
	ToProjectID int not null,
	FromDepartmentID int not null,
	ToDepartmentID int not null,
	FromLocationID int not null,
	ToLocationID int not null,
	TransferRelievingDate datetime null,
    TransferJoiningDate datetime null,
	RequestDate datetime not null,
	Reason nvarchar(200) null,
	Approve nvarchar(20) null,
	ApproveDate datetime null
)
GO
ALTER TABLE Transfer
ADD	CONSTRAINT pk_Transfer PRIMARY KEY (TransferID,EmployeeID)
GO
ALTER TABLE Transfer
ADD	CONSTRAINT fk_Transfer_TranserType 
FOREIGN KEY (TransferTypeID ) REFERENCES TransferType(TransferTypeID)
GO
ALTER TABLE Transfer
ADD	CONSTRAINT fk_Transfer_Employee
FOREIGN KEY (EmployeeID,FromLocationID,FromDepartmentID,FromProjectID) REFERENCES Employee(EmployeeID,LocationID,DepartmentID,ProjectID)
GO
ALTER TABLE Transfer
ADD	CONSTRAINT fk_Transfer_Project 
FOREIGN KEY (ToProjectID) REFERENCES Project(ProjectID)
GO
ALTER TABLE Transfer
ADD	CONSTRAINT fk_Transfer_Department 
FOREIGN KEY (ToDepartmentID) REFERENCES Department(DepartmentID)
GO
ALTER TABLE Transfer
ADD	CONSTRAINT fk_Transfer_Location 
FOREIGN KEY (ToLocationID) REFERENCES Location (LocationID)
	
--Table Admin
GO
CREATE TABLE Admin
(
	AdminID int identity(1,1) not null,
	Email varchar(100) not null,
	Password nvarchar(50) not null,
	FullName nvarchar(100) not null	
	CONSTRAINT pk_AdminID PRIMARY KEY (AdminID)
)

--INSERT INTO TABLE--
GO
INSERT INTO Admin
VALUES('thanhnx_luv@yahoo.com.vn','admin','Ngo Xuan Thanh')
Go
CREATE PROC spInsertRequestTransfer
	@TransferTypeID int,
	@EmployeeID int,
	@FromProjectID int,
	@ToProjectID int,
	@FromDepartmentID int,
	@ToDepartmentID int,
	@FromLocationID int,
	@ToLocationID int,
	@RequestDate datetime,
	@Reason nvarchar(200),
	@Approve nvarchar(30)
AS
INSERT INTO Transfer(TransferTypeID,EmployeeID,FromProjectID,ToProjectID,FromDepartmentID,ToDepartmentID,FromLocationID,ToLocationID,RequestDate,Reason,Approve)
VALUES (@TransferTypeID,@EmployeeID,@FromProjectID,@ToProjectID,@FromDepartmentID,@ToDepartmentID,@FromLocationID,@ToLocationID,@RequestDate,@Reason,@Approve)
----------------------------------------------------------------------------------
GO
CREATE PROC spGetAdmin
	@Email varchar(100)
AS 
SELECT * FROM Admin WHERE Email=@Email
GO
----------------------------------------------------------------------------------
--INSERT
GO
CREATE PROC spInsertEmployee
	@EmployeeNumber int,
	@EmployeeName nvarchar(50),
	@Email varchar(100),
	@Password varchar(100),
	@Role nvarchar(100),
	@WorkExperience int,
	@Address nvarchar(150),
	@Birthday datetime,
	@Gender int,
	@Allowance money,
	@LocationID int,
	@DepartmentID int,
	@ProjectID int
AS
INSERT INTO Employee(EmployeeNumber,EmployeeName,Email,Password,[Role],WorkExperience,Address,Birthday,Gender,Allowance,LocationID,DepartmentID,ProjectID)
VALUES(@EmployeeNumber,@EmployeeName,@Email,@Password,@Role,@WorkExperience,@Address,@Birthday,@Gender,@Allowance,@LocationID,@DepartmentID,@ProjectID)
--GET
GO
CREATE PROC spGetEmployee
AS SELECT * FROM Employee
GO
CREATE PROC spGetEmployeeByName
	@Email varchar (100)
AS 
SELECT * FROM Employee WHERE Email=@Email
--GET BY ID
GO
CREATE PROC spGetEmployeeByID
	@EmployeeID int
AS
SELECT * FROM Employee
WHERE EmployeeID=@EmployeeID
--UPDATE
GO
CREATE PROC spUpdateEmployeebyID
	@EmployeeID int,
	@EmployeeNumber int,
	@EmployeeName nvarchar(50),
	@Email varchar(100),
	@Password varchar(100),
	@Role nvarchar(100),
	@WorkExperience int,
	@Address nvarchar(150),
	@Birthday datetime,
	@Gender int,
	@Allowance money,
	@LocationID int,
	@DepartmentID int,
	@ProjectID int
AS UPDATE Employee
SET EmployeeNumber=@EmployeeNumber,EmployeeName=@EmployeeName,Email=@Email,Password=@Password,[Role]=@Role,WorkExperience=@WorkExperience,Address=@Address,Birthday=@Birthday,Gender=@Gender,Allowance=@Allowance,LocationID=@LocationID,DepartmentID=@DepartmentID,ProjectID=@ProjectID
WHERE EmployeeID=@EmployeeID
--COUNT
GO
CREATE PROC spGetEmployeeByDepartmentID
	@DepartmentID int
AS SELECT * FROM Employee
WHERE DepartmentID=@DepartmentID
GO
CREATE PROC spGetEmployeeByLocationID
	@LocationID int
AS SELECT * FROM Employee
WHERE LocationID=@LocationID
GO
CREATE PROC spGetEmployeeByProjectID
	@ProjectID int
AS SELECT * FROM Employee
WHERE ProjectID=@ProjectID
--DELETE
GO
CREATE PROC spDeleteEmployee
	@EmployeeID int
AS DELETE FROM Employee WHERE EmployeeID=@EmployeeID
select * from dbo.Employee
--SEARCH
GO
CREATE PROC spSearchEmployeeByName
	@EmployeeName nvarchar(50)
AS SELECT * FROM Employee
WHERE EmployeeName LIKE '%'+@EmployeeName+'%'
--
GO
CREATE PROC spSearchEmployeeByDepartment
	@DepartmentID int
AS SELECT * FROM Employee
WHERE DepartmentID LIKE @DepartmentID
--
GO
CREATE PROC spSearchEmployeeByProject
	@ProjectID int
AS SELECT * FROM Employee
WHERE ProjectID LIKE @ProjectID
--
GO
CREATE PROC spSearchEmployeeByLocation
	@LocationID int
AS SELECT * FROM Employee
WHERE LocationID LIKE @LocationID
---------------------------------------------------------------------
--CHANGE PASSS EMPL
GO
CREATE PROC spChagePasswordEmployee
	@oldPass nvarchar(50),
	@newPassword nvarchar(50)
AS
UPDATE Employee
SET Password = @newPassword
WHERE Password = @oldPass
----------------------------------------------------------------------
--CHANGE PASS ADMIN
GO
CREATE PROC spChangePasswordAdmin
	@oldPass nvarchar(50),
	@newPassword nvarchar(50)
AS
UPDATE Admin
SET Password = @newPassword
WHERE Password = @oldPass
GO

----------------------------------------------------------------------------------
--PROC get Location
GO
CREATE PROC spLocation
AS
SELECT * FROM Location
GO
CREATE PROC spGetLocationID
	@LocationAddress nvarchar(150)
AS
SELECT LocationID FROM Location WHERE LocationAddress=@LocationAddress
GO
CREATE PROC spGetLocationByID
	@LocationID int
AS
SELECT * FROM Location WHERE LocationID=@LocationID
GO
CREATE PROC spGetLocationName
	@LocationID int
AS
SELECT LocationAddress FROM Location WHERE LocationID=@LocationID
GO
CREATE PROC spInsertLocation
	@LocationAddress nvarchar(150)
AS
INSERT INTO Location(LocationAddress) 
VALUES (@LocationAddress)
GO
CREATE PROC spUpdateLocationByID
	@LocationID int,
	@LocationAddress nvarchar(100)
AS UPDATE Location
SET LocationAddress=@LocationAddress
WHERE LocationID=@LocationID
GO
CREATE PROC spDeleteLocation
	@LocationID int
AS DELETE FROM Location WHERE LocationID=@LocationID
GO
CREATE PROC spSearchLocationByName
	@LocationAddress nvarchar(150)
AS SELECT * FROM Location
WHERE LocationAddress LIKE '%'+@LocationAddress+'%'
----------------------------------------------------------------------
--PROC
GO
CREATE PROC spDepartment
AS
SELECT * FROM Department
--
GO
CREATE PROC spGetDepartmentID
	@DepartmentName nvarchar(100)
AS
SELECT DepartmentID FROM Department WHERE DepartmentName=@DepartmentName
--
GO
CREATE PROC spGetDepartmentName
	@DepartmentID nvarchar(100)
AS
SELECT DepartmentName FROM Department WHERE DepartmentID=@DepartmentID
--PROC
GO
CREATE PROC spInsertDepartment
	@DepartmentName nvarchar(100),
	@LocationID int
AS
INSERT INTO Department(DepartmentName,LocationID) VALUES(@DepartmentName,@LocationID)
GO
CREATE PROC spGetDepartmentByLocationID
	@LocationID int
AS SELECT * FROM Department
WHERE LocationID=@LocationID
GO
CREATE PROC spGetDepartmentByID
	@DepartmentID int
AS SELECT * FROM Department
WHERE DepartmentID=@DepartmentID
GO
CREATE PROC spUpdateDepartmentByID
	@DepartmentID int,
	@DepartmentName nvarchar(100),
	@LocationID int
AS UPDATE Department
SET DepartmentName=@DepartmentName,LocationID=@LocationID
WHERE DepartmentID=@DepartmentID
GO
CREATE PROC spDeleteDepartment
	@DepartmentID int
AS
DELETE Department
WHERE DepartmentID=@DepartmentID
GO
CREATE PROC spSearchDepartmentByName
	@DepartmentName nvarchar(100)
AS SELECT * FROM Department
WHERE DepartmentName LIKE '%'+@DepartmentName+'%'
-----------------------------------------------------------------------
--PROC
GO
CREATE PROC spProject
AS
SELECT * FROM Project
--
GO
CREATE PROC spGetProjectID
	@ProjectName nvarchar(100)
AS
SELECT ProjectID FROM Project WHERE ProjectName=@ProjectName
--
GO
CREATE PROC spGetProjectName
	@ProjectID int
AS
SELECT ProjectName FROM Project WHERE ProjectID=@ProjectID
--
GO
CREATE PROC spDelProject
	@ProjectID int
AS DELETE FROM Project WHERE ProjectID=@ProjectID
--
GO
CREATE PROC spGetProjectByID
	@ProjectID int
AS SELECT * FROM Project
WHERE ProjectID=@ProjectID
--
GO
CREATE PROC spInsertProject
	@ProjectName nvarchar(100),
	@CreateDateProject datetime,
	@EndDateProject datetime
AS INSERT INTO Project(ProjectName,CreateDateProject,EndDateProject)
VALUES(@ProjectName,@CreateDateProject,@EndDateProject)
GO
CREATE PROC spUpdateProjectByID
	@ProjectID int,
	@ProjectName nvarchar(100),
	@CreateDateProject datetime,
	@EndDateProject datetime
AS UPDATE Project
SET ProjectName=@ProjectName,CreateDateProject=@CreateDateProject,EndDateProject=@EndDateProject
WHERE ProjectID=@ProjectID
--search project by name
GO
CREATE PROC spSearchProjectByName
	@ProjectName nvarchar(100)
AS SELECT * FROM Project
WHERE ProjectName LIKE '%'+@ProjectName+'%'
------------------------------------------------------------------------------------
--TRANSFER
--GET
GO
CREATE PROC spGetTransferByTypeID
	@TransferTypeID int
AS
SELECT * FROM Transfer
WHERE TransferTypeID=@TransferTypeID
--get all
GO
CREATE PROC spGetTransfer
AS
SELECT * FROM Transfer
--get by id
GO
CREATE PROC spGetTransferByID
	@TransferID int
AS SELECT * FROM Transfer
WHERE TransferID=@TransferID
-- admin approve
GO
CREATE PROC spApprove
	@TransferID int,
	@TransferRelievingDate datetime,
	@TransferJoiningDate datetime,
	@Approve nvarchar(20),
	@ApproveDate datetime
AS UPDATE Transfer
SET TransferRelievingDate=@TransferRelievingDate,TransferJoiningDate=@TransferJoiningDate,Approve=@Approve,ApproveDate=@ApproveDate
WHERE TransferID=@TransferID
GO
CREATE PROC spNotApprove
	@TransferID int,
	@Approve nvarchar(20)
AS UPDATE Transfer
SET Approve=@Approve
WHERE TransferID=@TransferID
GO
CREATE PROC spGetTransferByToDepartmentID
	@ToDepartmentID int
AS SELECT * FROM Transfer
WHERE ToDepartmentID=@ToDepartmentID
GO
CREATE PROC spGetTransferByEmployeeID
	@EmployeeID int
AS SELECT * FROM Transfer
WHERE EmployeeID=@EmployeeID
--delete
GO
CREATE PROC spDeleteTransfer
	@TransferID int
AS DELETE Transfer
WHERE TransferID=@TransferID
----------------------------SEARCH TRANSFER
GO
CREATE PROC spSearchTransferByDate
	@startDate datetime,
	@endDate datetime
AS
SELECT * FROM Transfer
WHERE (RequestDate>=@startDate and RequestDate<=@endDate)
GO
CREATE PROC spSearchTransferByEmployeeID
	@EmployeeID int
AS
SELECT * FROM Transfer
WHERE EmployeeID=@EmployeeID
--
GO
CREATE PROC spSearchTransferByFromProjectID
	@FromProjectID int
AS
SELECT * FROM Transfer
WHERE FromProjectID=@FromProjectID
GO
CREATE PROC spSearchTransferByFromDepartmentID
	@FromDepartmentID int
AS
SELECT * FROM Transfer
WHERE FromDepartmentID=@FromDepartmentID
GO
CREATE PROC spSearchTransferByFromLocationID
	@FromLocationID int
AS
SELECT * FROM Transfer
WHERE FromLocationID=@FromLocationID
GO
CREATE PROC spSearchTransferByToProjectID
	@ToProjectID int
AS
SELECT * FROM Transfer
WHERE ToProjectID=@ToProjectID
GO
CREATE PROC spSearchTransferByToDepartmentID
	@ToDepartmentID int
AS
SELECT * FROM Transfer
WHERE ToDepartmentID=@ToDepartmentID
GO
CREATE PROC spSearchTransferByToLocationID
	@ToLocationID int
AS
SELECT * FROM Transfer
WHERE ToLocationID=@ToLocationID
GO
CREATE PROC spSearchTransferByStatus
	@Approve nvarchar(30)
AS
SELECT * FROM Transfer
WHERE Approve=@Approve 
---------------------------------PROC STATIC
GO
CREATE PROC spTotalRequest
AS SELECT TransferID 
FROM Transfer WHERE TransferTypeID=2
GO
CREATE PROC spTotalApprove
AS SELECT TransferID
FROM Transfer WHERE Approve='Approve'
GO
CREATE PROC spTotalNotApprove
AS SELECT TransferID
FROM Transfer WHERE Approve='Not Approve'
GO
CREATE PROC spTotalTransferWaiting
AS SELECT TransferID 
FROM Transfer WHERE Approve='Waiting'
GO
CREATE PROC spTotalEmployee
AS SELECT EmployeeID
FROM Employee
GO
CREATE PROC spTotalDepartment
AS SELECT DepartmentID
FROM Department
GO
CREATE PROC spTotalLocation
AS SELECT LocationID
FROM Location
GO
CREATE PROC spTotalProject
AS SELECT ProjectID
FROM Project
GO
CREATE PROC spInsertTransfer
	@TransferTypeID int,
	@EmployeeID int,
	@FromProjectID int,
	@ToProjectID int,
	@FromDepartmentID int,
	@ToDepartmentID int,
	@FromLocationID int,
	@ToLocationID int,
	@TransferRelievingDate datetime,
	@TransferJoiningDate datetime,
	@RequestDate datetime,
	@Reason nvarchar(100),
	@Approve nvarchar(20),
	@ApproveDate datetime
AS
INSERT INTO Transfer(TransferTypeID,EmployeeID,FromProjectID,ToProjectID,FromDepartmentID,ToDepartmentID,FromLocationID,ToLocationID,TransferRelievingDate,TransferJoiningDate,RequestDate,Reason,Approve,ApproveDate)
VALUES (@TransferTypeID,@EmployeeID,@FromProjectID,@ToProjectID,@FromDepartmentID,@ToDepartmentID,@FromLocationID,@ToLocationID,@TransferRelievingDate,@TransferJoiningDate,@RequestDate,@Reason,@Approve,@ApproveDate)