class Student {

String name;
int age;
boolean isFemale;
char datamatikerTeam;

  public Student(String name, int age, boolean isFemale, char datamatikerTeam) {

    this.name = name;
    this.age = age;
    this.isFemale = isFemale;
    this.datamatikerTeam = datamatikerTeam;

  }

  public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean getIsFemale() {
		return isFemale;
	}
	public char getDatamatikerTeam() {
		return datamatikerTeam;
	}


}
