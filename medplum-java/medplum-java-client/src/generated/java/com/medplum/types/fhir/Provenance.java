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
  Optional<List<CodeableConcept>> reason();

  String resourceType();

  Optional<Period> occurredPeriod();

  Optional<Uri> implicitRules();

  List<Reference> target();

  List<Provenance_Agent> agent();

  Optional<Instant> recorded();

  Optional<List<Uri>> policy();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Signature>> signature();

  Optional<Code> language();

  Optional<String> occurredDateTime();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> location();

  Optional<Narrative> text();

  Optional<CodeableConcept> activity();

  Optional<List<Extension>> extension();

  Optional<List<Provenance_Entity>> entity();

  static ImmutableProvenance.ResourceTypeBuildStage builder() {
    return ImmutableProvenance.builder();
  }
}
