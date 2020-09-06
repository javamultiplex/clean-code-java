# Remainder with negative numbers

The remainder operator can be used with negative integers. The rule is:

- Perform the operation as if both operands were positive.
- If the left operand is negative, then make the result negative.
- If the left operand is positive, then make the result positive.
- Ignore the sign of the right operand in all cases.

For example:

17 %  3 == 2     -17 %  3 == -2     
17 % -3 == 2     -17 % -3 == -2