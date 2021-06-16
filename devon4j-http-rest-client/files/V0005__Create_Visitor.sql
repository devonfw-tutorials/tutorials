create table Visitor(
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  username VARCHAR(255),
  password VARCHAR(255),
  CONSTRAINT PK_Visitor PRIMARY KEY(id)
);