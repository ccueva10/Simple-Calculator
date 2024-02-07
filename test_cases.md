# Test Document for Simple Calculator Program

## Test case 1: Addition
- **Input:**
  - Num 1  = 10
  - Num 2 = 5
  - Operation # = 1
- **Expected output:** 15
- **Result:** 15
- **Testing result:** Passed

## Test case 2: Subtraction
- **Input:**
  - Num 1  = 8
  - Num 2 = 5
  - Operation # = 2
- **Expected output:** 3
- **Result:** 3
- **Testing result:** Passed

## Test case 3: Multiplication
- **Input:**
  - Num 1  = 6
  - Num 2 = 4
  - Operation # = 3
- **Expected output:** 24
- **Result:** 24
- **Testing result:** Passed

## Test case 4: Division
- **Input:**
  - Num 1  = 14
  - Num 2 = 2
  - Operation # = 4
- **Expected output:** 7
- **Result:** 7
- **Testing result:** Passed

## Test case 5: Division by Zero
- **Input:**
  - Num 1  = 10
  - Num 2 = 0
  - Operation # = 4
- **Expected output:** Invalid
- **Result:** Cannot divide by 0
- **Testing result:** Passed

## Test case 6: Invalid input of num 1
- **Input:**
  - Num 1  = abc
  - Num 2 = 0
  - Operation # = 3
- **Expected output:** Invalid input
- **Result:** Invalid input. Please enter a valid number
- **Testing result:** Passed

## Test case 7: Invalid input of operation
- **Input:**
  - Num 1  = 1
  - Num 2 = 10
  - Operation # = abc
- **Expected output:** Invalid input
- **Result:** Invalid choice. Please enter a number between 0 and 4.
- **Testing result:** Passed

## Test case 8: Invalid input of “yes” or “no”
- **Input:**
  - Do you want to perform another calculation? (yes/no) = maybe
- **Expected output:** Invalid input
- **Result:** Invalid choice. Please enter 'yes' or 'no'.
- **Testing result:** Passed

## Additional Test Cases

### Test Case 1: Addition
**Description:** Perform an addition operation.  
**Steps:**
- Input the first number as 5.
- Input the second number as 3.
- Choose the addition operation.  
**Expected Result:** The output should be 8.

### Test Case 2: Subtraction
**Description:** Perform a subtraction operation.  
**Steps:**
- Input the first number as 10.
- Input the second number as 4.
- Choose the subtraction operation.  
**Expected Result:** The output should be 6.

### Test Case 3: Multiplication
**Description:** Perform a multiplication operation.  
**Steps:**
- Input the first number as 7.
- Input the second number as 6.
- Choose the multiplication operation.  
**Expected Result:** The output should be 42.

### Test Case 4: Division
**Description:** Perform a division operation.  
**Steps:**
- Input the first number as 20.
- Input the second number as 5.
- Choose the division operation.  
**Expected Result:** The output should be 4.

### Test Case 6: Invalid Number Input
**Description:** Enter a non-numeric value for numbers.  
**Steps:**
- Input the first number as abc.  
**Expected Result:** An error message prompting to enter a valid number.
