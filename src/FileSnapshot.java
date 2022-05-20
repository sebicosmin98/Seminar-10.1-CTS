public class FileSnapshot {

    private String content;
    private String comment;

    public FileSnapshot(String content,String comment) {
        this.content = content;
        this.comment = comment;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FileSnapshot{");
        sb.append("content='").append(content).append('\'');
        sb.append(", comment='").append(comment).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
