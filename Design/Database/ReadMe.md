## entity relationship diagram :

![image-20210115181959249](https://github.com/YuboC/Online_BookStore/blob/master/Design/Database/ER.png)
  

## **Data Entities**

Carol Smith, a business analyst at Evergreen, has discussed with company’s CTO Tim Beck about the details of information required for the new website. As a result, she has gathered the following information:

 

**1.**  **Customer Information**

**1.**  **Customer Table**

| **No** | **Field Name**  | **Data Type**  | **Minimum length** | **Maximum length** | **Required** | **Unique** |
| ------ | --------------- | -------------- | ------------------ | ------------------ | ------------ | ---------- |
| 1      | **Customer ID** | Number         |                    |                    | Yes          | Yes        |
| 2      | E-mail          | Text           | 10                 | 64                 | Yes          | Yes        |
| 3      | Full name       | Text           | 8                  | 30                 | Yes          |            |
| 4      | Address         | Text           | 10                 | 128                | Yes          |            |
| 5      | City            | Text           | 3                  | 32                 | Yes          |            |
| 6      | Country         | Text           | 3                  | 64                 | Yes          |            |
| 7      | Phone Number    | Text           | 10                 | 15                 | Yes          |            |
| 8      | Zip Code        | Text           | 3                  | 24                 | Yes          |            |
| 9      | Password        | Text           | 8                  | 16                 | Yes          |            |
| 10     | Register  date  | Date and  time |                    |                    | Yes          |            |

Visitors need to register as a customer to be able to post reviews and place order. A customer must provide the following information:

\- Full name: text, 8-30 characters

\- E-mail address: text, 10 to 64 characters

\- Password: text, 8 - 16 characters

\- Phone Number: text, 10-15 characters

\- Address: text, 10-128 characters

\- City: text, 3-32 characters

\- Zip Code: text, 3-24 characters

\- Country: text, 3-64 characters

A customer uses his email and password to login to the site. In addition, the system automatically assigns a unique customer ID and sets the register date for a new customer.

 

**2.**  **Category Information**

| **No** | **Field Name**  | **Data Type** | **Minimum length** | **Maximum length** | **Required** | **Unique** |
| ------ | --------------- | ------------- | ------------------ | ------------------ | ------------ | ---------- |
| 1      | **Category ID** | Number        |                    |                    | Yes          | Yes        |
| 2      | Category  Name  | Text          | 5                  | 30                 | Yes          | Yes        |

A category is used to group books in a specific domain. An admin supplies category name, and the system automatically assigns a unique ID for a new category.

\- Category name: text, 5-30 characters

 

**3.**  **Book Information**

| **No** | **Field Name**    | **Data Type** | **Minimum length**              | **Maximum length** | **Required** | **Unique** |
| ------ | ----------------- | ------------- | ------------------------------- | ------------------ | ------------ | ---------- |
| 1      | **Book ID**       | Number        |                                 |                    | Yes          | Yes        |
| 2      | Title             | Text          | 10                              | 128                | Yes          | Yes        |
| 3      | Author            | Text          | 3                               | 64                 | Yes          |            |
| 4      | Description       | Text          | 200                             | 2000               | Yes          |            |
| 5      | ISBN              | Text          | 10                              | 15                 | Yes          |            |
| 6      | Image             | Image         |                                 |                    | Yes          |            |
| 7      | Price             | Float number  |                                 |                    | Yes          |            |
| 8      | Publish Date      | Date          |                                 |                    | Yes          |            |
| 9      | Last Update  Time | Date time     |                                 |                    | Yes          |            |
| 10     | *Category ID*     | Number        | *Foreign key to Category table* |                    |              |            |

When an admin puts a new book onto the website, he must enter the following information:

\- Category

\- Title: text, 10-128 characters

\- Author: text, 5-64 characters

\- Description: text, 200-2000 characters

\- ISBN number: text, 10-15 characters

\- Thumbnail image: image data

\- Price: float number, e.g. 32.99

\- Publish date: date

In addition, the system automatically creates a unique ID and sets the last update time for a new book.

 

**4.**  **Customer’s Review Information**

| **No** | **Field Name** | **Data Type** | **Minimum length**              | **Maximum length** | **Required** | **Unique** |
| ------ | -------------- | ------------- | ------------------------------- | ------------------ | ------------ | ---------- |
| 1      | **Review ID**  | Number        |                                 |                    | Yes          | Yes        |
| 2      | *Book ID*      | Number        | *Foreign key to Book table*     |                    |              |            |
| 3      | *Customer ID*  | Number        | *Foreign key to Customer table* |                    |              |            |
| 4      | Rating         | Number        |                                 |                    |              |            |
| 5      | Headline       | Text          | 20                              | 128                | Yes          |            |
| 6      | Comment        | Text          | 100                             | 500                | Yes          |            |
| 7      | Review Time    | Date time     |                                 |                    |              |            |

A customer must provide the following information when writing a review for a particular book:

\- Rating: number, ranging from 1 to 5

\- Headline: text, 20-128 characters

\- Comment: 100-300 characters

In addition, the system automatically associates the book and the customer with the review, and assigns a unique ID.

 

**5.**  **Order’s Information**

| **No** | **Field Name**    | **Data Type** | **Minimum length**              | **Maximum length** | **Required** | **Unique** |
| ------ | ----------------- | ------------- | ------------------------------- | ------------------ | ------------ | ---------- |
| 1      | **Order ID**      | Number        |                                 |                    | Yes          | Yes        |
| 2      | *Customer ID*     | Number        | *Foreign key to Customer table* |                    |              |            |
| 3      | Order Date        | Date time     |                                 |                    | Yes          |            |
| 4      | Shipping  Address | Text          | 20                              | 256                | Yes          |            |
| 5      | Recipient  Name   | Text          | 8                               | 30                 | Yes          |            |
| 6      | Recipient  Phone  | Text          | 10                              | 15                 | Yes          |            |
| 7      | Payment  Method   | Text          | 5                               | 20                 | Yes          |            |
| 8      | Order Total       | Float number  |                                 |                    |              |            |
| 9      | Order Status      | Text          | 5                               | 20                 |              |            |

When a customer places an order, he or she can update the shipping information as below:

\- Recipient name: same as customer’s full name

\- Recipient phone: same as customer’s phone

\- Street address: same as customer’s address

\- City: same as customer’s city

\- Zip Code: same as customer’s zip code

\- Country: same as customer’s country

By default, the website fills the shipping information with the information provided by the customer at registration. And of course the customer can change it, e.g. in case of he or she wants to ship the books to different address.

Shipping address = Street address + City + Zip Code + Country



**Order Detail Table (detail)**

| **No** | **Field Name** | **Data Type** | **Minimum length**                | **Maximum length** | **Required** | **Unique** |
| ------ | -------------- | ------------- | --------------------------------- | ------------------ | ------------ | ---------- |
| 1      | *Order ID*     | Number        | *Foreign key to Book Order table* |                    |              |            |
| 2      | *Book ID*      | Number        | *Foreign key to Book table*       |                    |              |            |
| 3      | Quantity       | Number        |                                   |                    | Yes          |            |
| 4      | Sub Total      | Float number  |                                   |                    | Yes          |            |

For each book added to the order, the customer must specify quantity (number of copies), and the website automatically calculates the subtotal for each book and the total for the whole order.

​        \- quantity: integer number

​        \- subtotal: float number

​        \- total: float number

The system sets “Processing” status for every new order. The admin then can update this status to one of the following values: Shipping, Delivered, Completed, and Cancelled. The system also records the date and time when the order is placed.

​        \- order status: text, 5-20 characters

​        \- payment method: 5-20 characters

 

**6.**  **Admin’s Information**

| **No** | **Field Name** | **Data Type** | **Minimum length** | **Maximum length** | **Required** | **Unique** |
| ------ | -------------- | ------------- | ------------------ | ------------------ | ------------ | ---------- |
| 1      | **User ID**    | Number        |                    |                    | Yes          | Yes        |
| 2      | E-mail         | Text          | 10                 | 64                 | Yes          | Yes        |
| 3      | Full Name      | Text          | 8                  | 30                 | Yes          |            |
| 4      | Password       | Text          | 8                  | 16                 | Yes          |            |

An admin can create another admin user by providing the following information for a new user:

\- E-mail address: text, 10 to 64 characters

\- Full name: text, 8-30 characters

\- Password: text, 8 - 16 characters

The system automatically assigns a unique ID for every new user.



