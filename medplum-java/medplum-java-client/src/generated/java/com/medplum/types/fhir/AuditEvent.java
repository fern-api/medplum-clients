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
  Optional<Narrative> text();

  Optional<List<CodeableConcept>> purposeOfEvent();

  Optional<String> outcomeDesc();

  Optional<Uri> implicitRules();

  Optional<List<AuditEvent_Entity>> entity();

  AuditEvent_Source source();

  Optional<List<Coding>> subtype();

  Optional<Period> period();

  List<AuditEvent_Agent> agent();

  Optional<Instant> recorded();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<AuditeventOutcome> outcome();

  Optional<Id> id();

  Optional<Code> language();

  Coding type();

  Optional<List<Extension>> modifierExtension();

  Optional<AuditeventAction> action();

  Optional<List<ResourceList>> contained();

  static ImmutableAuditEvent.SourceBuildStage builder() {
    return ImmutableAuditEvent.builder();
  }
}
