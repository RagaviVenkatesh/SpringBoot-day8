**Spring Boot Day 8 Exercise**
Exercise Title: Update and Delete Operations - User & Post

Objective:

Today you will implement UPDATE and DELETE functionalities for User and Post entities. Ensure
proper error handling and response messaging for not found or invalid operations.

Tasks to Implement:

1. Add the following endpoints:
- PUT /api/users/{id} - Update user by ID
- DELETE /api/users/{id} - Delete user by ID
- PUT /api/posts/{id} - Update post by ID
- DELETE /api/posts/{id} - Delete post by ID
2. Use DTOs for update requests.
3. Use custom exception `ResourceNotFoundException` for missing records.
4. Return appropriate HTTP status codes and messages.
Bonus Challenge:
Implement soft delete for posts using a boolean `isDeleted` field and modify fetch APIs to ignore
deleted posts.

Submission Checklist:

- PUT & DELETE endpoints work as expected
- Error message for invalid ID is meaningful
- Bonus: Soft delete implemented and tested
