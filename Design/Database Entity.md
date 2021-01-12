## **Data Entities**

Carol Smith, a business analyst at Evergreen, has discussed with company’s CTO Tim Beck about the details of information required for the new website. As a result, she has gathered the following information:

 

**1.**  **Customer Information**

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

A category is used to group books in a specific domain. An admin supplies category name, and the system automatically assigns a unique ID for a new category.

\- Category name: text, 5-30 characters

 

**3.**  **Book Information**

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

A customer must provide the following information when writing a review for a particular book:

\- Rating: number, ranging from 1 to 5

\- Headline: text, 20-128 characters

\- Comment: 100-300 characters

In addition, the system automatically associates the book and the customer with the review, and assigns a unique ID.

 

**5.**  **Order’s Information**

When a customer places an order, he or she can update the shipping information as below:

\- Recipient name: same as customer’s full name

\- Recipient phone: same as customer’s phone

\- Street address: same as customer’s address

\- City: same as customer’s city

\- Zip Code: same as customer’s zip code

\- Country: same as customer’s country

By default, the website fills the shipping information with the information provided by the customer at registration. And of course the customer can change it, e.g. in case of he or she wants to ship the books to different address.

Shipping address = Street address + City + Zip Code + Country

For each book added to the order, the customer must specify quantity (number of copies), and the website automatically calculates the subtotal for each book and the total for the whole order.

​        \- quantity: integer number

​        \- subtotal: float number

​        \- total: float number

The system sets “Processing” status for every new order. The admin then can update this status to one of the following values: Shipping, Delivered, Completed, and Cancelled. The system also records the date and time when the order is placed.

​        \- order status: text, 5-20 characters

​        \- payment method: 5-20 characters

 

**6.**  **Admin’s Information**

An admin can create another admin user by providing the following information for a new user:

\- E-mail address: text, 10 to 64 characters

\- Full name: text, 8-30 characters

\- Password: text, 8 - 16 characters

The system automatically assigns a unique ID for every new user.