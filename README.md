> # API Integration in Spring Boot

- CRUD API Integration with `GET, PUT, POST, DELETE`
  - Making the Spring Boot API with this by using REST Template
- How to consume/integrate a 3rd party api & create a Spring Boot API out of them
> ### API's being consumed/integrated in this Project  
1. [JSON Placeholder: API](https://jsonplaceholder.typicode.com/)

> ### CHAPTER 1
* Setting up the folders for all of our CRUD API's
  * We'll start by setting up a service package for the `posts` method endpoints which will be our interface
  * We're returning a list of posts, so we can start by mapping this as a HashMap/ List of HashMaps
    * You can either do the fallowing approaches -->
    
      1.  Handle the posts endpoint attributes & use an `@Entity` annotation in intelliJ to contain some attributes from the post endpoint
      2.  Create a DTO to map to directly create a list of mapping to be more generic
  * For this approach we'll go with the first option since we only have 4 attributes, for more than 4 like several then we'd consider doing a dto approach
  * In the interface we'll be creating the methods in there using a list of maps
    * Start with `getPosts()` & create a package called implementation which will be the service for our `PostService` Object
    * Next we'll create a controller/API for it then try integrating a 3rd party API's starting with the **_get_** integration for it then move onto the other method integrations