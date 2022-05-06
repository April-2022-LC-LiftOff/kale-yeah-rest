# kale-yeah-rest
### api service for kale-yeah app
This is a **Grocery Meal Prep app** in which a user could add ingredients to a grocery list, those ingredients would be added as inventory into a database, then the user could use those items to create meals/recipes. We should break those ingredients down by protein, carb, veg, etc. Once items are used, they are removed from the current inventory, which would also let the user know when items need to be replenished. Ideally, the user would never be without the full ingredients to make a meal, they would also know when it was time to go grocery shopping, and what items needed to be purchased.


**eddy-api-aggregator-api**
**Eddy Tamayo Garcia - JAVA SpringBoot**
Current contribution is using @RestControllers for making RESTful web services and allows the class to handle the requests made by the client. I was able to fetch data with a MediaType.Application_JSON response and using RestTemplate.exchange method. The API url is inserted into this exchange method along with the API key as a dynamic variable + a HTTPMethod.GET operation. Under *resources* folder , one can find the ingredients,meal planning, recipes, and trivia classes with endpoints that I created. Another annotation used is the @RequestMapping. API key is stored in environment variables so its kept hidden from the public within Application.properties folder.
