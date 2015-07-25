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
}
