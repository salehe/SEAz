class Test
{
    public static void main(String[] args)
    {
        testSum();
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
