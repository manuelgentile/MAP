package it.cnr.itd.uni2014.javafx.service;

import java.util.concurrent.atomic.AtomicBoolean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.Worker;

public class Model {
	public Worker<String> worker;
	public AtomicBoolean shouldThrow = new AtomicBoolean(false);
	public IntegerProperty numberOfItems = new SimpleIntegerProperty(250);

	public Model() {
		worker = new Service<String>() {
			@Override
			protected Task createTask() {
				return new Task<String>() {
					@Override
					protected String call() throws Exception {
						updateTitle("Example Service");
						updateMessage("Starting...");
						final int total = numberOfItems.get();
						updateProgress(0, total);
						for (int i = 1; i <= total; i++) {
							if (isCancelled()) {
								updateValue("Canceled at "
										+ System.currentTimeMillis());
								return null; // ignored
							}
							try {
								Thread.sleep(20);
							} catch (InterruptedException e) {
								if (isCancelled()) {
									updateValue("Canceled at "
											+ System.currentTimeMillis());
									return null; // ignored
								}
							}
							if (shouldThrow.get()) {
								throw new RuntimeException(
										"Exception thrown at "
												+ System.currentTimeMillis());
							}
							updateTitle("Example Service (" + i + ")");
							updateMessage("Processed " + i + " of " + total
									+ " items.");
							updateProgress(i, total);
						}
						return "Completed at " + System.currentTimeMillis();
					}
				};
			}
		};
	}
}