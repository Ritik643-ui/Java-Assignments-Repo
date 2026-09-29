# Lab 4 — Exercise 1: Savings Accounts

This program shows how savings accounts earn monthly interest. It uses static variables, inheritance, and polymorphism.

## Classes

**SavingsAccount.java**
Stores each account’s balance and a shared annual interest rate. Includes methods to calculate monthly interest, change the rate, deposit money, and withdraw money. Invalid deposits and withdrawals throw an exception.

**SpecialSavings.java**
Extends SavingsAccount and overrides the interest calculation. Balances above $10,000 earn 10% annual interest. Other balances use the shared rate.

**SavingsDriver.java**
Tests accounts starting at $2,000 and $3,000. Calculates one month of interest at 4%, then another month at 5%.

**SpecialSavingsDriver.java**
Tests deposits and withdrawals on two special accounts. Prints the interest earned and updated balances. Uses SavingsAccount variables holding SpecialSavings objects to demonstrate polymorphism.

## Formula

Monthly interest = balance × annual interest rate ÷ 12

The interest is added to the account balance.

## How to Run

Run SavingsDriver for Part 1. Run SpecialSavingsDriver for Part 2.