package web.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class QuickFile
{
    String directory, name;

    byte[] data;

    public QuickFile()
    {

    }

    public QuickFile setDirectory(String directory)
    {
        if(directory.endsWith("/"))
        {
            this.directory = directory;
        }
        else
        {
            this.directory = directory + "/";
        }
        return this;
    }

    public QuickFile setName(String name)
    {
        this.name = name;
        return this;
    }

    public QuickFile setData(byte[] data)
    {
        this.data = data;
        return this;
    }

    public boolean loadData()
    {
        try
        {
            data = Files.readAllBytes(Paths.get(directory + name));
        }
        catch(IOException e)
        {
            return false;
        }
        return true;
    }

    public boolean save()
    {
        try
        {
            new File(directory + name).createNewFile();
            FileOutputStream output = new FileOutputStream(directory + name);
            output.write(data);
        }
        catch(IOException e)
        {
            return false;
        }

        return true;
    }
}
