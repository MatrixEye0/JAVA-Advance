public class Operations {
    public static void main(String[] args) {
       // Bitwise operations
       int a = 2; // 10 --> 00000000 00000000 00000000 00000010
       int b = 3; // 11 --> 00000000 00000000 00000000 00000011
       int c = a & b; //    00000000 00000000 00000000 00000010 --> 2 donodo 1 tabhi 1
       int d = a | b; // 11 --> 3 same with this  ek one to bhi 1
       int e = a ^ b; // 01 --> 1 idhar 0 ka 1 and 1 ka 0
       int f = ~a; // 11111111 11111111 11111111 11111101 --> -3

       System.out.println(c + " , " + d + " , " + e + " , " + f);

       // Shift operations
       int h = 1; //   00000000 00000000 00000000 00000001 --> 1
       h = h << 33; // g = g << 33 == g << 1 

       // Right shift (>>) (>>>) 
       byte k = 1; // 00000001
       h = (byte)(k << 1); // 00000010 --> 2

       System.out.println(h);
        System.out.println(k);

    }
}