class Test
{
    public static void main(String[] args)
    {
        testDivision();
    }

    private static void testDivision()
    {
        int a = 30;
        int b = 6;
        int expected = 5;
        BasicMath bm = new BasicMath();
        int result = bm.divide(a, b);
        if (result == expected)
        {
            System.out.println("Divide: OK");
        }
        else
        {
            System.out.println("Divide: Failed, expected = " + expected + ", result = " + result);
        }
    }
    
    private static void testSum()
    {
        int a = 30;
        int b = 6;
        int expected = 36;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
