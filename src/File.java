public class File {

    private String content;

    public File(String content) {

        this.content = content;

    }

    public void print(){

        System.out.println("Content: " + content);
    }

    public FileSnapshot createFileSnapshot(String comment){

        FileSnapshot fileSnapshot = new FileSnapshot(this.content, comment);

        return fileSnapshot;
    }



    public void restoreFileContent(FileSnapshot fileSnapshot){

        if(fileSnapshot != null) {

            this.content = fileSnapshot.getContent();

        }
    }



    public void setContent(String content) {

        this.content = content;
    }

    public String getContent() {
        return content;
    }





}
