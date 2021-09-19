# Spring Boot Device Seller

## Endpoints

### Sign-Up

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 73

{
    "name": "admin",
    "username": "admin",
    "password": "admin"
}
````


### Sign-In

````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "admin",
    "password": "admin"
}
````


### Change-Role

````
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2MzIxNDc3NDl9.rLBudACxFgoL9LhWBopfIYGPG3lQcRmhEdugBVdBnAm4MItJbC1JLCHv-Y15UIyDOPBmUOTRoiIlsZlX7W2hBw
````

### Save Device

````
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
{
    "name": "device-2",
    "description": "desc-2",
    "price": 10,
    "deviceType": "DESKTOP"
}
````

### Get All Devices

````
GET /api/device HTTP/1.1
Host: localhost:8080
````

### Delete Device

````
DELETE /api/device/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
````


### Save Purchase

````
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
Content-Type: application/json

{
    "userId": 2,
    "deviceId": 2,
    "price": 9,
    "color": "blue"
}
````

### Get All Purchases

````
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
````
