# Service REST 

Servicio usado para conocer la tasa que se aplicará a un monto dependiendo de la tarjeta que se utilice.

## Uso

Las pruebas fueron realizadas con postman. Para las llamadas deben ultilizarse las key "name"(String) y "amount"(number) sobre la página http://eldarfee.duckdns.org:8080/fee 

## Respuesta

En caso de que el monton sea mayor que sero y el nombre sea aceptado (VISA, NARA, AMEX), el proceso se realizará correctamente y enviará el nombre de la tarjeta y su tasa correspondiente. 

Si el nombre de la tarjeta no es aceptado o el monto sea negativo se devuelve en el valor "name" que por favor revise esos valores