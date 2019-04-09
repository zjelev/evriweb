/*
 * SessionBean1.java
 *
 * Created on 2008-6-27, 21:10:19
 */
 
package evriweb;

import com.sun.data.provider.impl.CachedRowSetDataProvider;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import com.sun.sql.rowset.CachedRowSetXImpl;
import javax.faces.FacesException;

/**
 * <p>Session scope data bean for your application.  Create properties
 *  here to represent cached data that should be made available across
 *  multiple HTTP requests for an individual user.</p>
 *
 * <p>An instance of this class will be created for you automatically,
 * the first time your application evaluates a value binding expression
 * or method binding expression that references a managed bean using
 * this class.</p>
 *
 * @author ZJelev
 */
public class SessionBean1 extends AbstractSessionBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        empRowSet.setDataSourceName("java:comp/env/jdbc/evricom_MySQL");
        empRowSet.setCommand("SELECT * FROM emp");
        empRowSet.setTableName("emp");
        contactsRowSet.setDataSourceName("java:comp/env/jdbc/evricom_MySQL");
        contactsRowSet.setCommand("SELECT ALL contacts.nom, contacts.company, contacts.relation, contacts.representative, contacts.position, contacts.address, contacts.town, contacts.country, contacts.phone, contacts.`GSM`, contacts.fax, contacts.email, contacts.responsible, contacts.inactive, contacts.christmas, contacts.activity  FROM contacts WHERE contacts.responsible = ?          AND contacts.inactive = 0");
        contactsRowSet.setTableName("contacts");
        relationRowSet.setDataSourceName("java:comp/env/jdbc/evricom_MySQL");
        relationRowSet.setCommand("SELECT * FROM relation");
        relationRowSet.setTableName("relation");
        maxContactsDataProvider.setCachedRowSet((javax.sql.rowset.CachedRowSet) getValue("#{SessionBean1.maxContactsRowSet}"));
        maxContactsRowSet.setDataSourceName("java:comp/env/jdbc/evricom_MySQL");
        maxContactsRowSet.setCommand("SELECT MAX(contacts.nom)+1 AS MAXNOM FROM contacts");
        maxContactsRowSet.setTableName("contacts");
        incomingRowSet1.setDataSourceName("java:comp/env/jdbc/evricom_MySQL");
        incomingRowSet1.setCommand("SELECT ALL incoming.nom, incoming.dat, incoming.company, incoming.type, incoming.empl, incoming.content, incoming.requestfor, incoming.orderto  FROM incoming WHERE incoming.company = ?");
        incomingRowSet1.setTableName("incoming");
        outgoingRowSet.setDataSourceName("java:comp/env/jdbc/evricom_MySQL");
        outgoingRowSet.setCommand("SELECT * FROM outgoing");
        outgoingRowSet.setTableName("outgoing");
    }
    private CachedRowSetXImpl empRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getEmpRowSet() {
        return empRowSet;
    }

    public void setEmpRowSet(CachedRowSetXImpl crsxi) {
        this.empRowSet = crsxi;
    }
    private CachedRowSetXImpl contactsRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getContactsRowSet() {
        return contactsRowSet;
    }

    public void setContactsRowSet(CachedRowSetXImpl crsxi) {
        this.contactsRowSet = crsxi;
    }
    private CachedRowSetXImpl relationRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getRelationRowSet() {
        return relationRowSet;
    }

    public void setRelationRowSet(CachedRowSetXImpl crsxi) {
        this.relationRowSet = crsxi;
    }
    private CachedRowSetDataProvider maxContactsDataProvider = new CachedRowSetDataProvider();

    public CachedRowSetDataProvider getMaxContactsDataProvider() {
        return maxContactsDataProvider;
    }

    public void setMaxContactsDataProvider(CachedRowSetDataProvider crsdp) {
        this.maxContactsDataProvider = crsdp;
    }
    private CachedRowSetXImpl maxContactsRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getMaxContactsRowSet() {
        return maxContactsRowSet;
    }

    public void setMaxContactsRowSet(CachedRowSetXImpl crsxi) {
        this.maxContactsRowSet = crsxi;
    }
    private CachedRowSetXImpl incomingRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getIncomingRowSet() {
        return incomingRowSet;
    }

    public void setIncomingRowSet(CachedRowSetXImpl crsxi) {
        this.incomingRowSet = crsxi;
    }
    private CachedRowSetXImpl incomingRowSet1 = new CachedRowSetXImpl();

    public CachedRowSetXImpl getIncomingRowSet1() {
        return incomingRowSet1;
    }

    public void setIncomingRowSet1(CachedRowSetXImpl crsxi) {
        this.incomingRowSet1 = crsxi;
    }
    private CachedRowSetXImpl outgoingRowSet = new CachedRowSetXImpl();

    public CachedRowSetXImpl getOutgoingRowSet() {
        return outgoingRowSet;
    }

    public void setOutgoingRowSet(CachedRowSetXImpl crsxi) {
        this.outgoingRowSet = crsxi;
    }
    // </editor-fold>

    /**
     * <p>Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
    }

    /**
     * <p>This method is called when this bean is initially added to
     * session scope.  Typically, this occurs as a result of evaluating
     * a value binding or method binding expression, which utilizes the
     * managed bean facility to instantiate this bean and store it into
     * session scope.</p>
     * 
     * <p>You may customize this method to initialize and cache data values
     * or resources that are required for the lifetime of a particular
     * user session.</p>
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
            log("SessionBean1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>This method is called when the session containing it is about to be
     * passivated.  Typically, this occurs in a distributed servlet container
     * when the session is about to be transferred to a different
     * container instance, after which the <code>activate()</code> method
     * will be called to indicate that the transfer is complete.</p>
     * 
     * <p>You may customize this method to release references to session data
     * or resources that can not be serialized with the session itself.</p>
     */
    @Override
    public void passivate() {
    }

    /**
     * <p>This method is called when the session containing it was
     * reactivated.</p>
     * 
     * <p>You may customize this method to reacquire references to session
     * data or resources that could not be serialized with the
     * session itself.</p>
     */
    @Override
    public void activate() {
    }

    /**
     * <p>This method is called when this bean is removed from
     * session scope.  Typically, this occurs as a result of
     * the session timing out or being terminated by the application.</p>
     * 
     * <p>You may customize this method to clean up resources allocated
     * during the execution of the <code>init()</code> method, or
     * at any later time during the lifetime of the application.</p>
     */
    @Override
    public void destroy() {
        maxContactsDataProvider.close();
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

}
