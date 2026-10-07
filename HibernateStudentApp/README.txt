Hibernate Student Application (Eclipse + Maven + MySQL)

1. Extract this ZIP.
2. In Eclipse: File > Import > Maven > Existing Maven Projects.
3. Browse to the extracted HibernateStudentApp folder and click Finish.
4. Create the database in MySQL:
       CREATE DATABASE studentdb;
5. Open src/main/resources/hibernate.cfg.xml and replace YOUR_MYSQL_PASSWORD
   with your MySQL password. Username defaults to root.
6. Right-click project > Maven > Update Project.
7. Ensure MySQL server is running.
8. Run src/main/java/com/student/Main.java as Java Application.
9. Verify:
       USE studentdb;
       SELECT * FROM student;

Note: Main inserts ID 101. If you run it again, the duplicate primary key
will cause an error. Change the ID in Main.java or delete the old row first.
