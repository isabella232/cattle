/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "volume", schema = "cattle")
public class VolumeRecord extends org.jooq.impl.UpdatableRecordImpl<io.cattle.platform.core.model.tables.records.VolumeRecord> implements io.cattle.platform.db.jooq.utils.TableRecordJaxb, io.cattle.platform.core.model.Volume {

	private static final long serialVersionUID = -1266632128;

	/**
	 * Setter for <code>cattle.volume.id</code>.
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cattle.volume.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cattle.volume.name</code>.
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cattle.volume.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cattle.volume.account_id</code>.
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cattle.volume.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cattle.volume.kind</code>.
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cattle.volume.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cattle.volume.uuid</code>.
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cattle.volume.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cattle.volume.description</code>.
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cattle.volume.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cattle.volume.state</code>.
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cattle.volume.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cattle.volume.created</code>.
	 */
	@Override
	public void setCreated(java.util.Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cattle.volume.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.util.Date getCreated() {
		return (java.util.Date) getValue(7);
	}

	/**
	 * Setter for <code>cattle.volume.removed</code>.
	 */
	@Override
	public void setRemoved(java.util.Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cattle.volume.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.util.Date getRemoved() {
		return (java.util.Date) getValue(8);
	}

	/**
	 * Setter for <code>cattle.volume.remove_time</code>.
	 */
	@Override
	public void setRemoveTime(java.util.Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cattle.volume.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.util.Date getRemoveTime() {
		return (java.util.Date) getValue(9);
	}

	/**
	 * Setter for <code>cattle.volume.data</code>.
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cattle.volume.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(10);
	}

	/**
	 * Setter for <code>cattle.volume.physical_size_mb</code>.
	 */
	@Override
	public void setPhysicalSizeMb(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cattle.volume.physical_size_mb</code>.
	 */
	@javax.persistence.Column(name = "physical_size_mb", precision = 19)
	@Override
	public java.lang.Long getPhysicalSizeMb() {
		return (java.lang.Long) getValue(11);
	}

	/**
	 * Setter for <code>cattle.volume.virtual_size_mb</code>.
	 */
	@Override
	public void setVirtualSizeMb(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cattle.volume.virtual_size_mb</code>.
	 */
	@javax.persistence.Column(name = "virtual_size_mb", precision = 19)
	@Override
	public java.lang.Long getVirtualSizeMb() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>cattle.volume.device_number</code>.
	 */
	@Override
	public void setDeviceNumber(java.lang.Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cattle.volume.device_number</code>.
	 */
	@javax.persistence.Column(name = "device_number", precision = 10)
	@Override
	public java.lang.Integer getDeviceNumber() {
		return (java.lang.Integer) getValue(13);
	}

	/**
	 * Setter for <code>cattle.volume.format</code>.
	 */
	@Override
	public void setFormat(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cattle.volume.format</code>.
	 */
	@javax.persistence.Column(name = "format", length = 255)
	@Override
	public java.lang.String getFormat() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>cattle.volume.allocation_state</code>.
	 */
	@Override
	public void setAllocationState(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cattle.volume.allocation_state</code>.
	 */
	@javax.persistence.Column(name = "allocation_state", length = 255)
	@Override
	public java.lang.String getAllocationState() {
		return (java.lang.String) getValue(15);
	}

	/**
	 * Setter for <code>cattle.volume.attached_state</code>.
	 */
	@Override
	public void setAttachedState(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>cattle.volume.attached_state</code>.
	 */
	@javax.persistence.Column(name = "attached_state", length = 255)
	@Override
	public java.lang.String getAttachedState() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>cattle.volume.instance_id</code>.
	 */
	@Override
	public void setInstanceId(java.lang.Long value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>cattle.volume.instance_id</code>.
	 */
	@javax.persistence.Column(name = "instance_id", precision = 19)
	@Override
	public java.lang.Long getInstanceId() {
		return (java.lang.Long) getValue(17);
	}

	/**
	 * Setter for <code>cattle.volume.image_id</code>.
	 */
	@Override
	public void setImageId(java.lang.Long value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>cattle.volume.image_id</code>.
	 */
	@javax.persistence.Column(name = "image_id", precision = 19)
	@Override
	public java.lang.Long getImageId() {
		return (java.lang.Long) getValue(18);
	}

	/**
	 * Setter for <code>cattle.volume.offering_id</code>.
	 */
	@Override
	public void setOfferingId(java.lang.Long value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>cattle.volume.offering_id</code>.
	 */
	@javax.persistence.Column(name = "offering_id", precision = 19)
	@Override
	public java.lang.Long getOfferingId() {
		return (java.lang.Long) getValue(19);
	}

	/**
	 * Setter for <code>cattle.volume.zone_id</code>.
	 */
	@Override
	public void setZoneId(java.lang.Long value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>cattle.volume.zone_id</code>.
	 */
	@javax.persistence.Column(name = "zone_id", precision = 19)
	@Override
	public java.lang.Long getZoneId() {
		return (java.lang.Long) getValue(20);
	}

	/**
	 * Setter for <code>cattle.volume.uri</code>.
	 */
	@Override
	public void setUri(java.lang.String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>cattle.volume.uri</code>.
	 */
	@javax.persistence.Column(name = "uri", length = 512)
	@Override
	public java.lang.String getUri() {
		return (java.lang.String) getValue(21);
	}

	/**
	 * Setter for <code>cattle.volume.external_id</code>.
	 */
	@Override
	public void setExternalId(java.lang.String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>cattle.volume.external_id</code>.
	 */
	@javax.persistence.Column(name = "external_id", length = 128)
	@Override
	public java.lang.String getExternalId() {
		return (java.lang.String) getValue(22);
	}

	/**
	 * Setter for <code>cattle.volume.host_id</code>.
	 */
	@Override
	public void setHostId(java.lang.Long value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>cattle.volume.host_id</code>.
	 */
	@javax.persistence.Column(name = "host_id", precision = 19)
	@Override
	public java.lang.Long getHostId() {
		return (java.lang.Long) getValue(23);
	}

	/**
	 * Setter for <code>cattle.volume.access_mode</code>.
	 */
	@Override
	public void setAccessMode(java.lang.String value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>cattle.volume.access_mode</code>.
	 */
	@javax.persistence.Column(name = "access_mode", length = 255)
	@Override
	public java.lang.String getAccessMode() {
		return (java.lang.String) getValue(24);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.cattle.platform.core.model.Volume from) {
		setId(from.getId());
		setName(from.getName());
		setAccountId(from.getAccountId());
		setKind(from.getKind());
		setUuid(from.getUuid());
		setDescription(from.getDescription());
		setState(from.getState());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
		setRemoveTime(from.getRemoveTime());
		setData(from.getData());
		setPhysicalSizeMb(from.getPhysicalSizeMb());
		setVirtualSizeMb(from.getVirtualSizeMb());
		setDeviceNumber(from.getDeviceNumber());
		setFormat(from.getFormat());
		setAllocationState(from.getAllocationState());
		setAttachedState(from.getAttachedState());
		setInstanceId(from.getInstanceId());
		setImageId(from.getImageId());
		setOfferingId(from.getOfferingId());
		setZoneId(from.getZoneId());
		setUri(from.getUri());
		setExternalId(from.getExternalId());
		setHostId(from.getHostId());
		setAccessMode(from.getAccessMode());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.cattle.platform.core.model.Volume> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VolumeRecord
	 */
	public VolumeRecord() {
		super(io.cattle.platform.core.model.tables.VolumeTable.VOLUME);
	}

	/**
	 * Create a detached, initialised VolumeRecord
	 */
	public VolumeRecord(java.lang.Long id, java.lang.String name, java.lang.Long accountId, java.lang.String kind, java.lang.String uuid, java.lang.String description, java.lang.String state, java.util.Date created, java.util.Date removed, java.util.Date removeTime, java.util.Map<String,Object> data, java.lang.Long physicalSizeMb, java.lang.Long virtualSizeMb, java.lang.Integer deviceNumber, java.lang.String format, java.lang.String allocationState, java.lang.String attachedState, java.lang.Long instanceId, java.lang.Long imageId, java.lang.Long offeringId, java.lang.Long zoneId, java.lang.String uri, java.lang.String externalId, java.lang.Long hostId, java.lang.String accessMode) {
		super(io.cattle.platform.core.model.tables.VolumeTable.VOLUME);

		setValue(0, id);
		setValue(1, name);
		setValue(2, accountId);
		setValue(3, kind);
		setValue(4, uuid);
		setValue(5, description);
		setValue(6, state);
		setValue(7, created);
		setValue(8, removed);
		setValue(9, removeTime);
		setValue(10, data);
		setValue(11, physicalSizeMb);
		setValue(12, virtualSizeMb);
		setValue(13, deviceNumber);
		setValue(14, format);
		setValue(15, allocationState);
		setValue(16, attachedState);
		setValue(17, instanceId);
		setValue(18, imageId);
		setValue(19, offeringId);
		setValue(20, zoneId);
		setValue(21, uri);
		setValue(22, externalId);
		setValue(23, hostId);
		setValue(24, accessMode);
	}
}
