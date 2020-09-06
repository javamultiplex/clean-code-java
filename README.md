# Clean code principles

- SOLID
- KISS
- DRY
- YAGNI
- Delegation
- Encapsulate What Changes

# Design Patterns

 - Creational
 - Structural
 - Behavioral

# Unit Test Prinicples

1. Test case should be understandable and should not take more than 15 seconds to read  (Don’t write all scenarios in one test).
2. Unit tests should be self-sufficient - A single test should not depend on running other tests before it, nor should it be affected by the order of execution of other tests. Running the same unit test 1,000 times should return the same result every time.
3. Tests should be deterministic - The worst test is the one that passes some of the time. A test should either pass all the time or fail until fixed. Having a unit test that passes some of the time is equivalent to not having a test at all.
4. Naming conventions
5. Don't repeat yourself
6. Don’t write test cases of entity class and DTO
7. Don’t write test for coverage, cover all scenarios
