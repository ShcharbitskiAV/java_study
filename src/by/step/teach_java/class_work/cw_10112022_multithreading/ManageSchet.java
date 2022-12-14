package by.step.teach_java.class_work.cw_10112022_multithreading;

public class ManageSchet implements Runnable {

    private Schet schet;
    private Person person;

    public ManageSchet(Schet schet, Person person) {
        this.schet = schet;
        this.person = person;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.currentThread().setName("person name is: " + person.name);
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
                schet.getMyMoney(person.sum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
