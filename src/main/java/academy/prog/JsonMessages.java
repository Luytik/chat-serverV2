package academy.prog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsonMessages {
    private final List<Message> list = new ArrayList<>();
    private int step;

    public JsonMessages(List<Message> sourceList, int fromIndex, String toAccountName) {
        for (int i = fromIndex; i < sourceList.size(); i++) {
            if (sourceList.get(i).getTo().equals(toAccountName))
                list.add(sourceList.get(i));
            else if (sourceList.get(i).getTo().equals("all"))
                list.add(sourceList.get(i));
        }

        step = sourceList.size();

    }
}
