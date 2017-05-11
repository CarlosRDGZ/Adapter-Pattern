package adapter;

//Using inheritance for adapter pattern
public class ClassAdapterImpl extends Socket implements SocketAdapter
{
    private Volt convertVolts(Volt volts, int i)
    {
        return new Volt(volts.getVolts()/i);
    }

    @Override
    public Volt get120Volts()
    {
        return getVolt();
    }

    @Override
    public Volt get12Volts()
    {
        Volt volts = getVolt();
        return convertVolts(volts, 10);
    }

    @Override
    public Volt get3Volts()
    {
    	Volt volts = getVolt();
        return convertVolts(volts, 40);
    }
}
