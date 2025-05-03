package application.event;

import javafx.event.Event;
import javafx.event.EventType;

public class PercentageValueChangedEvent extends Event {
	public static String TYPE = "VALUE_CHANGED";
	private double newPercentageValue;
	public final static EventType<PercentageValueChangedEvent> VALUE_CHANGED = new EventType<>(TYPE);

	public PercentageValueChangedEvent(Object source, double newPercentageValue) {
		super(VALUE_CHANGED);
		this.newPercentageValue = newPercentageValue;
	}

	public double getNewValue() {
		return newPercentageValue;
	}
}
