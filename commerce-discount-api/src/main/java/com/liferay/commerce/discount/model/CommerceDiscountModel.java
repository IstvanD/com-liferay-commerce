/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.discount.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The base model interface for the CommerceDiscount service. Represents a row in the &quot;CommerceDiscount&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.commerce.discount.model.impl.CommerceDiscountModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.commerce.discount.model.impl.CommerceDiscountImpl}.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceDiscount
 * @see com.liferay.commerce.discount.model.impl.CommerceDiscountImpl
 * @see com.liferay.commerce.discount.model.impl.CommerceDiscountModelImpl
 * @generated
 */
@ProviderType
public interface CommerceDiscountModel extends BaseModel<CommerceDiscount>,
	ShardedModel, StagedAuditedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce discount model instance should use the {@link CommerceDiscount} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce discount.
	 *
	 * @return the primary key of this commerce discount
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce discount.
	 *
	 * @param primaryKey the primary key of this commerce discount
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this commerce discount.
	 *
	 * @return the uuid of this commerce discount
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this commerce discount.
	 *
	 * @param uuid the uuid of this commerce discount
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the commerce discount ID of this commerce discount.
	 *
	 * @return the commerce discount ID of this commerce discount
	 */
	public long getCommerceDiscountId();

	/**
	 * Sets the commerce discount ID of this commerce discount.
	 *
	 * @param commerceDiscountId the commerce discount ID of this commerce discount
	 */
	public void setCommerceDiscountId(long commerceDiscountId);

	/**
	 * Returns the company ID of this commerce discount.
	 *
	 * @return the company ID of this commerce discount
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce discount.
	 *
	 * @param companyId the company ID of this commerce discount
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce discount.
	 *
	 * @return the user ID of this commerce discount
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce discount.
	 *
	 * @param userId the user ID of this commerce discount
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce discount.
	 *
	 * @return the user uuid of this commerce discount
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce discount.
	 *
	 * @param userUuid the user uuid of this commerce discount
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce discount.
	 *
	 * @return the user name of this commerce discount
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce discount.
	 *
	 * @param userName the user name of this commerce discount
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce discount.
	 *
	 * @return the create date of this commerce discount
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce discount.
	 *
	 * @param createDate the create date of this commerce discount
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce discount.
	 *
	 * @return the modified date of this commerce discount
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce discount.
	 *
	 * @param modifiedDate the modified date of this commerce discount
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this commerce discount.
	 *
	 * @return the title of this commerce discount
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this commerce discount.
	 *
	 * @param title the title of this commerce discount
	 */
	public void setTitle(String title);

	/**
	 * Returns the target of this commerce discount.
	 *
	 * @return the target of this commerce discount
	 */
	@AutoEscape
	public String getTarget();

	/**
	 * Sets the target of this commerce discount.
	 *
	 * @param target the target of this commerce discount
	 */
	public void setTarget(String target);

	/**
	 * Returns the use coupon code of this commerce discount.
	 *
	 * @return the use coupon code of this commerce discount
	 */
	public boolean getUseCouponCode();

	/**
	 * Returns <code>true</code> if this commerce discount is use coupon code.
	 *
	 * @return <code>true</code> if this commerce discount is use coupon code; <code>false</code> otherwise
	 */
	public boolean isUseCouponCode();

	/**
	 * Sets whether this commerce discount is use coupon code.
	 *
	 * @param useCouponCode the use coupon code of this commerce discount
	 */
	public void setUseCouponCode(boolean useCouponCode);

	/**
	 * Returns the coupon code of this commerce discount.
	 *
	 * @return the coupon code of this commerce discount
	 */
	@AutoEscape
	public String getCouponCode();

	/**
	 * Sets the coupon code of this commerce discount.
	 *
	 * @param couponCode the coupon code of this commerce discount
	 */
	public void setCouponCode(String couponCode);

	/**
	 * Returns the use percentage of this commerce discount.
	 *
	 * @return the use percentage of this commerce discount
	 */
	public boolean getUsePercentage();

	/**
	 * Returns <code>true</code> if this commerce discount is use percentage.
	 *
	 * @return <code>true</code> if this commerce discount is use percentage; <code>false</code> otherwise
	 */
	public boolean isUsePercentage();

	/**
	 * Sets whether this commerce discount is use percentage.
	 *
	 * @param usePercentage the use percentage of this commerce discount
	 */
	public void setUsePercentage(boolean usePercentage);

	/**
	 * Returns the maximum discount amount of this commerce discount.
	 *
	 * @return the maximum discount amount of this commerce discount
	 */
	public BigDecimal getMaximumDiscountAmount();

	/**
	 * Sets the maximum discount amount of this commerce discount.
	 *
	 * @param maximumDiscountAmount the maximum discount amount of this commerce discount
	 */
	public void setMaximumDiscountAmount(BigDecimal maximumDiscountAmount);

	/**
	 * Returns the level1 of this commerce discount.
	 *
	 * @return the level1 of this commerce discount
	 */
	public BigDecimal getLevel1();

	/**
	 * Sets the level1 of this commerce discount.
	 *
	 * @param level1 the level1 of this commerce discount
	 */
	public void setLevel1(BigDecimal level1);

	/**
	 * Returns the level2 of this commerce discount.
	 *
	 * @return the level2 of this commerce discount
	 */
	public BigDecimal getLevel2();

	/**
	 * Sets the level2 of this commerce discount.
	 *
	 * @param level2 the level2 of this commerce discount
	 */
	public void setLevel2(BigDecimal level2);

	/**
	 * Returns the level3 of this commerce discount.
	 *
	 * @return the level3 of this commerce discount
	 */
	public BigDecimal getLevel3();

	/**
	 * Sets the level3 of this commerce discount.
	 *
	 * @param level3 the level3 of this commerce discount
	 */
	public void setLevel3(BigDecimal level3);

	/**
	 * Returns the level4 of this commerce discount.
	 *
	 * @return the level4 of this commerce discount
	 */
	public BigDecimal getLevel4();

	/**
	 * Sets the level4 of this commerce discount.
	 *
	 * @param level4 the level4 of this commerce discount
	 */
	public void setLevel4(BigDecimal level4);

	/**
	 * Returns the limitation type of this commerce discount.
	 *
	 * @return the limitation type of this commerce discount
	 */
	@AutoEscape
	public String getLimitationType();

	/**
	 * Sets the limitation type of this commerce discount.
	 *
	 * @param limitationType the limitation type of this commerce discount
	 */
	public void setLimitationType(String limitationType);

	/**
	 * Returns the limitation times of this commerce discount.
	 *
	 * @return the limitation times of this commerce discount
	 */
	public int getLimitationTimes();

	/**
	 * Sets the limitation times of this commerce discount.
	 *
	 * @param limitationTimes the limitation times of this commerce discount
	 */
	public void setLimitationTimes(int limitationTimes);

	/**
	 * Returns the number of use of this commerce discount.
	 *
	 * @return the number of use of this commerce discount
	 */
	public int getNumberOfUse();

	/**
	 * Sets the number of use of this commerce discount.
	 *
	 * @param numberOfUse the number of use of this commerce discount
	 */
	public void setNumberOfUse(int numberOfUse);

	/**
	 * Returns the active of this commerce discount.
	 *
	 * @return the active of this commerce discount
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this commerce discount is active.
	 *
	 * @return <code>true</code> if this commerce discount is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this commerce discount is active.
	 *
	 * @param active the active of this commerce discount
	 */
	public void setActive(boolean active);

	/**
	 * Returns the display date of this commerce discount.
	 *
	 * @return the display date of this commerce discount
	 */
	public Date getDisplayDate();

	/**
	 * Sets the display date of this commerce discount.
	 *
	 * @param displayDate the display date of this commerce discount
	 */
	public void setDisplayDate(Date displayDate);

	/**
	 * Returns the expiration date of this commerce discount.
	 *
	 * @return the expiration date of this commerce discount
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this commerce discount.
	 *
	 * @param expirationDate the expiration date of this commerce discount
	 */
	public void setExpirationDate(Date expirationDate);

	/**
	 * Returns the last publish date of this commerce discount.
	 *
	 * @return the last publish date of this commerce discount
	 */
	public Date getLastPublishDate();

	/**
	 * Sets the last publish date of this commerce discount.
	 *
	 * @param lastPublishDate the last publish date of this commerce discount
	 */
	public void setLastPublishDate(Date lastPublishDate);

	/**
	 * Returns the status of this commerce discount.
	 *
	 * @return the status of this commerce discount
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this commerce discount.
	 *
	 * @param status the status of this commerce discount
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this commerce discount.
	 *
	 * @return the status by user ID of this commerce discount
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this commerce discount.
	 *
	 * @param statusByUserId the status by user ID of this commerce discount
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this commerce discount.
	 *
	 * @return the status by user uuid of this commerce discount
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this commerce discount.
	 *
	 * @param statusByUserUuid the status by user uuid of this commerce discount
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this commerce discount.
	 *
	 * @return the status by user name of this commerce discount
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this commerce discount.
	 *
	 * @param statusByUserName the status by user name of this commerce discount
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this commerce discount.
	 *
	 * @return the status date of this commerce discount
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this commerce discount.
	 *
	 * @param statusDate the status date of this commerce discount
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this commerce discount is approved.
	 *
	 * @return <code>true</code> if this commerce discount is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this commerce discount is denied.
	 *
	 * @return <code>true</code> if this commerce discount is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this commerce discount is a draft.
	 *
	 * @return <code>true</code> if this commerce discount is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this commerce discount is expired.
	 *
	 * @return <code>true</code> if this commerce discount is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this commerce discount is inactive.
	 *
	 * @return <code>true</code> if this commerce discount is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this commerce discount is incomplete.
	 *
	 * @return <code>true</code> if this commerce discount is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this commerce discount is pending.
	 *
	 * @return <code>true</code> if this commerce discount is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this commerce discount is scheduled.
	 *
	 * @return <code>true</code> if this commerce discount is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CommerceDiscount commerceDiscount);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommerceDiscount> toCacheModel();

	@Override
	public CommerceDiscount toEscapedModel();

	@Override
	public CommerceDiscount toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}