public class thirdquestion {

    
    private static double number;
    public  thirdquestion ( )
    {
        number = 123.0d;
    }

    public boolean isZero ( )
    {
        return number == 0.0;
    }
    public boolean isPositive ( )
    {
        return number > 0.0;
    }
    public boolean isNegative ( )
    {
        return number < 0.0;
    }
    public boolean isodd( )
    {
        return number % 2 != 0.0;
    }
    public boolean isEven ( )
    {
        return number % 2 == 0.0;
    }
    public boolean isPrime ( )
    {
        int i, lastnum;

        double a;
        boolean flag;
        a = Math.sqrt(number);
        lastnum = (int)a;
        flag = true;
        for (i=2; i<lastnum; i++)
        {
            if (number != i)
            {
                if( number % i ==0)
                {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    public boolean isAmstrong ( )
    {
        return number == 0.0;
    }
    public double getFactorial ( )
    {
        double d=1;
        for(int i = 1; i < number; i++)
            d *=i;
        return d;
    }
    public double getSqrt ( )
    {
        double d;
        d = (double) number;
        d= Math.sqrt(d);
        return d;
    }
    public double getReverse ( )
    {
        double d =0;
        double temp;
        int db = (int) number;
        while (db >9)
        {
            temp = db %10;
            d = d * 10 + temp;
            db = db /10;
        }
        d = d * 10 + db;
        return d;
    }
    public double sumDigits( )
    {
        double d=0;
         int n = (int) number;
        while( n >9)
        {
            d += n % 10;
            n = n /10;
        }
        d += n;
        return d;
    }
    public void dispBinary ( )
    {
        System.out.println("ByteValue :" + Long.toBinaryString((long) number));
    }
    public static void main(String[] args) {

        thirdquestion number = new thirdquestion( );
        System.out.println(" The given number is : " + thirdquestion.number);
        number.dispBinary();
        System.out.println ("isZero: " + number.isZero() );
        System.out.println ("isPositive: " + number.isPositive());
        System.out.println ("isNegative: " + number.isNegative() );
        System.out.println ("isOdd: " + number.isodd());
        System.out.println ("isEven: " + number.isEven());
        System.out.println ("isPrime: " +number.isPrime());
        System.out.println ("isAmstrong: " +number.isAmstrong());
        System.out.println ("getFactorial: " + number.getFactorial());
        System.out.println ("getSqrt: " + number.getSqrt( ));
        System.out.println("getReverse:  " + number.getReverse());
        System.out.println ("sumDigits: " + number.sumDigits( ));

    }
}