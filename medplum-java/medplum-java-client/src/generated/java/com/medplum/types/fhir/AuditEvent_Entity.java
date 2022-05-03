package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableAuditEvent_Entity.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent_Entity {
  Optional<List<Extension>> extension();

  Optional<Reference> what();

  Optional<List<AuditEvent_Detail>> detail();

  Optional<String> name();

  Optional<Coding> type();

  Optional<Coding> role();

  Optional<List<Coding>> securityLabel();

  Optional<Coding> lifecycle();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<Base64Binary> query();

  static ImmutableAuditEvent_Entity.Builder builder() {
    return ImmutableAuditEvent_Entity.builder();
  }
}
