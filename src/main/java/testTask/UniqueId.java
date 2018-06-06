package testTask;

public class UniqueId {
    int count = 0;

    public String generateUniqueId() {
        Long numericalId = System.currentTimeMillis();
        Long random = (long)(Math.random()*100000000);
        String id = new String().valueOf( random + numericalId);
        if(Ids.existingIds.contains(id)) {
            generateUniqueId();
            count++;
        } else {
            Ids.existingIds.add(id);
        }

        return id;
    }
}
