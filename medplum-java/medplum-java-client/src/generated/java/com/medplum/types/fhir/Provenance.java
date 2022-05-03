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
  Optional<Period> occurredPeriod();

  List<Provenance_Agent> agent();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<String> occurredDateTime();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<Instant> recorded();

  Optional<List<Uri>> policy();

  List<Reference> target();

  Optional<List<CodeableConcept>> reason();

  Optional<CodeableConcept> activity();

  Optional<List<Extension>> extension();

  Optional<List<Provenance_Entity>> entity();

  Optional<List<Signature>> signature();

  String resourceType();

  Optional<Reference> location();

  static ImmutableProvenance.ResourceTypeBuildStage builder() {
    return ImmutableProvenance.builder();
  }
}
