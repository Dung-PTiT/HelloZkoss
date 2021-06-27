
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Messagebox;

public class CustomerListVM {

    private List<Customer> customerList = new ArrayList<Customer>();
    private Customer curSelectedCustomer;

    public Customer getCurSelectedCustomer() {
        return curSelectedCustomer;
    }

    public void setCurSelectedCustomer(Customer curSelectedCustomer) {
        this.curSelectedCustomer = curSelectedCustomer;
    }

    @Init
    public void initSetup() {
        customerList = new CustomerData().getAllCustomers();
    }

    public List<Customer> getallCustomers() {
        return customerList;
    }

    @Command
    public void editThisCustomer() {
        Messagebox.show("Edit Existing Customer Code goes here");
    }

    @GlobalCommand
    @NotifyChange("allCustomers")
    public void updateCustomerList(@BindingParam("pCustomer") Customer cust1,
            @BindingParam("recordMode") String recordMode) {
        if (recordMode.equals("NEW")) {
            customerList.add(cust1);
        }
    }

    @Command
    public void deleteThisCustomer() {
        Messagebox.show("Delete Existing Customer Code goes here");
    }

}
