public class DeadState extends ThreadState{
    public DeadState(){
        state = StateSet.DEAD;
        System.out.println("线程死亡");
    }
}
