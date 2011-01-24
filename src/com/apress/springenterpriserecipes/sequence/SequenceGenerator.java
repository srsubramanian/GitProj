package com.apress.springenterpriserecipes.sequence;

import org.springframework.beans.factory.annotation.Required;

 
	
	public class SequenceGenerator {
		private String prefix;
		private String suffix;
		private int initial;
		private int counter;
		private PrefixGenerator prefixGenerator;

	    public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
	        this.prefixGenerator = prefixGenerator;
	    }
		
		public SequenceGenerator() {}
		public SequenceGenerator(String prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
		}
		@Required
		public void setPrefix(String prefix) {
		this.prefix = prefix;
		}
		public void setSuffix(String suffix) {
		this.suffix = suffix;
		}
		public void setInitial(int initial) {
		this.initial = initial;
		}
		public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefixGenerator.getPrefix());
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
		}

}
