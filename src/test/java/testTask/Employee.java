package testTask;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

// final class cannot be extended
// Immutable Employee class
public final class Employee {

    private final String name;
    private final Date date;
    private final int pid;
    private final List<String> capabilities;
    private final HashMap<String, String> works;

    public Employee(String name, int pid, List<String> capabilities, Date date, HashMap works) {
        this.name = name;
        this.pid = pid;
        // deep copy
        List<String> capCopy = new ArrayList<>();
        for(String capability : capabilities) {
            capCopy.add(capability);
        }
        this.capabilities = capCopy;
        this.date = new Date(date.getTime());
        this.works = new HashMap<>(works);
    }

    public String getName() {
        return name;
    }

    public Integer getPid() {
        return pid;
    }

    public List<String> getCapabilities() {
        return new ArrayList<>(capabilities);
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public HashMap<String, String> getWorks() {
        return new HashMap<>(works);
    }

    @Override
    public String toString() {
        return "name: " + getName() +
                "; id: " + getPid() +
                "; capabilities: " + capabilities +
                "; date: " + date +
                "; works: " + works;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee) {
            Employee comparObject = (Employee) obj;
            return comparObject.getName().equals(this.getName()) && comparObject.getPid().equals(this.getPid()) &&
                    comparObject.getCapabilities().equals(this.capabilities) &&
                    comparObject.getDate().equals(this.date) && comparObject.works.equals(this.works);
        }
        return false;
    }


   /** A common source of bugs is the failure to override the hashCode method. HashCode
    * must be overridden in every class that overrides equals. Failure to do so
    * will result in a violation of the general contract for Object.hashCode, which will
    * prevent your class from functioning properly in conjunction with all hash-based
    * collections, including HashMap, HashSet, and Hashtable.
    * */
    @Override
    public int hashCode() {
        return 1;
        //        return 31 * this.getName().hashCode() + this.getPid();
    }

}
