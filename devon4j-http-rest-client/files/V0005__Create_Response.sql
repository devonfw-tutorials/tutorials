create table Response(
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  response VARCHAR(255),
  CONSTRAINT PK_Visitor PRIMARY KEY(id)
);