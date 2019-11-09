# 271147-STIA1113-A191-A1A2

# Student Info

Matric: 271147  
Name: Tey Peck Yong

## Introduction

This assignment required students to create a car loan calculator in java. 
In this assignment, there are some conditions for user's input so that the input entered is valid. 
So, I used 'do while loop' to make sure user enter again the inputs that are valid. 
Next, a formula is created to count monthly repayment through mathematic method. 
This formula has used all the inputs from user. 
Then, output the monthly repayment to allow the users to know how much repayment for their car loan.
I created a two dimension array to store data of principal, interest and balance for each year of car loan period. 
Using nested 'for loop', I can output all the datas according to how many loan period user has inserted.
Through this assignment, I learnt the importance of creating plans like flowchart and pseudocode before writing a code. 
The usage of loop in java is wide and useful for solving different kinds of java questions.



## Pseudocode to calculate the perimeter of a rectangle

```
  Start
    Declare A=Car Price, B=Down Payment, C=Loan Period, D=Interest Rate

    Print “Car Price (RM):”
    Input Car Price
    While the Car Price is less than RM 30,000
            Print "Please enter Car Price above RM 30,000."
    End while

    Print “Down Payment (RM):”
    Input Down Payment
    While the Down Payment is less than 0
            Print "Please enter Down Payment at least 0."
    End while

    Print “Loan Period (Years):”
    Input Loan Period
    While the Loan Period is less than 5 years or more than 9 years
        Print "Please enter Loan Period between 5-9 years."
    End while

    Print “Interest Rate (%):”
    Input Interest Rate
    While the Interest Rate is less than 3% or more than 7%
        Print "Please enter Interest Rate  between 3-7%."
    End while

    Calculate Monthly Repayment = [(Car Price-Down Payment)/Loan Period+(Interest Rate/100)*(Car Price -Down Payment)]/12
    Print Monthly Repayment

    Print "YEARS", "PRINCIPLE", "INTEREST", "BALANCE"

    Calculate Principle = Monthly Repayment*12* relative nth year
    Calculate Interest = (Interest Rate/100)*(Car Price - Down Payment)*relative nth year
    Calculate Balance = Principle*(Loan Period - relative nth year)

    Declare int row=0, col=0

    for each row=0 to Loan Period 
        for each column=0 to length of first row 
            Print Years, Principal, Interest, Balance
        end for
    end for

  End

```

## Flow chart to print temparature
![Flowchart](https://github.com/Pyong99/271147-STIA1113-A191-A1A2/blob/master/flowchart.png)



## Screenshot of the output
![Output](https://github.com/Pyong99/271147-STIA1113-A191-A1A2/blob/master/Output.PNG)
