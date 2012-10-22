/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netcrackertree;

/**
 *
 * @author TheRusskiy
 */
public class Data {
    String text;
    public Data(String text)
    {
        this.text=text;
    }
    public String getText()
    {
        return text;
    }
    public void setText(String text)
    {
        this.text=text;
    }
    public boolean equals(Data data)
    {
        return this.getText().equals(data.getText());
    }
}
