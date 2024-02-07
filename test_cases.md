# Test Document for Simple Calculator Program

## Test Case 1: Addition
**Description:** Perform an addition operation.  
**Steps:**
- Input the first number as 10.
- Input the second number as 5.
- Choose the addition operation (1).
    
 **Expected output:** 15  
 **Result:** 15  
 **Testing result:** Passed

## Test Case 2: Subtraction
**Description:** Perform a subtraction operation.  
**Steps:**
- Input the first number as 8.
- Input the second number as 5.
- Choose the subtraction operation (2).
    
 **Expected output:** 3   
 **Result:** 3    
 **Testing result:** Passed

## Test Case 3: Multiplication
**Description:** Perform a multiplication operation.  
**Steps:**
- Input the first number as 6.
- Input the second number as 4.
- Choose the multiplcation operation (3).
    
 **Expected output:** 24  
 **Result:** 24  
 **Testing result:** Passed

## Test Case 4: Division
**Description:** Perform a division operation.  
**Steps:**
- Input the first number as 14.
- Input the second number as 2.
- Choose the division operation (4).
    
 **Expected output:** 7  
 **Result:** 7  
 **Testing result:** Passed

## Test Case 5: Division by Zero
**Description:** Perform a division by zero operation.  
**Steps:**
- Input the first number as 10.
- Input the second number as 0.
- Choose the division operation (4).
    
 **Expected output:** Invalid  
 **Result:** Cannot divide by 0  
 **Testing result:** Passed

## Test Case 6: Invalid Input of a Number
**Description:** Perform an invalid input of second number.  
**Steps:**
- Input the first number as 20.
- Input the second number as 'abc'.
    
 **Expected output:** Invalid input  
 **Result:** Invalid input. Please enter a valid number.    
 **Testing result:** Passed


## Test Case 7: Invalid Input of Operation
**Description:** Perform an invalid input of operation.  
**Steps:**
- Input the first number as 1.
- Input the second number as 10.
- Enter 'abc' as operation.
    
 **Expected output:** Invalid input  
 **Result:** Invalid choice. Please enter a number between 0 and 4.    
 **Testing result:** Passed


## Test Case 8: Invalid Input of "yes" or "no" Selection
**Description:** Perform an invalid input of selecting whether to perform another operation.  
**Steps:**
- Input the first number as 20.
- Input the second number as 10.
- Choose the addition operation (1).
- Input 'maybe' as to perform another operation.
    
 **Expected output:** Invalid input  
 **Result:** Invalid choice. Please enter 'yes' or 'no'.  
 **Testing result:** Passed

## Test Case 9: Exit the Program
**Description:** Perform an exit operation.  
**Steps:**
- Input the first number as 1.
- Input the second number as 10.
- Enter the exit operation (0).
    
 **Expected output:** Exit program  
 **Result:** Goodbye!     
 **Testing result:** Passed


