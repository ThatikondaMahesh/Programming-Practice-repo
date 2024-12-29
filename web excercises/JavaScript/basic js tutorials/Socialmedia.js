
function main() {
    // Create your class "User" here with all the properties and methods
    class User
    {
      #name;
      #email;
      #password;
      posts;
  
      constructor(name, email, password) {
        this.#name = name;
        this.#email = email;
        this.#password = password;
        this.posts = []; // Initialize posts as an empty array
      }
  
      get name() {
        return this.#name;
      }
  
      set name(newName) {
        this.#name = newName;
      }
  
      get email() {
        return this.#email;
      }
  
      set email(newEmail) {
        this.#email = newEmail;
      }
  
      get password() {
        return this.#password;
      }
  
      addPost(post) {
        this.posts.push(post);
      }
  
      deletePost(post) {
        const postIndex = this.posts.indexOf(post);
        if (postIndex !== -1) {
          this.posts.splice(postIndex, 1);
        }
      }
  
      displayPosts() {
        console.log(`Posts by ${this.name}:`);
        for (const post of this.posts) {
          console.log(`- ${post.title}`);
        }
      }
    }
  
    // Create your class "Post" here inheriting the User class with all the properties and methods as mentioned
    class Post extends User {
      #title;
      #content;
      #date;
      likeCount;
  
      constructor(name, email, password, title, content, date) {
        super(name, email, password); // Call parent constructor
        this.#title = title;
        this.#content = content;
        this.#date = date;
        this.likeCount = 0;
      }
  
      get title() {
        return this.#title;
      }
  
      set title(newTitle) {
        this.#title = newTitle;
      }
  
      get content() {
        return this.#content;
      }
  
      set content(newContent) {
        this.#content = newContent;
      }
  
      get date() {
        return this.#date;
      }
  
      addLike() {
        this.likeCount++;
      }
  
      displayDetails() {
        console.log(`Owner: ${this.name}`);
        console.log(`Title: ${this.title}`);
        console.log(`Content: ${this.content}`);
        console.log(`Date: ${this.date}`);
        console.log(`Likes: ${this.likeCount}`);
      }
    }
  
    // Create users and posts
    const user1 = new User("John", "john@example.com", "password123");
    const post1 = new Post(
      "John",
      "john@example.com",
      "password123",
      "My first post",
      "Lorem ipsum dolor sit amet",
      "2021-01-01"
    );
    const post2 = new Post(
      "John",
      "john@example.com",
      "password123",
      "My second post",
      "Consectetur adipiscing elit",
      "2021-01-02"
    );
  
    // User interactions
    user1.addPost(post1);
    user1.addPost(post2);
    post1.addLike();
    post1.addLike();
    user1.displayPosts();
    post1.displayDetails();
  
    return { User, Post };
  }
  
  main();
  