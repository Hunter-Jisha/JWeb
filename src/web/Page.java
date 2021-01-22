package web;

import web.components.Component;
import web.tools.QuickFile;

import java.util.ArrayList;

public class Page
{
    ArrayList<Component> components;

    public Page()
    {
        components = new ArrayList<>();
    }

    public Page addComponent(Component component)
    {
        components.add(component);
        return this;
    }

    public QuickFile genHTMLFile()
    {
        String code = "<html>";

        for(Component component : components)
        {
            code += component.genHTML();
        }

        code += "</html>";

        return new QuickFile().setName("index.html").setData(code.getBytes());
    }

    public QuickFile genCSSFile()
    {
        String code = "";

        for(Component component : components)
        {
            code += component.genCSS();
        }

        return new QuickFile().setName("css.css").setData(code.getBytes());
    }

}
