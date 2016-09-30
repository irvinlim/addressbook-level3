package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub extends Storage {

	public StorageStub(String path) {
		// Intentionally left blank.
	}

	@Override
	public void save(AddressBook addressBook) throws StorageOperationException {
		// Intentionally left blank.
	}

	@Override
	public AddressBook load() throws StorageOperationException {
		// Intentionally left blank.
		return null;
	}

	@Override
	public String getPath() {
		// Intentionally left blank.
		return null;
	}

}
