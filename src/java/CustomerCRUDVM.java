
import java.util.HashMap;
import java.util.Map;
import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.bind.annotation.ExecutionArgParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

public class CustomerCRUDVM {

    private Customer selectedCustomer;
    private String recordMode;

    public String getRecordMode() {
        return recordMode;
    }

    public void setRecordMode(String recordMode) {
        this.recordMode = recordMode;
    }

    public Customer getSelectedCustomer() {
        return selectedCustomer;
    }

    public void setSelectedCustomer(Customer selectedCustomer) {
        this.selectedCustomer = selectedCustomer;
    }

    @Init
    public void initSetup(@ContextParam(ContextType.VIEW) Component view,
            @ExecutionArgParam("sCustomer") Customer c1,
            @ExecutionArgParam("recordMode") String recordMode) {

        setRecordMode(recordMode);
        if (recordMode.equals("NEW")) {
            this.selectedCustomer = new Customer();
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Command
    public void save() {
        Map args = new HashMap();
        args.put("pCustomer", this.selectedCustomer);
        args.put("recordMode", this.recordMode);
        BindUtils.postGlobalCommand(null, null, "updateCustomerList", args);
    }

}
