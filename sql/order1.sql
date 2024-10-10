create table tblCustomers (
CustomerID int primary key,
CustomerName varchar(100) not null,
ContactName varchar(100),
Address varchar(255),
City varchar(100),
PostalCode varchar(20),
Country varchar(100) default 'Canada'
);
 
create table tblSuppliers (
SupplierID int primary key,
SupplierName varchar(100) not null,
ContactName varchar(100),
Address varchar(255),
City varchar(100),
PostalCode varchar(20),
Country varchar(100)
);
 
create table tblShippers (
ShipperID int primary key,
ComapnyName varchar(100) not null unique,
Phone varchar(20)
);
 
create table tblProducts (
ProductId int primary key,
ProductName varchar(100) not null,
SupplierId int,
UnitPrice Decimal(10, 2),
Foreign key (SupplierID) references tblSuppliers(SupplierID)
);
 
create table tblOrders (
OrderID int primary key,
CustomerID int,
ShipperID int,
OrderDate date,
ShippedDate date,
Foreign key (CustomerId) references tblCustomers(CustomerID),
Foreign key (ShipperID) references tblShippers(ShipperID),
Check (ShippedDate > OrderDate)
);
 
create table tblOrderDetails (
OrderDetailID int primary key,
OrderID int,
ProductID int,
Quantity int Check (Quantity > 10),
Foreign key (OrderID) references tblOrders(OrderID),
Foreign key (ProductID) references tblProducts(ProductID)
);