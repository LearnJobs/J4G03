package begin;

public class SwastikPattern
{
    // Displaying of swastika Pattern in given size
    public void swastikaPattern(int size)
    {
        if (size <= 3 || size % 2 == 0)
        {
            // When get a invalid size of pattern
            return;
        }
        System.out.print("\n Size : " + size + "\n\n");
        for (int i = 0; i < size; ++i)
        {
            for (int j = 0; j < size; ++j)
            {
                // Simple test the boundary cases
                if ((i < size / 2 && j == 0) || 
                    (j == size / 2) || (i == size / 2) || 
                    (i == 0 && j > (size / 2)) || 
                    (i == size - 1 && j < size / 2) || 
                    (i > size / 2 && j == size - 1))
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            //include new line
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        SwastikPattern task = new SwastikPattern();
        // Test 
        task.swastikaPattern(5);

    }
}