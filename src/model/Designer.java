public class Designer extends Freelancer {

    private String designTool;

    public Designer(int id, String name, String email, String designTool) {
        super(id, name, email);
        this.designTool = designTool;
    }

    public String getDesignTool() {
        return designTool;
    }

    public void setDesignTool(String designTool) {
        this.designTool = designTool;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Designer");
    }

    public void displayDesignerInfo() {
        displayFreelancerInfo();
        System.out.println("Design Tool: " + designTool);
    }
}