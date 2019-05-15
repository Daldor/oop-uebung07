package ueb07;

class Student  {
	private int matrikel;
	private String name;

	/*
	public int compareTo(Student a){
		if (this.getMatrikel() > a.getMatrikel()){
			return 1;
		}
		else if (this.getMatrikel() == a.getMatrikel()){
			return 0;
		}
		else {
			return -1;
		}
	}

	 */

	public int compareTo(Student a){
		return name.compareTo(a.getName());
	}



	/*
	public <T extends Sortieren> boolean NameComparator(Student a){
		if(this.getName().compareTo(a.getName()) > 0){
			return true;
		} else {
			return false;
		}
	}

	 */

	/*
	public String compareTo(Student a){
		if (this.getName() > a.getName()){
			return 1;
		}
	}

	 */

	Student(int m, String n) {
		setMatrikel(m);
		setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		if (n == null)
			throw new IllegalArgumentException();
		name = n;
	}

	public int getMatrikel() {
		return matrikel;
	}

	public void setMatrikel(int m) {
		if (m <= 0)
			throw new IllegalArgumentException();
		matrikel = m;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Student))
			return false;

		Student s = (Student) o;

		return this.matrikel == s.matrikel && this.name.equals(s.name);
	}

	@Override
	public String toString() {
		return name + " (" + matrikel + ") [" + this.hashCode() + "]";
	}
}
