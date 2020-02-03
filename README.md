# MVP-SpringAPI

This is a simple API project for e-commerce in order to fix knowledge in Spring and Java made from the course of Professor Nelio Alves, as it is a simple project, so it has not been documented with Swagger yet.

## UML

![UML PROJECT](https://i.imgur.com/im1w5IR.jpg)


## Installation

Clone the repository for your machine, inside the folder open the prompt and use:

```bash
mvn clean install
```

## Usage

after the jar is generated, enter the target folder and use:

```bash
java -jar ecommerce-api-0.0.1.jar
```

## Endpoints

```
Examples

/users
POST: 
{
    "name": "Maria",
    "email": "maria@gmail.com",
    "phone": "31231231",
    "password": "1244"
}

/users/{id}
PUT:
{
    "name": "Maria 2",
    "email": "maria@gmail.com",
    "phone": "31231231"
}

DELETE 
/users/{id}

GET
/users or /users/{id}


Only GET requisitions (for now):

/orders
/orders/{id}
/categories
/categories/{id}
/products
/products/{id}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.


## License
[MIT](https://choosealicense.com/licenses/mit/)
