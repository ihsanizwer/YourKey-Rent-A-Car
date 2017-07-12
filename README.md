# YourKey-Rent-A-Car
This is the second year first year first semester ST2 project done by myself Yusra Frouz and Kashif Roshen. Technologies used include Java, Netbeans, SQL(MySql) and JasperReports.

How to set up the project.

1. Clone this repository to your machine.
2. Create a database named 'carr' using MySql/MySql Workbench and execute the SQL found on the DB folder, to create tables and insert rows.
3. Open the "Your key" project using netbeans.
4. It may ask you to resolve missing libraries, please find them using the folder browser in netbeans (All the libraries required are in the libs folder of this repository.)
  -For MySQLib library select the mysql-connector-java.jar
  -For TableFromDB select rs2xml.jar
  -Other jars are self-explanotory, import them as well.
5. Configure the Database Strings (Username, Password, Database name if different) on the following classes : DBCon.DBConnection, classes.DBConnection, carrental.DB_Con according to how you have defined in your DBMS.
6. In the project explorer window, click on the files tab, select and double click: Your Key -> src -> META-INF -> persistance.xml. Click on the sources tab of persistance file. See if the database credentials are accurate, if not change them.
7. Run the project.
