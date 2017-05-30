/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "storage_pool", schema = "cattle")
public interface StoragePool extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.storage_pool.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.storage_pool.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.storage_pool.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.storage_pool.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.storage_pool.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.storage_pool.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.storage_pool.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.storage_pool.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.storage_pool.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.storage_pool.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.storage_pool.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.storage_pool.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.storage_pool.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.storage_pool.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.storage_pool.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.storage_pool.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.storage_pool.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.storage_pool.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.storage_pool.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.storage_pool.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.storage_pool.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.storage_pool.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.storage_pool.physical_total_size_mb</code>.
	 */
	public void setPhysicalTotalSizeMb(java.lang.Long value);

	/**
	 * Getter for <code>cattle.storage_pool.physical_total_size_mb</code>.
	 */
	@javax.persistence.Column(name = "physical_total_size_mb", precision = 19)
	public java.lang.Long getPhysicalTotalSizeMb();

	/**
	 * Setter for <code>cattle.storage_pool.virtual_total_size_mb</code>.
	 */
	public void setVirtualTotalSizeMb(java.lang.Long value);

	/**
	 * Getter for <code>cattle.storage_pool.virtual_total_size_mb</code>.
	 */
	@javax.persistence.Column(name = "virtual_total_size_mb", precision = 19)
	public java.lang.Long getVirtualTotalSizeMb();

	/**
	 * Setter for <code>cattle.storage_pool.external</code>.
	 */
	public void setExternal(java.lang.Boolean value);

	/**
	 * Getter for <code>cattle.storage_pool.external</code>.
	 */
	@javax.persistence.Column(name = "external", nullable = false, precision = 1)
	public java.lang.Boolean getExternal();

	/**
	 * Setter for <code>cattle.storage_pool.agent_id</code>.
	 */
	public void setAgentId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.storage_pool.agent_id</code>.
	 */
	@javax.persistence.Column(name = "agent_id", precision = 19)
	public java.lang.Long getAgentId();

	/**
	 * Setter for <code>cattle.storage_pool.external_id</code>.
	 */
	public void setExternalId(java.lang.String value);

	/**
	 * Getter for <code>cattle.storage_pool.external_id</code>.
	 */
	@javax.persistence.Column(name = "external_id", length = 128)
	public java.lang.String getExternalId();

	/**
	 * Setter for <code>cattle.storage_pool.driver_name</code>.
	 */
	public void setDriverName(java.lang.String value);

	/**
	 * Getter for <code>cattle.storage_pool.driver_name</code>.
	 */
	@javax.persistence.Column(name = "driver_name", length = 255)
	public java.lang.String getDriverName();

	/**
	 * Setter for <code>cattle.storage_pool.volume_access_mode</code>.
	 */
	public void setVolumeAccessMode(java.lang.String value);

	/**
	 * Getter for <code>cattle.storage_pool.volume_access_mode</code>.
	 */
	@javax.persistence.Column(name = "volume_access_mode", length = 255)
	public java.lang.String getVolumeAccessMode();

	/**
	 * Setter for <code>cattle.storage_pool.storage_driver_id</code>.
	 */
	public void setStorageDriverId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.storage_pool.storage_driver_id</code>.
	 */
	@javax.persistence.Column(name = "storage_driver_id", precision = 19)
	public java.lang.Long getStorageDriverId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface StoragePool
	 */
	public void from(io.cattle.platform.core.model.StoragePool from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface StoragePool
	 */
	public <E extends io.cattle.platform.core.model.StoragePool> E into(E into);
}
