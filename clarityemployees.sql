
CREATE TABLE department (
caseID INTEGER,
case INTEGER,  
PRIMARY KEY (caseID),
FOREIGN KEY (case) REFERENCES caseRedirection (caseID) );

CREATE TABLE caseRedirection (
caseID INTEGER, 
caseType VARCHAR (20)
case INTEGER, 
PRIMARY KEY (caseID),
FOREIGN KEY (case) REFERENCES department(caseID) );  

CREATE TABLE departmentResolution (
caseID INTEGER,  
employeeID INTEGER,
employee INTEGER ,  
PRIMARY KEY (employeeID),
FOREIGN KEY (employee) REFERENCES caseRedirection (caseID) );

CREATE TABLE employeeBasket (
employeedID INTEGER,
employeeName VARCHAR (255),
employeeDerpartment VARCHAR (255), 
receivedCaseDay DATE, 
expectedResolution TIMESTAMP,
employee CHAR,
PRIMARY KEY (employeeID),
FOREIGN KEY (employee) REFERENCES departmentResolution (employeeID));

