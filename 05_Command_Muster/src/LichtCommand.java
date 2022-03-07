public class LichtCommand implements Command{
    private Licht light;
    public LichtCommand(Licht light){
        this.light = light;
    }

   @Override
    public void execute() {
        if(this.light.licht){
            this.light.off();
        }else{
            this.light.on();
        }
    }
}
