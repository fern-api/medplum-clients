package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableAuditEvent_Agent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent_Agent {
  Optional<List<Extension>> extension();

  Optional<Boolean> requestor();

  Optional<Coding> media();

  Optional<List<Extension>> modifierExtension();

  Optional<AuditEvent_Network> network();

  Optional<String> id();

  Optional<String> altId();

  Optional<List<uri>> policy();

  Optional<List<CodeableConcept>> role();

  Optional<CodeableConcept> type();

  Optional<Reference> who();

  Optional<String> name();

  Optional<List<CodeableConcept>> purposeOfUse();

  Optional<Reference> location();

  static ImmutableAuditEvent_Agent.Builder builder() {
    return ImmutableAuditEvent_Agent.builder();
  }
}
