package sec01.chap04.ex14;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            dirtyOperation();
        }
    }

    public static void dirtyOperation() {
        try (SuicideSquad sc = new SuicideSquad()){
            sc.doSecretTask();
        } catch (OpFailException e) {
            e.printStackTrace();
            System.out.println("증거인멸");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
