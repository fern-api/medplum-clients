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

  Optional<String> id();

  Optional<String> name();

  Optional<List<CodeableConcept>> role();

  Optional<Boolean> requestor();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<AuditEvent_Network> network();

  Optional<String> altId();

  Optional<CodeableConcept> type();

  Optional<Reference> location();

  Optional<List<Uri>> policy();

  Optional<List<CodeableConcept>> purposeOfUse();

  Optional<Coding> media();

  static ImmutableAuditEvent_Agent.Builder builder() {
    return ImmutableAuditEvent_Agent.builder();
  }
}
