public class PC {
    SSD ssd;
    CPU cpu;
    PC() {
        ssd = new SSD("Crucial T705", "2TB");
        cpu = new CPU("AMD");
    }
    public String toString() {
        return ("PC with CPU " + cpu.brand + " and SSD " + ssd.brand + " " + ssd.capacity);
    }
}
