package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;


public class GroupCreationTests extends TestBase {

    @Test
    public void canCreateGroup() {
        app.openGroupsPage();

        app.createGroup(new GroupData("group name", "group header", "group footer"));
    }

    @Test
    public void canCreateGroupWithEmpty() {
        app.openGroupsPage();
        app.createGroup(new GroupData());
    }

    @Test
    public void canCreateGroupWithNameOnly() {
        app.openGroupsPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("some name");
      //  createGroup(new GroupData().withName("some name"));
        app.createGroup(groupWithName);
    }
}
