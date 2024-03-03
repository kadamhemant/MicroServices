package com.hkadam.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/**
 * BaseEntity is a unified definition for a set of aspects, such as the creation time,
 * the creator, the update time, and the updater, which are common to multiple 
 * persistent entities by using the `@MappedSuperclass` annotation.
 * This makes it possible to define these properties in one place and have them mapped in table(s) represented by subclasses. 
 *
 * It uses Lombok annotations for automatically generating getter and setter methods and a 
 * `toString` method. Also, Jakarta Persistence 3.0 (JPA) Annotations are used for the ORM mapping of the fields that this class defines.
 *
 * It's important to note that `createdAt`, `createdBy` fields are only updatable at a row creation time 
 * and `updatedAt`, `UpdatedBy` fields are only updated while a row update operation is performed.
 *
 * @author Your Name
 *
 * @see jakarta.persistence.MappedSuperclass
 * @see lombok.Getter
 * @see lombok.Setter
 * @see lombok.ToString
 */
@MappedSuperclass
@Getter
@Setter
@ToString
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    /**
     * The date and time at which this entity was created.
     * This field is not updatable once the entity is stored.
     */
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    /**
     * The identifier/username of the user who created this entity.
     * This field is not updatable once the entity is stored.
     */
    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    /**
     * The date and time at which this entity was last updated.
     * This field is not insertable when the entity is being created.
     */
   @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    /**
     * The identifier/username of the last user who updated this entity.
     * This field is not insertable when the entity is being created.
     */
    @LastModifiedBy
    @Column(insertable = false)
    private String UpdatedBy;
}