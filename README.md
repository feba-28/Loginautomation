1.  basepkg - consists of the uRL of the page to be tested.
2.  pagepkg - consists of identifying and locating webelements needed to be tested
3.  testpkg - consists of code for iterating through xlsx file and checking url for validation of login.
4.  excelutilspkg- code to fetch cell value from the excel sheet
5. Creation of excel file named LOGINcred.xlsx
   The possible combinations of value of email and its password are entered here.
   Code uses apache poi to read data from excel file and uses Data-Driven testing with help of loops we can iterate through each row and get the values.
6. Maven tool is used
   It helps in simplfying the project steps and has a centralized repositary to manage jar files.
7. The code iterates through the login credentials from the file and the fields are located using xpath and the data from xlsx file are entered.
   These datas are validated by checking if the expected URL after a successful login is matched with actual URL after logging in is tried.

   
