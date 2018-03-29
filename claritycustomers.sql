
CREATE TABLE customers ( 
customersID VARCHAR (255),
customersFirstName VARCHAR (255),
customersLastName VARCHAR (255),
caseID INTEGER,
PRIMARY KEY (caseID) );

CREATE TABLE cases ( 
caseID INTEGER, 
caseType VARCHAR (50),
caseFromCustomer INTEGER, 
PRIMARY KEY (caseID),
FOREIGN KEY (caseFromCustomer)  REFERENCES customers (caseID) ); 



