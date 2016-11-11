package com.company;

/**
 * Created by dpennebacker on 11/10/16.
 */
public class Code
{

    // additional instance variables
    private String myCode;
    private String origCode;
    private String xString;

    public Code (String code)
    {
        myCode = code;
        origCode = code;
        xString = "";
        for (int i=0; i < code.length(); i++)
            xString += "X";
    }


    public String getCode()
    {
        return myCode;
    }

    // precondition: p1 >= 0, p1 < p2
    // 				 p2 <= myCode.length()
    // Replaces the characters in the code starting at
    // position p1 until position p2 - 1 inclusive with an X

    public void hide(int p1, int p2)
    {
        myCode = myCode.substring(0, p1)
                + xString.substring(p1, p2)
                + myCode.substring(p2, myCode.length());

    }

    // precondition: p1 >= 0, p1 < p2
    // 				 p2 <= myCode.length()
    // Restores to their original values the characters in
    // the code starting at position p1 until position
    // p2-1 inclusive
    public void recover(int p1, int p2)
    {
        myCode = myCode.substring(0, p1)
                + origCode.substring(p1, p2)
                + myCode.substring(p2, myCode.length());

    }
}
