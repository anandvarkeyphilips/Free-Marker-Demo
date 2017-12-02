package io.javabrains;
public class RequestData {

		private Long id;
		private String name;
		private int population;

		public RequestData(Long id, String name, int population) {
			this.id = id;
			this.name = name;
			this.population = population;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPopulation() {
			return population;
		}

		public void setPopulation(int population) {
			this.population = population;
		}

		@Override
		public String toString() {
			return "RCMSUpiRequest{" + "id=" + id + ", name=" + name + ", population=" + population + '}';
		}
	}
