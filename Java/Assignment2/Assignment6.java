abstract class Persistance {
    abstract void persist();
}
class filePersistance extends Persistance{

    @Override
    void persist() {
        System.out.println("file persistance....! ");
    }
}
class DataBasePersistance extends Persistance{

    @Override
    void persist() {
        System.out.println("Database persistance..!");
    }
}
public class Assignment6 {
    public static void main(String[] args) {
        Persistance obj1 = new filePersistance();
        Persistance obj2 = new DataBasePersistance();
        obj1.persist();;
        obj2.persist();
    }
}