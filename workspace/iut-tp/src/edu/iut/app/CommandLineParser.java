package edu.iut.app;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;

/**
 * Class du praser de la ligne de commande.
 *
 */
public class CommandLineParser {
	
	protected HashMap<String,CommandLineOption<?>> options;
	protected ArrayList<String> parseErrors;
		
	/**
	 * Default builder.
	 */
	public CommandLineParser() {
		options = new HashMap<String, CommandLineOption<?>>();
		parseErrors = new ArrayList<String>();
	}
	
	/**
	 * @param option
	 * Ajout d'options.
	 */
	public void addOption(CommandLineOption<?> option) {
		if (option != null) {
			options.put(option.getKey(),option);
		}
	}
	
	/**
	 * @param args
	 * Parse selon le type des arguments envoy�s.
	 */
	public void parse(String[] args) {
		for (String argument: args) {
			String[] keyValue=argument.split("=");
			if (options.containsKey(keyValue[0])) {
				switch (((CommandLineOption<?>)options.get(keyValue[0])).getOptionType()) {
					case FILE:
						CommandLineOption<File> fileOption = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case STRING:
						CommandLineOption<String> StringOption = (CommandLineOption<String>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							StringOption.setValue(new String(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case INTEGER:
						CommandLineOption<Integer> IntegerOption = (CommandLineOption<Integer>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							IntegerOption.setValue(new Integer(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case DOUBLE:
						CommandLineOption<Double> DoubleOption = (CommandLineOption<Double>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							DoubleOption.setValue(new Double(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case NOVALUE:
						CommandLineOption<Void> voidOption = (CommandLineOption<Void>)options.get(keyValue[0]);
						break;

						
					default:
						parseErrors.add("Unrecognize option type.");						
				}
			}
		}
	}
	
	/**
	 * @param key
	 * @return
	 * getter option
	 */
	public CommandLineOption<?> getOption(String key) {
		if (options.containsKey(key)) {
			return options.get(key);
		}
		return null;
	}
	
	/**
	 * @return
	 * getter des ereurs de parse.
	 */
	public ArrayList<String> getErrors() {
		return parseErrors;
	}
	
}
