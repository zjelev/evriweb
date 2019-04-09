/*
 * Page1.java
 *
 * Created on 2008-6-27, 21:10:20
 */
package evriweb;

import com.sun.data.provider.RowKey;
import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableRowGroup;
import javax.faces.FacesException;
import javax.faces.convert.IntegerConverter;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author ZJelev
 */
public class Page1 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        empDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.empRowSet}"));
        contactsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.contactsRowSet}"));
        relationDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.relationRowSet}"));
    }
    private CachedRowSetDataProvider empDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getEmpDataProvider() {
        return empDataProvider;
    }

    public void setEmpDataProvider(CachedRowSetDataProvider crsdp) {
        this.empDataProvider = crsdp;
    }
    private IntegerConverter usernameConverter = new IntegerConverter();

    public IntegerConverter getUsernameConverter() {
        return usernameConverter;
    }

    public void setUsernameConverter(IntegerConverter ic) {
        this.usernameConverter = ic;
    }
    private DropDown username = new DropDown();

    public DropDown getUsername() {
        return username;
    }

    public void setUsername(DropDown dd) {
        this.username = dd;
    }
    private Table table1 = new Table();

    public Table getTable1() {
        return table1;
    }

    public void setTable1(Table t) {
        this.table1 = t;
    }
    private CachedRowSetDataProvider contactsDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getContactsDataProvider() {
        return contactsDataProvider;
    }

    public void setContactsDataProvider(CachedRowSetDataProvider crsdp) {
        this.contactsDataProvider = crsdp;
    }
    private CachedRowSetDataProvider relationDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getRelationDataProvider() {
        return relationDataProvider;
    }

    public void setRelationDataProvider(CachedRowSetDataProvider crsdp) {
        this.relationDataProvider = crsdp;
    }
    private IntegerConverter dropDown1Converter = new IntegerConverter();

    public IntegerConverter getDropDown1Converter() {
        return dropDown1Converter;
    }

    public void setDropDown1Converter(IntegerConverter ic) {
        this.dropDown1Converter = ic;
    }
    private Form form1 = new Form();

    public Form getForm1() {
        return form1;
    }

    public void setForm1(Form f) {
        this.form1 = f;
    }
    private Button save = new Button();

    public Button getSave() {
        return save;
    }

    public void setSave(Button b) {
        this.save = b;
    }
    private Button selectRow = new Button();

    public Button getSelectRow() {
        return selectRow;
    }

    public void setSelectRow(Button b) {
        this.selectRow = b;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Page1() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

    // </editor-fold>
    // Perform application initialization that must complete
    // *after* managed components are initialized
    // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
        if (username.getSelected() == null) {
            Object firstEmpId = null;
            try {
                empDataProvider.cursorFirst();
                firstEmpId = empDataProvider.getValue("emp.nom");
                username.setSelected(firstEmpId);
                getSessionBean1().getContactsRowSet().setObject(1, firstEmpId);
                contactsDataProvider.refresh();
            } catch (Exception e) {
                error("Cannot switch to person " + firstEmpId);
                log("Cannot switch to person " + firstEmpId, e);
            }
        }
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
        empDataProvider.close();
        contactsDataProvider.close();
        relationDataProvider.close();
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public void username_processValueChange(ValueChangeEvent event) {
        Object selectedEmpId = username.getSelected();
        try {
            empDataProvider.setCursorRow(
                    empDataProvider.findFirst("emp.nom",selectedEmpId));
            getSessionBean1().getContactsRowSet().setObject(1, selectedEmpId);
            contactsDataProvider.refresh();
            form1.discardSubmittedValues("save");
        } catch (Exception e) {
            error("Cannot switch to person " + selectedEmpId);
            log("Cannot switch to person " + selectedEmpId, e);
        }
    }

    public String add_action() {
        try {
            RowKey rk = contactsDataProvider.appendRow();
            contactsDataProvider.setCursorRow(rk);

            contactsDataProvider.setValue("contacts.nom", new Integer(0));
            contactsDataProvider.setValue("contacts.company", new String());
            contactsDataProvider.setValue("contacts.relation", new Integer(1));
            contactsDataProvider.setValue("contacts.address", new String());
            contactsDataProvider.setValue("contacts.town", new String());
            contactsDataProvider.setValue("contacts.country", new String());
            contactsDataProvider.setValue("contacts.representative", new String());
            contactsDataProvider.setValue("contacts.phone", new String());
            contactsDataProvider.setValue("contacts.GSM", new String());
            contactsDataProvider.setValue("contacts.fax", new String());
            contactsDataProvider.setValue("contacts.email", new String());
            contactsDataProvider.setValue("contacts.inactive", new Boolean(false));
            contactsDataProvider.setValue("contacts.responsible", username.getSelected());
            
        } catch (Exception ex) {
            log("Error Description", ex);
            error(ex.getMessage());
        } 
        return null;
    }

    public String save_action() {
        try {

            // Get the next key, using result of query on MaxTrip data provider
            CachedRowSetDataProvider maxContacts = getSessionBean1().getMaxContactsDataProvider();
            maxContacts.refresh();
            maxContacts.cursorFirst();
            int newContactNom = ((Long) maxContacts.getValue("MAXNOM")).intValue();

            // Navigate through rows with data provider
            if (contactsDataProvider.getRowCount() > 0) {
                contactsDataProvider.cursorFirst();
                do {
                    if (contactsDataProvider.getValue("contacts.nom").equals (new Integer(0))) {
                        contactsDataProvider.setValue("contacts.nom",
						new Integer(newContactNom));
                        newContactNom++;
                    }

                } while (contactsDataProvider.cursorNext());
            }
            contactsDataProvider.commitChanges();
            contactsDataProvider.refresh();
        } catch (Exception ex) {
            log("Error Description", ex);
            error("Error :"+ex.getMessage());
        }
        return "case1";
    }

    public String revert_action() {
        form1.discardSubmittedValues("save");
        try {
            contactsDataProvider.refresh();

        } catch (Exception ex) {
            log("Error Description", ex);
            error(ex.getMessage());
        }
        return null;
    }

    public int selectRow_action() {
        // Find out what row was clicked
        RowKey rowKey = tableRowGroup1.getRowKey();
        // Save product number so detail page knows what product to
        // provide detail info for
      //getRequestBean1().setInNom(contactsDataProvider.getValue("nom", rowKey));
        //info("Row " + selectedRow1  + " is selected");
      //return "case2";
        int selectedRow1 = ((Integer)contactsDataProvider.getValue("nom", rowKey)).intValue();
        info("Row " + selectedRow1  + " is selected");
        return selectedRow1;
      }
}

