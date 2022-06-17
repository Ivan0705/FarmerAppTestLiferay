create table LS_Area (
	areaId LONG not null primary key,
	areaName VARCHAR(75) null,
	archive INTEGER
);

create table LS_Farmer (
	farmerId LONG not null primary key,
	name VARCHAR(75) null,
	organization_legal VARCHAR(75) null,
	ITN LONG,
	IEC LONG,
	PSRN LONG,
	area_registration VARCHAR(75) null,
	area_fields VARCHAR(75) null,
	date_registration VARCHAR(75) null,
	archive INTEGER
);

create table LS_Field (
	fieldId LONG not null primary key,
	areaId LONG,
	fieldName VARCHAR(75) null
);

create table LS_area (
	areaId LONG not null primary key,
	areaName VARCHAR(75) null,
	archive INTEGER
);

create table LS_field (
	fieldId LONG not null primary key,
	areaId LONG,
	fieldName VARCHAR(75) null
);