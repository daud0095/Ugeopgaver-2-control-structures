/*
// Opgave 1
double finalPrice;
double totalPrice = 1100;

void main() {
    if(totalPrice > 1000) {
        finalPrice = totalPrice * 0.8;
        System.out.println("Discount applied");
    }

    System.out.println("Final price: " + finalPrice + " kr");
}
 */
/*
// Opgave 2
double weight = 56.6;
double height = 1.56;

void main(){
    double bmi = weight / (height * height);

    if (bmi >= 25){
        System.out.println("Er overvægtige");
    } else if (bmi >= 18.5) {
        System.out.println("normal vægt");
    } else {
        System.out.println("Underweight");
    }
}
 */
/*
// Opgave 3
int time = 19;
void main() {
    if(time >= 5 && time <= 11) {
        System.out.println("Formmiddag");
    } else if (time >= 12 && time <= 17) {
        System.out.println("Eftermiddag");
    } else if (time >= 18 && time <= 21){
        System.out.println("Aften");
    } else {
        System.out.println("Godnat");
    }
}

 */

/*
// Opgave 4
int score = 60;
char grade;
String status;
String comment;
void main() {
    if (score >= 90){
        grade = 'A';
        comment = "Exellent";
    } else if (score >= 80) {
        grade = 'B';
        comment = "Good";
    } else if (score >= 70) {
        grade = 'C';
        comment = "Satisfactory";
    } else if (score >= 60) {
        grade = 'D';
        comment = "Needs improvement";
    } else {
        grade = 'F';
        comment = "Falling";
    }

    if (score >= 60) {
        status = "PASS";
    } else {
        status = "FAIL";
    }

    System.out.println("=== STUDENT REPORT ===");
    System.out.println("Score: " + score);
    System.out.println("Grade: " + grade);
    System.out.println("Status: " + status);
    System.out.println("Comment: " + comment);
}
 */
/*
// Opgave 5
double totalPrice = 600;
boolean isMember = true;
double shippingCost;

void main() {
    if ((totalPrice > 500) || (isMember && totalPrice > 200)) {
        shippingCost = 0.0;
        System.out.println("Free shipping!");
    } else {
        shippingCost = 50.0;
    }

    double finaTotal = totalPrice + shippingCost;
    System.out.println("Subtotal: " + totalPrice);
    System.out.println("Shipping: " + shippingCost);
    System.out.println("Final price: " + finaTotal);
}
 */
/*
// Opgave 6
int ageLimit = 15;
int guestAge = 12;
boolean hasParentalConsent = true;
void main() {
    if(guestAge >= ageLimit || (guestAge >= 13 && hasParentalConsent)) {
        System.out.println("Can watch movie");
    } else {
        System.out.println("Cannot watch movie ");
    }
}
 */
/*
// Opgave 7;
int partySize = 4;
int availableSeats = 6;
boolean hasReservation = false;
int waitTime = 20;
boolean restaurantFull = false;

void main() {
    if (partySize >= availableSeats && (hasReservation || waitTime < 30) && !restaurantFull) {
        System.out.println("Available");
    }
}
 */
/*
// Opgave 10

import org.w3c.dom.ls.LSOutput;

String item = "burger";
int quantity = 3;
double price;

void main() {
    switch (item) {
        case "burger":
        price = 89.0;
        break;
        case "pizza":
        price = 95;
        break;
        case "salad":
            price = 65;
            break;
        case "pasta":
            price = 79;
            break;
        case "steak":
            price = 145;
            break;
        default:
            price = 0.0;
            System.out.println("Item not found");
    }

    double total = price * quantity;

    System.out.println("Item: " + item);
    System.out.println("Price: " + price);
    System.out.println("Quantity. " + quantity);
    System.out.println("Total: " + total);
}
 */
/*
// Opgave 11
String zone = "National",
double weight = 7;
double baseCost;
double extraCost = 0.0;

void main() {
    switch (zone) {
        case "Local":
            baseCost = 50.0;
            break;
        case "Regional":
            baseCost = 100;
            break;
        case "National":
            baseCost = 150;
            break;
        case "International";
        baseCost = 300;
        default:
            baseCost = 0.0;
            System.out.println("Invalid zone");
    }

}
 */
/*
// opgave 12
int balance = 5000;
int amount = 1000;
String operation = "withdraw";

void main() {
}
 */


// Opgave 24

void main() {
    int[] scores = {85, 92, 78, 88, 95, 73, 90};
}
