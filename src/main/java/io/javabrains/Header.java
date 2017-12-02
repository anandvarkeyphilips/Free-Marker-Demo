package io.javabrains;
public class Header {
		public String headerDetailName = "headerDetailNameTest";
		public SomeClass obj;

		public String getHeaderDetailName() {
			return headerDetailName;
		}

		public void setHeaderDetailName(String headerDetailName) {
			this.headerDetailName = headerDetailName;
		}

		public SomeClass getObj() {
			return obj;
		}

		public void setObj(SomeClass obj) {
			this.obj = obj;
		}

		public Header(String headerDetailName, SomeClass obj) {
			this.headerDetailName = headerDetailName;
			this.obj = obj;
		}

	}