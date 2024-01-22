public class PruebaMain
{
    public static void main(String[] args)
    {

        try {
        Fecha fecha = new Fecha(1,3,1996);
            for (int i = 0; i < 365; i++) {
             fecha.siguienteDia();
                System.out.printf("%s %s%n",fecha,fecha.aStringUniversal());
            }
        } catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }

    }
}
