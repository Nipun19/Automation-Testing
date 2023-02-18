package Frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();

        String text1 = "Hello";
        editorPage.clearTextArea();
        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        assertEquals(editorPage.getTextFromEditor(), text1, "Text Frame is incorrect");
    }

}
