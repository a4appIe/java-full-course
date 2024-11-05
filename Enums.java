enum Status {
    Running, Failed, Pending, Success; // objects of Status enum/class // by default are static;;;
}

public class Enums {
    public static void main(String[] args) {
        Status status = Status.Running;
        // for(Status s: status){
        // System.out.println(s);
        // }
        switch (status) {
            case Running:
                System.out.println("running..");
                break;
            case Failed:
                System.out.println("failed..");
                break;
            case Pending:
                System.out.println("pending..");
                break;
            case Success:
                System.out.println("success..");
                break;
            default:
                System.out.println("default..");
                break;
        }

        if (status == Status.Running) {
            System.out.println("running..");

        } else if (status == Status.Pending) {
            System.out.println("pending..");

        } else if (status == Status.Failed) {
            System.out.println("failed..");
        } else {
            System.out.println("success..");
        }
    }
}
