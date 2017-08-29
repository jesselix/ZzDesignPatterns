package li.jesse.behavioral.command.sample;

public class FlipDownCommand implements TheCommand
{
    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute()
    {
        theLight.turnOff();
    }
}
