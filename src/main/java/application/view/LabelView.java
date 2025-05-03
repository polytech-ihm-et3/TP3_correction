package application.view;

import javafx.scene.control.Label;
import application.event.PercentageValueChangedEvent;
import application.event.PercentageValueListener;

public class LabelView extends Label implements ViewInterface, PercentageValueListener {
	@Override
	public void update(double value) {
		setText(value + "%");
	}

	@Override
	public void percentageValueChanged(PercentageValueChangedEvent event) {
		update(Math.round(event.getNewValue() * 100));
	}
}