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
  AuditEvent_Source source();

  Optional<List<CodeableConcept>> purposeOfEvent();

  String resourceType();

  Optional<Period> period();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Coding type();

  List<AuditEvent_Agent> agent();

  Optional<Code> language();

  Optional<String> outcomeDesc();

  Optional<List<AuditEvent_Entity>> entity();

  Optional<Meta> meta();

  Optional<Instant> recorded();

  Optional<AuditeventOutcome> outcome();

  Optional<List<Coding>> subtype();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<AuditeventAction> action();

  static ImmutableAuditEvent.SourceBuildStage builder() {
    return ImmutableAuditEvent.builder();
  }
}
