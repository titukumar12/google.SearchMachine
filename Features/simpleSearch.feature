Feature:  Searching Products 


Scenario Outline: Searching Products on Google


Given  I am on the Google homepage

When  I entered the "<Product_name>" 

And i Click on a search button




Then I see the realted search result successfully


Examples: 

|Product_name|
|Football|
|Compture|
|Toys|


