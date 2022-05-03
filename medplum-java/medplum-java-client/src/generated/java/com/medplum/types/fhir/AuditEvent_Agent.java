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
  Optional<String> altId();

  Optional<List<Uri>> policy();

  Optional<AuditEvent_Network> network();

  Optional<String> id();

  Optional<List<CodeableConcept>> purposeOfUse();

  Optional<Reference> who();

  Optional<Coding> media();

  Optional<List<CodeableConcept>> role();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> type();

  Optional<Boolean> requestor();

  Optional<Reference> location();

  static ImmutableAuditEvent_Agent.Builder builder() {
    return ImmutableAuditEvent_Agent.builder();
  }
}
