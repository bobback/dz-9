public class Woman extends Person {
    private Man partner;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Man getPartner() {
        return partner;
    }

    public void setPartner(Man partner) {
        this.partner = partner;
    }

    public void registerPartnership(Man man) {
        if (partner != null) {
            partner.deregisterPartnership(false);
        }
        partner = man;
        setLastName(man.getLastName());
    }

    public void deregisterPartnership(boolean returnToPreviousLastName) {
        if (partner != null) {
            if (returnToPreviousLastName) {
                setLastName(partner.getLastName());
            }
            partner.setPartner(null);
            partner = null;
        }
    }
}
