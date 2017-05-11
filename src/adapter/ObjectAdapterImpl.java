package adapter;

public class ObjectAdapterImpl implements SocketAdapter
{
    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    private Volt convertVolt(Volt volts, int i)
    {
        return new Volt(volts.getVolts()/i);
    }

    @Override
    public Volt get120Volts()
    {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volts()
    {
        Volt volts = sock.getVolt();
        return convertVolt(volts, 10);
    }

    @Override
    public Volt get3Volts()
    {
        Volt volts = sock.getVolt();
        return convertVolt(volts, 40);
    }
}
