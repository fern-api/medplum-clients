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
  Optional<List<Extension>> modifierExtension();

  Optional<List<Coding>> securityLabel();

  Optional<String> description();

  Optional<String> name();

  Optional<Reference> what();

  Optional<String> id();

  Optional<Coding> type();

  Optional<List<Extension>> extension();

  Optional<Coding> role();

  Optional<Base64Binary> query();

  Optional<Coding> lifecycle();

  Optional<List<AuditEvent_Detail>> detail();

  static ImmutableAuditEvent_Entity.Builder builder() {
    return ImmutableAuditEvent_Entity.builder();
  }
}
