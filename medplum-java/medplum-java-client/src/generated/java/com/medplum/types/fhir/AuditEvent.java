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
  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<AuditeventAction> action();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Coding>> subtype();

  Coding type();

  String resourceType();

  Optional<Period> period();

  Optional<Instant> recorded();

  List<AuditEvent_Agent> agent();

  Optional<AuditeventOutcome> outcome();

  Optional<List<Extension>> extension();

  AuditEvent_Source source();

  Optional<List<CodeableConcept>> purposeOfEvent();

  Optional<Code> language();

  Optional<String> outcomeDesc();

  Optional<List<AuditEvent_Entity>> entity();

  Optional<List<ResourceList>> contained();

  static ImmutableAuditEvent.TypeBuildStage builder() {
    return ImmutableAuditEvent.builder();
  }
}
