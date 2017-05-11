package adapter;

public class AdapterPatternDemo
{
    public static void main(String[] args)
    {
        testClassAdapter();
        System.out.println();
        testObjectAdapter();
    }

    private static Volt getVolt(SocketAdapter sockAdap, int volts)
    {
        switch (volts)
        {
            case 3 : return sockAdap.get3Volts();
            case 12 : return sockAdap.get12Volts();
            default : return sockAdap.get120Volts();
        }
    }

    public static void testObjectAdapter()
    {
        SocketAdapter sock = new ObjectAdapterImpl();

        Volt v3 = getVolt(sock, 3);
        Volt v12 = getVolt(sock, 12);
        Volt v120 = getVolt(sock, 120);
        Volt v_unknown = getVolt(sock, 5);

        System.out.println("v3 using Object Adapter = " + v3.getVolts());
        System.out.println("v12 using Object Adapter = " + v12.getVolts());
        System.out.println("v120 using Object Adapter = " + v120.getVolts());
        System.out.println("v_unknown using Object Adapter = " + v_unknown.getVolts());
    }

    public static void testClassAdapter()
    {
        SocketAdapter sock = new ClassAdapterImpl();

        Volt v3 = getVolt(sock, 3);
        Volt v12 = getVolt(sock, 12);
        Volt v120 = getVolt(sock, 120);
        Volt v_unknown = getVolt(sock, 5);

        System.out.println("v3 using Class Adapter = " + v3.getVolts());
        System.out.println("v12 using Class Adapter = " + v12.getVolts());
        System.out.println("v120 using Class Adapter = " + v120.getVolts());
        System.out.println("v_unknown using Class Adapter = " + v_unknown.getVolts());
    }
}
