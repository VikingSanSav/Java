package home;


class User {
    public int id;
    public String name;

    public  User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals (Object other) {
        if (this == other) return true;
        if (other==null) return false;
        if (!(other instanceof User)) return false;

        User userOther = (User) other;
        return id==userOther.id && name!=null && name == ((User) other).name;

    }

}

class Admin extends User {

    public Admin(int id, String name) {
        super(id, name);
    }
    @Override
    public boolean equals (Object other) {
        if (this == other) return true;
        if (other==null) return false;
        if (!(other instanceof User)) return false;

        User userOther = (User) other;
        return id==userOther.id && name!=null && name == ((User) other).name;
    }

}