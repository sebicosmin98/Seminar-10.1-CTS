public class Main {
    public static void main(String[] args) {


        File f1 = new File("primul");
        f1.print();

        FileSnapshot fs1 = f1.createFileSnapshot("1");

        VersionControlSystem system = new VersionControlSystem();
        system.addSnapshot(fs1);
        system.printSnapshots();

        f1.setContent("al doilea");
        f1.print();
        system.printSnapshots();

        system.addSnapshot(f1.createFileSnapshot("2"));
        f1.restoreFileContent(system.getFileSnapshot("1"));
        f1.print();
    }
}
