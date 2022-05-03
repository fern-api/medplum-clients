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
    as = ImmutableAuditEvent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent {
  List<AuditEvent_Agent> agent();

  Optional<AuditeventAction> action();

  Optional<String> outcomeDesc();

  Optional<AuditeventOutcome> outcome();

  String resourceType();

  Optional<Period> period();

  Optional<Meta> meta();

  Optional<Instant> recorded();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  AuditEvent_Source source();

  Optional<List<AuditEvent_Entity>> entity();

  Optional<List<CodeableConcept>> purposeOfEvent();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Extension>> modifierExtension();

  Coding type();

  Optional<Id> id();

  Optional<List<Coding>> subtype();

  static ImmutableAuditEvent.ResourceTypeBuildStage builder() {
    return ImmutableAuditEvent.builder();
  }
}
