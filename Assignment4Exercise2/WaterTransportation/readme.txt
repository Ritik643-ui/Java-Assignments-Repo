Lab 4 — Exercise 2: Ships
//generated using chatgpt

This program creates a regular ship, a cargo ship, and a cruise ship using fictional data.

Ship stores the common information, like the name, size, owner, and ports.

CargoShip extends Ship and adds cargo details.
CruiseShip extends Ship and adds ticket, room, menu, and service details.

Both child classes override print(). They call super.print() to show the common information, then print their own details.

ShipDriver stores all three objects in a Ship array. It loops through the array and calls print() on each object. This demonstrates polymorphism because each object uses its own version of print().

class diagram can be found in resources file
dummy output can be found in test/output.txt
How to run:
Run ShipDriver.java.

Files:
- Ship.java
- CargoShip.java
- CruiseShip.java
- ShipDriver.java