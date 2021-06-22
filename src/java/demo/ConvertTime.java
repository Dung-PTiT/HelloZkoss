package demo;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

public class ConvertTime extends SelectorComposer {

    @Wire
    Textbox textbox;

    @Wire
    Label result;

    @Listen("onChange = textbox#textbox")
    public void showText() {
        Long timestamp = Long.parseLong(textbox.getText());
        result.setValue(String.valueOf(timestamp));
    }
}
