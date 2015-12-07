package edu.iut.app;

/**
 * 
 * Classe de définition des options de la ligne de commande.
 * @param <ValueType>
 */
public class CommandLineOption <ValueType>{
	

	public enum OptionType{
		NONE("None"),
		FILE("File"),
		STRING("String"),
		INTEGER("Integer"),
		DOUBLE("Double"),
		NOVALUE("NoValue");
		private String optionType;
		
		OptionType(String optionType) {
			this.optionType = optionType;
		}
		
		public String toString() {
			return optionType;
		}		
	}
	
	/**
	 * Default Builder.
	 */
	public CommandLineOption() {
		this(OptionType.NONE, "", "", null);
		/* EX1: Initializer les attributs */
	}
	/**
	 * @param optionType
	 * @param key
	 * @param description
	 * @param defaultValue
	 * Alt Builder.
	 */
	public CommandLineOption(final OptionType optionType, final String key, final String description, final ValueType defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
	}
	

	
	/**
	 * @param optionType
	 * @param key
	 * @param description
	 * @param defaultValue
	 * Setter.
	 */
	public void setOption(OptionType optionType, String key, String description, ValueType defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
	}
	/**
	 * @param value
	 * setter value.
	 */
	public  void setValue(ValueType value) {
		this.value = value;
	}
		
	/**
	 * Getter key.
	 * @return
	 */
	
	public String getKey() {
		return this.key;
	}
	/**
	 * @return
	 * getter desc.
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * @return
	 * getter value.
	 */
	public ValueType getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	/**
	 * @return
	 * getter option type.
	 */
	public OptionType getOptionType() {
		return optionType;
	}

	protected String key;
	protected String description;
	protected ValueType defaultValue;
	protected ValueType value;
	protected OptionType optionType;
	

}
