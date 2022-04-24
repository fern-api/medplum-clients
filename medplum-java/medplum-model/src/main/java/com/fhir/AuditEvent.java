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
    as = ImmutableAuditEvent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AuditEvent {
  Optional<List<CodeableConcept>> purposeOfEvent();

  Optional<uri> implicitRules();

  Optional<code> language();

  Optional<String> outcomeDesc();

  AuditEvent_Source source();

  Optional<id> id();

  Optional<List<Extension>> extension();

  Optional<List<Coding>> subtype();

  Optional<List<AuditEvent_Entity>> entity();

  String resourceType();

  Optional<AuditeventOutcome> outcome();

  Optional<instant> recorded();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<AuditeventAction> action();

  Optional<Period> period();

  List<AuditEvent_Agent> agent();

  Coding type();

  Optional<List<ResourceList>> contained();

  static ImmutableAuditEvent.SourceBuildStage builder() {
    return ImmutableAuditEvent.builder();
  }
}
