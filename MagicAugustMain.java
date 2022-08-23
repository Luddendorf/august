public class MagicAugustMain {

   public boolean hasUserAgreedToTeams;

   public static void main(String[] args){
	  System.out.println("Hello August");
	}

    public String getMyName(String name) {
        return name;
    }

    public boolean getCheckboxStatus(boolean newStatus) {
        this.hasUserAgreedToTeams = !this.hasUserAgreedToTeams;

        return this.hasUserAgreedToTeams
    }
}