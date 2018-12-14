package structural.adapter;

public class MainClientEngine {
    public static void main(String[] args) {
        //1) Inheritance
        CarAdapterForRails_Inheritance carAdapterInheritance = new CarAdapterForRails_Inheritance();
        carAdapterInheritance.rideOnRails();
        carAdapterInheritance.makeCHUH_CHUH();

        //2) Composition
        CarAdapterForRails_Composition carAdapterComposition = new CarAdapterForRails_Composition();
        carAdapterComposition.rideOnRails();
        carAdapterComposition.makeCHUH_CHUH();
    }
}
