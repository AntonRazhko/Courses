package Home_Task_10_Generics;

public enum SizeClothes {
    XXS(32) {
        @Override
        String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);

    int euroSize;

    SizeClothes(int euroSize) {
        this.euroSize = euroSize;
    }
    String getDescription(){
        return "Взрослый размер";
    }
    public int getEuroSize() {
        return euroSize;
    }
}
