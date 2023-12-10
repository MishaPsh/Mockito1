package myxap.makeMockito;

public class DataSearchRequest {
    String id;
    //Data updatedBefore;
    int length;

    public DataSearchRequest() {
    }

    public DataSearchRequest(String id, Data updatedBefore, int length) {
        this.id = id;
        this.updatedBefore = updatedBefore;
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data getUpdatedBefore() {
        return updatedBefore;
    }

    public void setUpdatedBefore(Data updatedBefore) {
        this.updatedBefore = updatedBefore;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
