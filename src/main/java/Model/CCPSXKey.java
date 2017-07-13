package Model;

public class CCPSXKey {
    private String frdmU;

    private String cpbhU;

    public String getFrdmU() {
        return frdmU;
    }

    public void setFrdmU(String frdmU) {
        this.frdmU = frdmU == null ? null : frdmU.trim();
    }

    public String getCpbhU() {
        return cpbhU;
    }

    public void setCpbhU(String cpbhU) {
        this.cpbhU = cpbhU == null ? null : cpbhU.trim();
    }
}