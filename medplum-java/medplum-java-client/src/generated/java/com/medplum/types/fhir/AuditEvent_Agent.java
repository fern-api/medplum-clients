package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Reference> who();

  Optional<Reference> location();

  Optional<String> id();

  Optional<Coding> media();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> requestor();

  Optional<List<CodeableConcept>> purposeOfUse();

  Optional<List<CodeableConcept>> role();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<String> altId();

  Optional<AuditEvent_Network> network();

  Optional<List<Uri>> policy();

  static ImmutableAuditEvent_Agent.Builder builder() {
    return ImmutableAuditEvent_Agent.builder();
  }
}
