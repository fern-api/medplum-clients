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
  Optional<Base64Binary> query();

  Optional<Reference> what();

  Optional<Coding> role();

  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Coding>> securityLabel();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<AuditEvent_Detail>> detail();

  Optional<Coding> type();

  Optional<String> description();

  Optional<Coding> lifecycle();

  static ImmutableAuditEvent_Entity.Builder builder() {
    return ImmutableAuditEvent_Entity.builder();
  }
}
