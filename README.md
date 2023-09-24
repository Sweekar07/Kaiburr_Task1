# Kaiburr_Task1
Task 1. Java REST API example.

# Java REST API for Server Management

This application provides a RESTful API for managing "server" objects. 

## Endpoints

### 1. Fetching Servers

- **GET /servers**
  - Returns all the servers if no parameters are passed.
  - Parameters:
    - `id`: When server ID is passed, it returns a single server or `404 Not Found` if there’s no such server.

### 2. Creating a Server

- **PUT /servers**
  - The server object should be provided as a JSON-encoded message body.
  - Example Request Body:
    ```json
    {
        "name": "my centos",
        "id": "123",
        "language": "java",
        "framework": "django"
    }
    ```

### 3. Deleting a Server

- **DELETE /servers**
  - Parameter:
    - `id`: Server ID to be deleted.

### 4. Searching Servers by Name

- **GET /servers/find**
  - Parameter:
    - `name`: A string to check if a server name contains this substring. Returns one or more servers found or `404 Not Found` if nothing is found.

## Data Storage

The server objects are stored in a MongoDB database.

## Testing the API

You can test the API responses using tools like [Postman](https://www.postman.com/), `curl`, or any other HTTP client.

Example using PostMan[GET Method]:
http://localhost:8080/servers

Example using Curl:
curl http://localhost:8080/servers

## All the outputs are added in the file "Task_1_Outputs"
