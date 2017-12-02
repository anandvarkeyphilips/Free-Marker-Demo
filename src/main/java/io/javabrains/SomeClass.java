package io.javabrains;
public class SomeClass {
		public int SomeClassId = 1;
		public String SomeClassName = "ClassNameTest";

		public SomeClass(int someClassId, String someClassName) {
			SomeClassId = someClassId;
			SomeClassName = someClassName;
		}

		public int getSomeClassId() {
			return SomeClassId;
		}

		public void setSomeClassId(int someClassId) {
			SomeClassId = someClassId;
		}

		public String getSomeClassName() {
			return SomeClassName;
		}

		public void setSomeClassName(String someClassName) {
			SomeClassName = someClassName;
		}

	}