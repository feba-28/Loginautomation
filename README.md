1. Creation of excel file named LOGINcred.xlsx
   The possible combinations of value of email and its password are entered here.
   Code uses apache poi to read data from excel file and with help of loops we can iterate throuhh each row and get thr values.
2.  Maven tool is used
   It helps in simplfying the project steps and has a centralized repositary to manage jar files.
3. The code iterates through the login credentials from the file and the fields are located using xpath and the data from xlsx file are entered.
   These datas are validated by checking if the expected URL after a successful login is matched with actual URL after logging in is tried.
   