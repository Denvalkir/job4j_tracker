package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction()
        };

        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), containsString("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(itemTest.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), containsString("Заявка изменена успешно"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Deleted item"));
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(itemTest.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), containsString("Заявка удалена успешно."));
    }

    @Test
    public void whenShowAllItem() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Test"));
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString(), is(
                "Menu." + ln
                        + "0. Show All Items" + ln
                        + "1. Exit" + ln
                        + "=== Show all items ====" + ln
                        + itemTest + ln
                        + "Menu." + ln
                        + "0. Show All Items" + ln
                        + "1. Exit" + ln
                )
        );
    }

    @Test
    public void whenFindItemById() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Test"));
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(itemTest.getId()), "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString(), is(
                "Menu." + ln
                        + "0. Find item by id" + ln
                        + "1. Exit" + ln
                        + "=== Find item by id ====" + ln
                        + itemTest + ln
                        + "Menu." + ln
                        + "0. Find item by id" + ln
                        + "1. Exit" + ln
                )
        );
    }

    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item itemTest = tracker.add(new Item("Test"));
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", itemTest.getName(), "1"}
        );
        UserAction[] actions = {
                new FindIByNameAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString(), is(
                "Menu." + ln
                        + "0. Find items by name" + ln
                        + "1. Exit" + ln
                        + "=== Find items by name ====" + ln
                        + itemTest + ln
                        + "Menu." + ln
                        + "0. Find items by name" + ln
                        + "1. Exit" + ln
                )
        );
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