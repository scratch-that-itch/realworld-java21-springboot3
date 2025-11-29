public record LipstickRecord(LipstickType type, String brand) {
    public LipstickRecord {
        if(brand != null && brand.startsWith("L")) {
            System.out.println("Special discount for you!");
        }
    }
}
