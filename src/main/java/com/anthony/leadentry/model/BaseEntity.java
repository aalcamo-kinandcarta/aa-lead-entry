package com.anthony.leadentry.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
public class BaseEntity {

    @Column(name="created_by_user_id")
    private UUID createdById;

    @Column(name="modified_by_user_id")
    private UUID modifiedById;

    @Column(name="created_date")
    private OffsetDateTime createdByDate;

    @Column(name="modified_date")
    private OffsetDateTime modifiedByDate;
}
