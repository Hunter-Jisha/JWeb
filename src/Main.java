import web.Page;
import web.components.Text;
import web.tools.units.Color;
import web.tools.units.Pixels;

public class Main
{
    public static void main(String[] args)
    {
        Page test = new Page();
        test.addComponent(new Text("hello world").setFontSize(new Pixels(15)));
        test.genHTMLFile().setDirectory("/home/hunter/Desktop").save();
        test.genCSSFile().setDirectory("/home/hunter/Desktop").save();

    }
}
