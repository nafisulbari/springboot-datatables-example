DROP TABLE IF EXISTS PERSON_TABLE;

CREATE TABLE PERSON_TABLE (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    NAME VARCHAR(250) DEFAULT NULL,
    ADDRESS VARCHAR(250) DEFAULT NULL
);

INSERT INTO PERSON_TABLE (NAME, ADDRESS) VALUES
  ('John', 'NY'),
  ('Karen', 'DC'),
  ('Rose', 'KR'),
  ('Smith', 'IN'),
  ('Shelby', 'NY'),
  ('Rickey', 'ND'),
  ('Stone', 'AU'),
  ('Emilia', 'KKK'),
  ('Daytona', 'OP'),
  ('Kickstar', 'GC'),
  ('Json', 'SR'),
  ('Moma', 'IN');