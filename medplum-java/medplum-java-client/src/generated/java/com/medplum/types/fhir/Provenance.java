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
  Optional<List<ResourceList>> contained();

  Optional<String> occurredDateTime();

  Optional<List<CodeableConcept>> reason();

  Optional<Meta> meta();

  Optional<Narrative> text();

  String resourceType();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> activity();

  List<Provenance_Agent> agent();

  Optional<List<Uri>> policy();

  Optional<Instant> recorded();

  Optional<List<Signature>> signature();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> location();

  Optional<Uri> implicitRules();

  Optional<Period> occurredPeriod();

  Optional<List<Provenance_Entity>> entity();

  Optional<Code> language();

  List<Reference> target();

  static ImmutableProvenance.ResourceTypeBuildStage builder() {
    return ImmutableProvenance.builder();
  }
}
