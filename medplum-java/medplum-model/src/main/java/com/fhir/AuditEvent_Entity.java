package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<Coding> role();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> securityLabel();

  Optional<Coding> type();

  Optional<List<AuditEvent_Detail>> detail();

  Optional<String> name();

  Optional<Reference> what();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<String> id();

  Optional<base64Binary> query();

  Optional<Coding> lifecycle();

  static ImmutableAuditEvent_Entity.Builder builder() {
    return ImmutableAuditEvent_Entity.builder();
  }
}
