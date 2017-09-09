package li.jesse.behavioral.interpreter.example;

import java.util.Map;

public class Variable implements Expression
{
    private String name;
    public Variable(final String name)
    {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables)
    {
        if (null == variables.get(name)) return 0; // Either return new Number(0).
        return variables.get(name).interpret(variables);
    }
}
