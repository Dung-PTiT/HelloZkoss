
import org.zkoss.zk.ui.*;
import org.zkoss.zk.ui.event.*;
import org.zkoss.zk.ui.util.*;
import org.zkoss.zk.ui.ext.*;
import org.zkoss.zk.au.*;
import org.zkoss.zk.au.out.*;
import org.zkoss.zul.*;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.Listen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class CustomerCRUDComposer extends SelectorComposer<Component> {

    @Wire("#CustomerCRUD")
    private Window win;

    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
    }

    @Listen("onClick = #submitNewCustomer, #cancelNewCustomer")
    public void closeThis() {
        win.detach();
    }

}
