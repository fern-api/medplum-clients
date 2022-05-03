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
    as = ImmutableProvenance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Provenance {
  Optional<Uri> implicitRules();

  List<Provenance_Agent> agent();

  Optional<List<Signature>> signature();

  Optional<Code> language();

  Optional<List<Provenance_Entity>> entity();

  Optional<List<Uri>> policy();

  Optional<List<CodeableConcept>> reason();

  List<Reference> target();

  Optional<Reference> location();

  Optional<Instant> recorded();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> activity();

  String resourceType();

  Optional<Id> id();

  Optional<Period> occurredPeriod();

  Optional<String> occurredDateTime();

  static ImmutableProvenance.ResourceTypeBuildStage builder() {
    return ImmutableProvenance.builder();
  }
}
