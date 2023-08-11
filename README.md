This README file explains how to use this carsale managment program.

 ****Note that before run this project, mysql must be created and create a new database named "abc" which can be accessed using the username "root" and the 
password also "root". The port that the mysql server connect should be "3306". 


---Database structure---
Table names: owner, vehicle, enter, sell, register

owner
NIC varchar(12)  <- PK
Name varchar(60)
Address varchar(100)
Tele varchar(12)

vehicle
RegNo varchar(8)  <- PK
Make varchar(15)
Model varchar(20)
ManuYear varchar(4)
RegYear varchar(4)
Category varchar(15)
Status varchar(15)

enter
RefNo varchar(6)  <- PK
NIC varchar(12)
RegNo varchar(8)
Date vaarchar(10)
Milage varchar(6)
Price varchar(13)

sell
RefNo varchar(6)  <- PK
NIC varchar(12)
RegNo varchar(8)
Date vaarchar(10)
Price varchar(13)
SpecNote varchar(100)

register
Name varchar(60)
Username varchar(15)  <- PK
Password varchar(30)



---First run---
At the initial step, a user account should be created. The first account is reserved for the admin user who have the power to execute all, read and write.

-Creating "admin" user account-
Go to "sign up" and add the name and the user name preferred. Then add the password and verify it.

After creating first user account as "admin", the application is ready to use.

Once a new user need to be registered in the application, it should be done by the admin user. After creating the first account, to open register form using "sign up",
the password of the "admin" user should be entered.

In registration form, new user accounts can be created. After making the first account as "admin", other all accounts will be created as "user" accounts, 
which have the permission only for retrieve(read) data from the application.

In register form, the link "Manage" will guide for new window which can be used to delete the existing user accounts. But here, "admin" account can not be deleted.

Users can log in to the application by entering the username and the password in the login window that appear very fist when opening the application. 
Since there are two types of users, they have two types of privileges.
1. Admin – Can both, read and write.
2. user – Only can read.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

--Login as ”admin”—
In the welcome page, there are 4 links to new windows.
Enter, Sell Vehicle, Existing, Sold




01. Enter
Here, the admin can enter the vehicle to the system. This window included with a reference number which is unique for each and every vehicle record. Left half for the 
details of vehicles and the right half for the owner details. After filling all the details, if all are valid entries, details will be saved. Otherwise display the 
relevant error messages.


In vehicle details,
Reg. No, Category, Make, Mode, Manu. Year, Reg. Year, Milage and Price.

1. Reg. No
This field is used to enter the registration numbers of the vehicles.
There are mainly four types.
NN-NNNN :- For the vehicles which have number type registration numbers. (ex. 18-2525)
NNN-NNNN :- For the vehicles which have  number type registration numbers.(ex. 300-2525)
LL-NNNN :- For the vehicles which have two English letters and four digits.(ex. KA-2525)
LLLNNNN :- For the vehicles which have three English letters and four digits.(ex. AAA2525)

2. Category
Used to define the category. *Only English letters can be included. Space can not be included.

3. Make
Used to enter the brand name of the vehicle(ex. Toyota). *Only English letters can be included. Space can not be included.

4. Model
Used to enter the model under the brand name. *English letters and numbers can be included. Can include spaces.

5. Manu. Year
Used to enter the manufactured year. *Only four digits that represent the year of manufactured.

6. Reg. Year
Used to enter the registered year. *Only four digits that represent the year of registered.

7. Milage
The milage that the vehicle driven. *Only six digits which can have maximum milage as 999999.

8. Price
Price of the vehicle. *Only numbers can be included. Maximum price is one billion rupees.
Note: If the vehicle is already in the database, after entering the registration number, other fields will be filled automatically excepting milage and the price. 
Although the fields are filled, they can be modified before saving the vehicle.


In owner details,
NIC, Name, Address, Telephone and Date.
1. NIC
The unique identification of the owner. *It should be in one of two types. Either only numbers which have 12 digits or nine numbers and one English letter, 
v/V or x/X. (ex. 985201425v / 985201425X / 985624587451) 

2. Name
For enter the name of the owner. *Only can have four parts separated by a space. Only first part can be used to enter the initials of the name.
(ex. H.M.S.Amarasinghe is valid while M.D.Sarath De. Silva is not valid)

3. Address
Use to enter the address of the owner. *Only can have four separate parts which are separated by “,”. Can have numbers, letters and ”/” for all parts but the “:” can 
be used in the first part.

4. Telephone
Use to enter the contact number of the owner. *Have two types. Either starts with “0” or “+94”. (ex. 0712345698 or +94123654987)

5. Date
Use to enter the adding date of a vehicle to the system. *The order should be “YYYY-MM-DD”. (ex. 2021-09-21)
Note: If the NIC of the owner is already exist in the database, after entering the NIC, other details will be filled automatically. Although it is filled, 
modifications can be added before saving. 




02. Sell Vehicle
Here, details of the selling is included. Right half is reserved for the details of the new owners of the vehicles. A unique reference number is assigned for every 
sale. After filling all the details, if all are valid entries, details will be saved. Otherwise display the relevant error messages. In details regarding the selling,
Reg. No, Price, Date, Special Note


1. Reg. No
This field is used to enter the registration numbers of the vehicle that is going to sell.
There are mainly four types.
NN-NNNN :- For the vehicles which have number type registration numbers. (ex. 18-2525)
NNN-NNNN :- For the vehicles which have  number type registration numbers.(ex. 300-2525)
LL-NNNN :- For the vehicles which have two English letters and four digits.(ex. KA-2525)
LLLNNNN :- For the vehicles which have three English letters and four digits.(ex. AAA2525)

2. Price
Price of the vehicle. *Only numbers can be included. Maximum price is one billion rupees.

3. Date
Use to enter the selling date of the vehicle to the system. *The order should be “YYYY-MM-DD”. (ex. 2021-09-21)

4. Special Notes.
Any kind of special note is accepted. No any validation for that field. *Maxximum number of letters.


In owner details,
NIC, Name, Address and Telephone.

1. NIC
The unique identification of the owner. *It should be in one of two types. Either only numbers which have 12 digits or nine numbers and one English letter, v/V or x/X. 
(ex. 985201425v / 985201425X / 985624587451) 

2. Name
For enter the name of the new owner. *Only can have four parts separated by a space. Only first part can be used to enter the initials of the name.
(ex. H.M.S.Amarasinghe is valid while M.D.Sarath De. Silva is not valid)

3. Address
Use to enter the address of the new owner. *Only can have four separate parts which are separated by “,”. Can have numbers, letters and ”/” for all parts but the “:” 
can be used in the first part.

4. Telephone
Use to enter the contact number of the new owner. *Have two types. Either starts with “0” or “+94”. (ex. 0712345698 or +94123654987)

Note: If the NIC of the owner is already exist in the database, after entering the NIC, other details will be filled automatically. Although it is filled, 
modifications can be added before saving. 




03. Existing
Here, is the place to search for the details of the vehicles which are currently available.
Ones load the page, all the details of the existing vehicles will be displayed in the table.
The details of the owners (Name, Address and contact number), can be retrieved by entering the registration number of the vehicle to the search field. The format of 
the registration number should be one of the above mentioned.
There is link, named “Search by Category” to open another window which allows to search for vehicles using its category. Here, the case type of the category is not 
considered. (ex. Car, car and CAR are same)




04. Sold
Here, the details of the owners(buyers) can be retrieved using the registration number of the sold vehicle. The format of the registration number should be one of the 
above mentioned.




-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
--Login as ”user”—
In the welcome page, there are only two links to new windows.
Existing, Sold
(The process below describe is the process that described in last two links that use to retrieve data as the “admin” user)


1. Existing
Here, is the place to search for the details of the vehicles which are currently available.
Ones load the page, all the details of the existing vehicles will be displayed in the table.
The details of the owners (Name, Address and contact number), can be retrieved by entering the registration number of the vehicle to the search field. The format of 
the registration number should be one of the above mentioned.
There is link, named “Search by Category” to open another window which allows to search for vehicles using its category. Here, the case type of the category is not 
considered. (ex. Car, car and CAR are same)


2. Sold
Here, the details of the owners(buyers) can be retrieved using the registration number of the sold vehicle. The format of the registration number should be one of the 
above mentioned.

