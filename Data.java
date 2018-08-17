package javaClasses;


// TODO make a base data class that will hold the String data for the controllers. There should also be getters and setters and all the attributes should be private.
public class Data {

		private String col0, col1, col2, col3, col4, col5, col6, col7, col8, col9;
		private int count;
		
		/**
		 * Constructor used specifically to instantiate an object with exported tag values.
		 * @param type
		 * @param scope
		 * @param name
		 * @param description
		 * @param datatype
		 * @param specification
		 * @param attribute
		 * @param ct
		 */
		public Data(String type, String scope, String name, String description, String datatype, String specification, String attribute, 
				int ct){
			this.col0 = type;
			this.col1 = scope;
			this.col2 = name;
			this.col3 = description;
			this.col4 = datatype;
			this.col5 = specification;
			this.col6 = attribute;
			this.count = ct;
		}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
