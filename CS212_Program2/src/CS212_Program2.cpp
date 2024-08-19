/*
 * Anna Koblova
 * Spring 2024, CS212, William Iverson
 * Section Number: 10151
 * 4/8/2024
 * Program 2: Bits of a C++ program
 * Investigation of Bitwise Operators
 */

#include <iostream>
using namespace std;

#define TEST 14

int main() {
    int test = 14;
    cout << ( 2 & 5 ) << endl; // 0 bitwise AND with zero bits in common
    cout << ( 2 | 5 ) << endl; // 7 bitwise OR. The last 3 bits are all 1 (00000111)
    cout << ( 256 & 128 ) << endl; // 0 bitwise AND with zero bits in common
    cout << ( 256 | 128 ) << endl; // 384 bitwise OR. The first two bits are 1 (110000000)
    cout << ( TEST ) << endl;      // TEST is 14. 14 in binary is 00001110
    cout << ( TEST << 2 ) << endl; // 00001110 shift bits two left is 00111000. This converts to decimal as 56
    cout << ( 14 << 2 ) << endl; // 00001110 shift bits two left is 00111000. This converts to decimal as 56
    cout << ( test << 2 ) << endl; // 00001110 shift bits two left is 00111000. This converts to decimal as 56
    cout << ( test ) << endl; // test is still 14. 14 in binary is 00001110
    cout << ( 'G' >> 2 ) << endl; //G in binary is 01000111. 01000111 shift bits two right is 00010001. This converts to decimal 17
    cout << ( 'G' << 2 ) << endl; //G in binary is 01000111. 01000111 shift bits two left is 100011100. This converts to decimal 284
    cout << ( 'G' & 'H' ) << endl; //1000000 bitwise AND.This converts to decimal 64
    cout << ( 'G' | 'H' ) << endl; //1001111 bitwise OR. This converts to decimal 79.
    // "If the promoted type of the left-hand operand is int, then only the five lowest-order bits of the
    // right-hand operand are used as the shift distance. It is as if the right-hand operand were subjected
    // to a bitwise logical AND operator & (§15.22.1) with the mask value 0x1f (0b11111). The shift distance
    // actually used is therefore always in the range 0 to 31, inclusive."
    // Source: https://docs.oracle.com/javase/specs/jls/se15/html/jls-15.html#jls-15.19
    // Unlike Java, in case of overflow, C++ results in undefined behavior. In my case it returned 73896
    // in the next two tests.
    cout << ( 'G' << (222/* & 0b11111*/) ) << endl; // Overflow, undefined behavior in C++
    cout << ( 'G' >> (222/* & 0b11111*/) ) << endl; // Overflow, undefined behavior in C++
    cout << ( '\n' << 2 ) << endl; // '\n' in binary is 1010. 1010 shift bits two left is 101000. 101000 converts to decimal 40
    cout << ( '\n' >> 2 ) << endl; // '\n' in binary is 1010. 1010 shift bits two right is 10. 10 converts to decimal 2
    cout << ( 0x14 ) << endl; // 0x is hexadecimal. 0x14 converts to decimal 20.
    cout << ( 0x0000ff00 ) << endl; //0x0000ff00 converts to decimal 65280
    cout << ( 0x12abcdef ) << endl; //0x12abcdef converts to decimal 313249263
	return 0;
}
