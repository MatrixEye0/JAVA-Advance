class Type{
    public static void main(String[] args){
        byte b = 10;
        char c ='a';
        short s =1024;
        int i = 25;
        float f = 1.23f;
        double d = .45;

        double result = (f*b) + (i/c) - (d*s);


// type promotion 
// if char, short,byte promote to int 
// if one operand is long whole became long -> if one operand is float whole became float -> if one operand is double whole became double

// f*b --> f
// i/c --> i
// d*s --> d
// float + integer --> float + double -->double
        System.out.println((f*b)+ " + " +(i/c)+ " - " +(d*s));
        System.out.print(result);

    }
}