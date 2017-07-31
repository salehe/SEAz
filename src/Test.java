class Test
{
    public static void main(String[] args)
    {
        testSum();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
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

    private static void testMultiply()
    {
        int a = 6;
        int b = 11;
        int expected = 66;
        BasicMath bm = new BasicMath();
        int result = bm.multiply(a, b);
        if (result == expected)
        {
            System.out.println("Multiply: OK");
        }
        else
        {
            System.out.println("Multiply: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
