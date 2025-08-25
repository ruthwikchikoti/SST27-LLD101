public class OrderController {

    private Save repo;
    public OrderController(Save repo){
        this.repo = repo;
    }

    public void create(String id){
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}