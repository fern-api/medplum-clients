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
  Optional<List<Extension>> modifierExtension();

  Optional<Reference> location();

  Optional<AuditEvent_Network> network();

  Optional<String> altId();

  Optional<String> name();

  Optional<CodeableConcept> type();

  Optional<Reference> who();

  Optional<Boolean> requestor();

  Optional<List<CodeableConcept>> purposeOfUse();

  Optional<String> id();

  Optional<List<CodeableConcept>> role();

  Optional<Coding> media();

  Optional<List<Extension>> extension();

  Optional<List<Uri>> policy();

  static ImmutableAuditEvent_Agent.Builder builder() {
    return ImmutableAuditEvent_Agent.builder();
  }
}
