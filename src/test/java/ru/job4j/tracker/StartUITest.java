package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        String nameItem = "Item name";
        StubOutput output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", nameItem, "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction()
        };

        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), containsString(nameItem));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(itemTest.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(itemTest.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Deleted item"));
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(itemTest.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(itemTest.getId()), is(nullValue()));
    }

    @Test
    public void whenShowAllItem() {
        Tracker tracker = new Tracker();
        String nameItem = "Test";
        Item itemTest = tracker.add(new Item(nameItem));
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(itemTest.getId()).getName(), is(nameItem));
    }

    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Test"));
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(itemTest.getId()), "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(itemTest.getId()).getId(), is(itemTest.getId()));
    }

    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Test"));
        String findByName = "Test";
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", findByName, "1"}
        );
        UserAction[] actions = {
                new FindIByNameAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(itemTest.getId()).getName(), is(findByName));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. Exit" + System.lineSeparator()
        ));
    }
}