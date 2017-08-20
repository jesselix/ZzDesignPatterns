package li.jesse.behavioral.chainofresponsibility;

public abstract class Handler
{
    protected Handler successor;

    public void setSuccessor(Handler successor)
    {
        this.successor = successor;
    }
}
