package com.mode.create;

public class ManBuilder implements IPersonBuilder {
	
	private Person person;

    public ManBuilder() {
        person = new Person();
    }

	@Override
	public void buildHead() {
		person.setHead("��������ͷ");
	}

	@Override
	public void buildBody() {
		person.setBody("������������");
	}

	@Override
	public void buildFoot() {
		person.setFoot("�������˽�");
	}

	@Override
	public Person buildPerson() {
		return this.person;
	}

}
