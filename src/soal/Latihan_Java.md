# 🎯 LATIHAN JAVA - Fundamentals



## ⭐ LEVEL 1: VARIABLES & OPERATORS

### Soal 1.1 - Test Data Generator
**Task:** Buat program yang menyimpan dan menampilkan test data user

**Requirements:**
- Simpan data: username, email, age, isActive (boolean)
- Print semua data dengan format rapi
- Hitung apakah user sudah dewasa (age >= 18)

**Expected Output:**
```
===== USER DATA =====
Username: qatest01
Email: qatest@example.com
Age: 25
Account Active: true
Is Adult: true
```

---

### Soal 1.2 - Test Result Calculator
**Task:** Hitung pass rate dari hasil testing

**Requirements:**
- Variable: totalTests = 50, passedTests = 42
- Hitung failedTests (total - passed)
- Hitung pass percentage
- Print hasilnya

**Expected Output:**
```
Total Tests: 50
Passed: 42
Failed: 8
Pass Rate: 84.0%
```

---

### Soal 1.3 - Validation Checker
**Task:** Check apakah user bisa login

**Requirements:**
- Variable: isUserRegistered = true, isPasswordCorrect = true, isAccountLocked = false
- Gunakan logical operators untuk check apakah canLogin
- canLogin = true jika: registered DAN password correct DAN NOT locked

**Expected Output:**
```
User Registered: true
Password Correct: true
Account Locked: false
Can Login: true
```

---

## ⭐⭐ LEVEL 2: CONTROL FLOW (IF-ELSE)

### Soal 2.1 - Test Priority Classifier
**Task:** Tentukan priority test berdasarkan severity

**Requirements:**
- Input: severity (int) = 1, 2, 3, 4, atau 5
- Logic:
    - 1 = "CRITICAL - Fix immediately"
    - 2 = "HIGH - Fix in current sprint"
    - 3 = "MEDIUM - Fix in next sprint"
    - 4 = "LOW - Backlog"
    - 5 = "TRIVIAL - Nice to have"

**Test dengan:** severity = 2

**Expected Output:**
```
Severity: 2
Priority: HIGH - Fix in current sprint
```

---

### Soal 2.2 - Login Validator
**Task:** Validasi username dan password

**Requirements:**
- Username harus minimal 5 karakter
- Password harus minimal 8 karakter
- Username dan password tidak boleh sama
- Print hasil validation

**Test dengan:**
- username = "test"
- password = "password123"

**Expected Output:**
```
Username Validation: FAILED (too short)
Password Validation: PASSED
Credentials Match: FAILED (username too short)
Login Status: REJECTED
```

---

### Soal 2.3 - Test Suite Analyzer
**Task:** Analyze test results dan tentukan action

**Requirements:**
- Input: passRate (double)
- Logic:
    - passRate >= 95: "EXCELLENT - Ready to release"
    - passRate >= 80: "GOOD - Minor fixes needed"
    - passRate >= 60: "WARNING - Major bugs found"
    - passRate < 60: "CRITICAL - Do not release"

**Test dengan:** passRate = 78.5

**Expected Output:**
```
Pass Rate: 78.5%
Status: WARNING - Major bugs found
```

---

## ⭐⭐ LEVEL 3: LOOPS

### Soal 3.1 - Test Case Generator
**Task:** Generate 10 test case IDs dengan format "TC-001", "TC-002", dst

**Requirements:**
- Gunakan for loop
- Format: TC-XXX (001, 002, 003, ..., 010)

**Expected Output:**
```
TC-001
TC-002
TC-003
...
TC-010
```

**Hint:** Gunakan String.format() atau concatenation

---

### Soal 3.2 - Even Test Counter
**Task:** Hitung berapa test case dengan ID genap dari 1-20

**Requirements:**
- Loop dari 1 sampai 20
- Count hanya ID yang genap (2, 4, 6, 8, ...)
- Print total even IDs

**Expected Output:**
```
Even Test IDs:
2
4
6
8
10
12
14
16
18
20
Total Even Tests: 10
```

---

### Soal 3.3 - Login Retry Simulator
**Task:** Simulasi login dengan max 3 attempts

**Requirements:**
- Gunakan while loop
- Variable: maxAttempts = 3, currentAttempt = 0
- Simulasi: attempt 1 dan 2 FAILED, attempt 3 SUCCESS
- Kalau success, keluar dari loop
- Kalau 3x gagal, lock account

**Expected Output:**
```
Attempt 1: FAILED
Attempt 2: FAILED
Attempt 3: SUCCESS
Login successful!
```

---

### Soal 3.4 - Critical Bug Finder
**Task:** Loop through test results, stop kalau ketemu critical bug

**Requirements:**
- Loop test 1-10
- Di test ke-6, ada critical bug
- Gunakan break untuk stop loop
- Print message kalau ketemu critical bug

**Expected Output:**
```
Running Test 1: PASSED
Running Test 2: PASSED
Running Test 3: PASSED
Running Test 4: PASSED
Running Test 5: PASSED
Running Test 6: CRITICAL BUG FOUND!
Stopping test execution...
Total tests executed: 6
```

---

## ⭐⭐⭐ LEVEL 4: ARRAYS

### Soal 4.1 - Test Suite Runner
**Task:** Loop through array of test names dan run semua

**Requirements:**
- Array: {"Login Test", "Logout Test", "Add to Cart", "Checkout", "Payment"}
- Print setiap test dengan nomor

**Expected Output:**
```
===== RUNNING TEST SUITE =====
1. Login Test
2. Logout Test
3. Add to Cart
4. Checkout
5. Payment
Total Tests: 5
```

---

### Soal 4.2 - Test Result Analyzer
**Task:** Hitung passed, failed, skipped dari array results

**Requirements:**
- String array: {"PASS", "FAIL", "PASS", "SKIP", "PASS", "FAIL", "PASS"}
- Hitung masing-masing status
- Print summary

**Expected Output:**
```
===== TEST SUMMARY =====
Total Tests: 7
Passed: 4
Failed: 2
Skipped: 1
Pass Rate: 57.14%
```

---

### Soal 4.3 - Failed Test Reporter
**Task:** Print hanya test yang FAILED beserta index-nya

**Requirements:**
- Test names: {"Login", "Logout", "Register", "Search", "Checkout"}
- Results: {true, true, false, true, false}
- Print nama test yang failed (hasil false)

**Expected Output:**
```
===== FAILED TESTS =====
Test 3: Register - FAILED
Test 5: Checkout - FAILED
Total Failed: 2
```

---

## ⭐⭐⭐ LEVEL 5: STRINGS

### Soal 5.1 - Email Validator
**Task:** Validate format email

**Requirements:**
- Check kalau email contains "@"
- Check kalau email contains "."
- Check kalau @ ada sebelum .
- Check kalau minimal 6 karakter

**Test dengan:** "testexample.com" dan "test@example.com"

**Expected Output untuk email invalid:**
```
Email: testexample.com
✗ Missing @ symbol
✗ Email INVALID
```

**Expected Output untuk email valid:**
```
Email: test@example.com
✓ Has @ symbol
✓ Has domain
✓ Valid format
✓ Email VALID
```

---

### Soal 5.2 - Password Strength Checker
**Task:** Check kekuatan password

**Requirements:**
- Length minimal 8 karakter: +1 point
- Contains angka: +1 point
- Contains huruf besar: +1 point
- Contains huruf kecil: +1 point
- Rating:
    - 4 points: STRONG
    - 3 points: MEDIUM
    - 1-2 points: WEAK

**Test dengan:** "Test1234"

**Expected Output:**
```
Password: Test1234
✓ Length OK (8 characters)
✓ Contains number
✓ Contains uppercase
✓ Contains lowercase
Strength Score: 4/4
Rating: STRONG
```

**Hint:** Gunakan Character.isDigit(), Character.isUpperCase(), Character.isLowerCase()

---

### Soal 5.3 - CSV Test Data Parser
**Task:** Parse data dari CSV format

**Requirements:**
- Input String: "John,Doe,john@test.com,25,true"
- Split by comma
- Tampilkan data dengan label

**Expected Output:**
```
===== USER DATA =====
First Name: John
Last Name: Doe
Email: john@test.com
Age: 25
Active: true
```

---

### Soal 5.4 - URL Validator
**Task:** Extract dan validate URL

**Requirements:**
- Input URL: "https://www.example.com/test/page"
- Extract protocol (https)
- Extract domain (www.example.com)
- Extract path (/test/page)
- Validate kalau URL starts with http:// atau https://

**Expected Output:**
```
URL: https://www.example.com/test/page
Protocol: https
Domain: www.example.com
Path: /test/page
Valid URL: true
```

---

## ⭐⭐⭐⭐ LEVEL 6: METHODS

### Soal 6.1 - Test Helper Methods
**Task:** Buat reusable methods untuk testing

**Requirements:**
Buat class TestHelper dengan methods:
1. `printHeader(String title)` - Print header dengan border
2. `calculatePassRate(int passed, int total)` - Return pass rate
3. `getTestStatus(boolean passed)` - Return "PASSED" atau "FAILED"

Gunakan methods tersebut di main method.

**Expected Output:**
```
=============================
    LOGIN TEST SUITE
=============================
Test 1: PASSED
Test 2: PASSED
Test 3: FAILED
Test 4: PASSED
Pass Rate: 75.0%
```

---

### Soal 6.2 - Validator Toolkit
**Task:** Buat methods untuk berbagai validasi

**Requirements:**
Buat class Validator dengan methods:
1. `isValidEmail(String email)` - Return true/false
2. `isValidAge(int age)` - Return true jika 18-100
3. `isStrongPassword(String password)` - Return true jika >= 8 char dan ada angka
4. `validateUser(String email, int age, String password)` - Print semua validation

**Test dengan:**
- email: "test@example.com"
- age: 25
- password: "Pass123"

**Expected Output:**
```
===== USER VALIDATION =====
Email: VALID ✓
Age: VALID ✓
Password: VALID ✓
User Registration: APPROVED
```

---

### Soal 6.3 - Test Case Manager
**Task:** Buat mini program untuk manage test cases

**Requirements:**
Buat class TestCaseManager dengan methods:
1. `addTestCase(String name)` - Print "Added: {name}"
2. `runTestCase(String name, boolean result)` - Print hasil
3. `generateReport(int passed, int failed)` - Print summary

Di main, jalankan beberapa test case.

**Expected Output:**
```
===== TEST EXECUTION =====
Added: Login Test
Added: Logout Test
Added: Register Test

Running Tests...
Login Test: PASSED ✓
Logout Test: PASSED ✓
Register Test: FAILED ✗

===== REPORT =====
Total: 3
Passed: 2
Failed: 1
Pass Rate: 66.67%
```

---

## ⭐⭐⭐⭐⭐ LEVEL 7: CHALLENGE (Kombinasi Semua)

### Soal 7.1 - Complete Test Management System
**Task:** Buat program lengkap untuk manage test execution

**Requirements:**
1. Gunakan array untuk store test names (minimal 5 tests)
2. Gunakan array untuk store results (true/false)
3. Buat methods:
    - `runAllTests()` - Loop dan run semua
    - `calculateStatistics()` - Hitung passed, failed, pass rate
    - `printDetailedReport()` - Print detail setiap test
    - `printSummary()` - Print ringkasan

**Expected Output:**
```
========================================
       TEST EXECUTION REPORT
========================================

Running Test Suite...

1. Login Test .................. PASSED ✓
2. Logout Test ................. PASSED ✓
3. Add to Cart ................. FAILED ✗
4. Checkout .................... PASSED ✓
5. Payment ..................... FAILED ✗

========================================
           SUMMARY
========================================
Total Tests Executed: 5
Passed: 3
Failed: 2
Skipped: 0
Pass Rate: 60.0%

Status: WARNING - Major bugs found
Action Required: Fix failed tests before release

========================================
```

---

### Soal 7.2 - User Registration Validator
**Task:** Buat complete user registration system dengan validasi lengkap

**Requirements:**
Validasi:
1. Username: 5-20 karakter, hanya huruf dan angka
2. Email: Format valid
3. Password: Minimal 8 karakter, ada huruf besar, huruf kecil, angka
4. Age: 18-100
5. Phone: Format +62xxx (minimal 10 digit)

Buat methods untuk setiap validasi dan satu method master yang call semua.

Test dengan data:
- username: "qa_tester_01"
- email: "qa@test.com"
- password: "Test1234"
- age: 25
- phone: "+62812345678"

**Expected Output:**
```
========================================
    USER REGISTRATION VALIDATION
========================================

Testing username: qa_tester_01
✗ Username invalid (contains underscore)

Testing email: qa@test.com
✓ Email valid

Testing password: Test1234
✓ Password meets all requirements
  - Length: OK
  - Uppercase: OK
  - Lowercase: OK
  - Number: OK

Testing age: 25
✓ Age valid

Testing phone: +62812345678
✓ Phone number valid

========================================
Registration Status: REJECTED
Reason: Username validation failed
========================================
```

---

**Let's code! 💻🔥**